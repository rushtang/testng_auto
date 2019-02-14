package lib.rpc;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import config.ClientEntity;
import org.apache.commons.codec.digest.DigestUtils;
import config.ClientConfig;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.fasterxml.jackson.databind.*;
import lib.util.*;
import java.net.*;
import java.io.*;

//    获取当前编码格式 System.out.println("\n"+System.getProperty("file.encoding")+"\n");


public class RpcClient {

    private ClientEntity clientEntity;
    public  ObjectMapper objmapper;



    public RpcClient(String ConfigPath){

        clientEntity =new YamlUtil().toyamlobject(ConfigPath, ClientEntity.class);
        this.objmapper=new ObjectMapper();


    }

    public ArrayNode createparams(){
        ArrayNode params = objmapper.createArrayNode();

        return params;

    }

    public ObjectNode createparam(){
        ObjectNode param = objmapper.createObjectNode();
        return param;

    }

    public <T> T getEntity(String Path, Class<T> valueType){
        try {
            return objmapper.readValue(new File(Path), valueType);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String nodetostring(JsonNode response){
        try {
            return  objmapper.writeValueAsString(response);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public JsonNode stringtonode(String json){
        try {
            return  objmapper.readTree(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }



    public Response rpccall(String classname,String method,ArrayNode params){

        byte[] data=this.rpc_data(classname,method,params, clientEntity);
        String response="";
        Socket client=new Socket();

        try {
            client = new Socket(clientEntity.getIp(), clientEntity.getPort());

            OutputStream out =client.getOutputStream();
            out.write(data);

            System.out.println("\n远程主机地址:" + client.getRemoteSocketAddress());
            BufferedReader in =new BufferedReader(new InputStreamReader(client.getInputStream(),"utf-8"));

            String mString = "";
            while((mString = in.readLine()) != null) {
                response=response+mString;
            }

            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Response res=new Response();
        //去掉返回字符串中的长度前缀
        String [] tmpresponse=response.split("^(\\d+)");

        if (tmpresponse.length>1){
            response=tmpresponse[1];
            res.set_node(response);
        }

        res.set_str(response);

        return res;

    }


    byte[] rpc_data(String classname, String method, ArrayNode params, ClientEntity clientEntity){

        ObjectMapper mapper = new ObjectMapper();

        String user=clientEntity.getUser();
        String secret=clientEntity.getSecret();

        //md5加密
        String password=DigestUtils.md5Hex(user+':'+secret);
        String rpc_secret_key= clientEntity.getRpc_secret_key();
        long now_time=System.currentTimeMillis();

        ObjectNode objectnode = mapper.createObjectNode();

        objectnode.put("version","2.0");
        objectnode.put("user",user);
        objectnode.put("password",password);
        objectnode.put("timestamp",now_time);
        objectnode.put("class","RpcClient_"+classname);
        objectnode.put("method",method);


        objectnode.put("params",params);


        String rpcdata="";
        try {
            String data=mapper.writeValueAsString(objectnode);
            ObjectNode packet_json=mapper.createObjectNode();
            packet_json.put("data",data);

            String signature_init=data+"&"+rpc_secret_key;

            String signature=DigestUtils.md5Hex(signature_init);
            packet_json.put("signature",signature);

            String packet=mapper.writeValueAsString(packet_json);


            System.out.printf(packet);
            //数据加上前缀(RPC 文本请求协议)
            rpcdata= String.format("%s\n%S\n%s\n%s\n","3","RPC",Integer.toString(packet.length()),packet);




        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        byte[] rpcdatabytes= new byte[0];
        try {
            rpcdatabytes = rpcdata.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return rpcdatabytes ;


    }

    public static void main(String[] args){
        RpcClient rpc =new RpcClient(ClientConfig.getProduct());

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode params1 = mapper.createObjectNode();
        ArrayNode params= mapper.createArrayNode();

        params1.put("sku_no","100181");
        params1.put("quantity",60);
        params.add(params1);


        JsonNode response=rpc.rpccall("JumeiProduct_Write_ProductInventory","refundProductInventoryOrdered",params).get_node();

    }

}


