package com.hp.shop.dao;

import generator.entity.Cart;
import generator.entity.CartExample;
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
public interface CartMapper {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    long countByExample(CartExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    int deleteByExample(CartExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    int deleteByPrimaryKey(Integer cart_Id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    int insert(Cart record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    int insertSelective(Cart record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    List<Cart> selectByExample(CartExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    Cart selectByPrimaryKey(Integer cart_Id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    int updateByExampleSelective(@Param("record") Cart record, @Param("example") CartExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    int updateByExample(@Param("record") Cart record, @Param("example") CartExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    int updateByPrimaryKeySelective(Cart record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    int updateByPrimaryKey(Cart record);
}