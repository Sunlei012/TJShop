package com.hp.shop.dao;

import generator.entity.Order;
import generator.entity.OrderExample;
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
public interface OrderMapper {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    long countByExample(OrderExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    int deleteByExample(OrderExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    int deleteByPrimaryKey(String order_Id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    int insert(Order record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    int insertSelective(Order record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    List<Order> selectByExample(OrderExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    Order selectByPrimaryKey(String order_Id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    int updateByPrimaryKey(Order record);
}