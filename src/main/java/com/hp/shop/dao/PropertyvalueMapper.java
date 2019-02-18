package com.hp.shop.dao;

import generator.entity.Propertyvalue;
import generator.entity.PropertyvalueExample;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

@Mapper
public interface PropertyvalueMapper {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    long countByExample(PropertyvalueExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    int deleteByExample(PropertyvalueExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    int deleteByPrimaryKey(Integer prova_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    int insert(Propertyvalue record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    int insertSelective(Propertyvalue record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    List<Propertyvalue> selectByExample(PropertyvalueExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    Propertyvalue selectByPrimaryKey(Integer prova_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    int updateByExampleSelective(@Param("record") Propertyvalue record, @Param("example") PropertyvalueExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    int updateByExample(@Param("record") Propertyvalue record, @Param("example") PropertyvalueExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    int updateByPrimaryKeySelective(Propertyvalue record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    int updateByPrimaryKey(Propertyvalue record);
}