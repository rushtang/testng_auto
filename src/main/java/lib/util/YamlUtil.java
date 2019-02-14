package lib.util;

import java.io.*;

import config.ClientEntity;
import org.yaml.snakeyaml.Yaml;
import com.google.gson.*;

public class YamlUtil {

    public final static Yaml yaml=new Yaml();

    public  <T> T toyamlobject(String Path,Class<T> clazz) {


        InputStream conf= null;
        try {
            conf = new FileInputStream(Path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        T obj=yaml.loadAs(conf,clazz);

        return obj;

    }

    public  void print(String Path)  {
//        String Path=System.getProperty("user.dir");

        ClientEntity clientEntity = this.toyamlobject(Path, ClientEntity.class);

        String conf_json=new Gson().toJson(clientEntity);

        System.out.println(conf_json);

    }


    public static void main(String[] args){
        String Path="/Users/tmh/Documents/apiautotest/config/ClientEntity.yaml";
        new YamlUtil().print(Path);


    }



}
