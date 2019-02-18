package com.hp.shop.dao;


import generator.entity.Productimage;
import generator.entity.ProductimageExample;
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
public interface ProductimageMapper {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    long countByExample(ProductimageExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    int deleteByExample(ProductimageExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    int deleteByPrimaryKey(Integer pi_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    int insert(Productimage record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    int insertSelective(Productimage record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    List<Productimage> selectByExample(ProductimageExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    Productimage selectByPrimaryKey(Integer pi_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    int updateByExampleSelective(@Param("record") Productimage record, @Param("example") ProductimageExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    int updateByExample(@Param("record") Productimage record, @Param("example") ProductimageExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    int updateByPrimaryKeySelective(Productimage record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    int updateByPrimaryKey(Productimage record);
}