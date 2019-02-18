package com.hp.shop.dao;

import generator.entity.Customer;
import generator.entity.CustomerExample;
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
public interface CustomerMapper {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    long countByExample(CustomerExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    int deleteByExample(CustomerExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    int deleteByPrimaryKey(Short customer_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    int insert(Customer record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    int insertSelective(Customer record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    List<Customer> selectByExample(CustomerExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    Customer selectByPrimaryKey(Short customer_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    int updateByPrimaryKeySelective(Customer record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    int updateByPrimaryKey(Customer record);
}