package com.hp.shop.dao;

import generator.entity.Category;
import generator.entity.CategoryExample;
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
public interface CategoryMapper {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    long countByExample(CategoryExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    int deleteByExample(CategoryExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    int deleteByPrimaryKey(Byte category_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    int insert(Category record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    int insertSelective(Category record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    List<Category> selectByExample(CategoryExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    Category selectByPrimaryKey(Byte category_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    int updateByPrimaryKey(Category record);
}