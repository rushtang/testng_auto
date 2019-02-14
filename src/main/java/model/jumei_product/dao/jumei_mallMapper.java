package model.jumei_product.dao;

import model.jumei_product.pojo.jumei_mall;

public interface jumei_mallMapper {
    int deleteByPrimaryKey(Integer mallId);

    int insert(jumei_mall record);

    int insertSelective(jumei_mall record);

    jumei_mall selectByPrimaryKey(Integer mallId);

    int updateByPrimaryKeySelective(jumei_mall record);

    int updateByPrimaryKey(jumei_mall record);
}