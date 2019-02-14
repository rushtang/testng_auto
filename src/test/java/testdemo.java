import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.rits.cloning.Cloner;
import data.operationEntity.JerpWriteDeal_Save_Entity;
import lib.BaseTest;
import model.jumei_product.pojo.*;
import org.testng.annotations.*;
import com.github.fge.jsonschema.*;
import com.github.fge.jackson.JsonLoader;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.AssertJUnit.assertEquals;


public class testdemo extends BaseTest {

    JerpWriteDeal_Save_Entity param1Entitydemo;
    String hash_id="";
    String product_id="";
    String sku_no="";




    @BeforeClass
    void setup(){
        String Path=testdemo.class.getClassLoader().getResource("data/request_args/operation/JerpWriteDeal_Save_arg1.json").getPath();
        param1Entitydemo=rpc.getEntity(Path, JerpWriteDeal_Save_Entity.class);


    }



    @DataProvider(name="args")
    public Object[][] args(){
        ObjectNode param2 = (ObjectNode)rpc.stringtonode("{\"sale_mode\":\"retail\",\"web_publish\":\"false\"}");
        String param3 = "ceshi20";


        //001
        JerpWriteDeal_Save_Entity param1Entity001=new Cloner().deepClone(param1Entitydemo);
        ArrayNode params001 = rpc.createparams();
        param1Entity001.setStatus(2);
        param1Entity001.setStart_time("1546407591");
        param1Entity001.setEnd_time("1557664962");
        ObjectNode param1_001 = rpc.objmapper.valueToTree(param1Entity001);


        params001.add(param1_001);
        params001.add(param2);
        params001.add(param3);


        //002
        JerpWriteDeal_Save_Entity param1Entity002=new Cloner().deepClone(param1Entitydemo);
        ArrayNode params002 = rpc.createparams();
        param1Entity002.setStatus(1);
        param1Entity002.setStart_time("1552445767");
        param1Entity002.setEnd_time("1565664967");

        ObjectNode param1_002 = rpc.objmapper.valueToTree(param1Entity002);


        params002.add(param1_002);
        params002.add(param2);
        params002.add(param3);


        return new Object[][]{
                {params001,param1Entity001},
                {params002,param1Entity002}
        };
    }




    @Test(dataProvider="args")
    public void testCase( ArrayNode params,JerpWriteDeal_Save_Entity param1Entity){

        JsonNode response = rpc.rpccall("Operation_Jerp_Write_Deal", "save", params).get_node();

        hash_id=response.get("data").get("hash_id").textValue();
        product_id=param1Entity.getProduct_id();
        sku_no=param1Entity.getRelationships().get(0).getSku_no();

        tuanmei_deals tdEntity=db_jp.td_mapper.selectOneByExample(db_jp.td_Criteria.andHashIdEqualTo(hash_id).example());


        assertThat(tdEntity.getStatus().intValue()).isEqualTo(param1Entity.getStatus());
        assertThat(tdEntity.getCategory()).isEqualTo(param1Entity.getCategory());

    }

    @AfterMethod
    public void teardown(){
        if (!hash_id.isEmpty()){
            db_to.jdp_mapper.deleteByExample(db_to.jdp_Criteria.andHashIdEqualTo(hash_id).example());
            db_jp.td_mapper.deleteByExample(db_jp.td_Criteria.andHashIdEqualTo(hash_id).example());
            db_jp.tpi_mapper.deleteByExample(db_jp.tpi_Criteria.andSkuNoEqualTo(sku_no).example());

        }


//        db_jp.td_mapper.updateByExampleSelective(
//                tuanmei_deals.builder().brandId(34).build(),
//                db_jp.td_Criteria.andHashIdEqualTo(hash_id).example()
//        );
//


    }

}
