package lib;

import config.ClientConfig;
import lib.rpc.RpcClient;
import model.jumei_product.dao.*;
import model.tuanmei_operation.dao.*;
import model.jumei_product.pojo.*;
import model.tuanmei_operation.pojo.*;

import java.lang.reflect.InvocationTargetException;


public class BaseTest {


    public  static  RpcClient rpc = new RpcClient(ClientConfig.getOperation());



    public static class db_jp{
        public  static Db db =new Db();

        public  static tuanmei_dealsMapper td_mapper=db.getMapper(tuanmei_dealsMapper.class);
        public  static tuanmei_dealsExample.Criteria td_Criteria=tuanmei_dealsExample.newAndCreateCriteria();

        public  static jumei_mallMapper jm_mapper=db.getMapper(jumei_mallMapper.class);
        public  static jumei_tagMapper jt_mapper=db.getMapper(jumei_tagMapper.class);

        public  static tuanmei_product_inventoryMapper tpi_mapper= db.getMapper(tuanmei_product_inventoryMapper.class);
        public  static tuanmei_product_inventoryExample.Criteria tpi_Criteria=tuanmei_product_inventoryExample.newAndCreateCriteria();


    }

    public static class  db_to{
        public  static Db db =new Db("rd_tuanmei_operation");

        public static jumei_deals_pluginMapper jdp_mapper=db.getMapper(jumei_deals_pluginMapper.class);
        public  static jumei_deals_pluginExample.Criteria jdp_Criteria=jumei_deals_pluginExample.newAndCreateCriteria();


        public static jumei_mall_draftMapper jmd_mapper=db.getMapper(jumei_mall_draftMapper.class);

    }





}
