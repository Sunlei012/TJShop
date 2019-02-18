package com.hp.shop.dao;

import generator.entity.Orderitem;
import generator.entity.OrderitemExample;
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
public interface OrderitemMapper {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    long countByExample(OrderitemExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    int deleteByExample(OrderitemExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    int deleteByPrimaryKey(Integer or_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    int insert(Orderitem record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    int insertSelective(Orderitem record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    List<Orderitem> selectByExample(OrderitemExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    Orderitem selectByPrimaryKey(Integer or_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    int updateByExampleSelective(@Param("record") Orderitem record, @Param("example") OrderitemExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    int updateByExample(@Param("record") Orderitem record, @Param("example") OrderitemExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    int updateByPrimaryKeySelective(Orderitem record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    int updateByPrimaryKey(Orderitem record);
}