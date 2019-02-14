package lib;

import model.jumei_product.dao.tuanmei_dealsMapper;
import model.jumei_product.pojo.tuanmei_deals;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionManager;

import java.io.Reader;


public class Db {
    private static SqlSession session;


    public  Db(){
        setsession("rd_jumei_product");
    }
    public  Db(String environment){
        setsession(environment);
    }


    public static void setsession(String environment) {
        try{
            Reader reader  = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
            session = SqlSessionManager.newInstance(reader,environment);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public  SqlSession getsession(){
        return session;
    }


    public <T> T getMapper(Class<T> var1){
        return session.getMapper(var1);
    }


    public static void main(String[] args) {
        SqlSession session = new Db().getsession();

        tuanmei_dealsMapper td_mapper=session.getMapper(tuanmei_dealsMapper.class);
        tuanmei_deals tdEntity=td_mapper.selectByPrimaryKey(11);
        System.out.println(tdEntity.getBrandId());
        System.out.println(tdEntity.getCategory());

        tuanmei_deals td1=new tuanmei_deals();

    }

}

