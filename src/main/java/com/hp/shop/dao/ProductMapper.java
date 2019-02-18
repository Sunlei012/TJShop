package com.hp.shop.dao;

import generator.entity.Product;
import generator.entity.ProductExample;
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
public interface ProductMapper {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    long countByExample(ProductExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    int deleteByExample(ProductExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    int deleteByPrimaryKey(Integer p_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    int insert(Product record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    int insertSelective(Product record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    List<Product> selectByExample(ProductExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    Product selectByPrimaryKey(Integer p_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    int updateByPrimaryKey(Product record);
}