package com.hp.shop.dao;

import generator.entity.Review;
import generator.entity.ReviewExample;
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
public interface ReviewMapper {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    long countByExample(ReviewExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    int deleteByExample(ReviewExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    int deleteByPrimaryKey(Integer r_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    int insert(Review record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    int insertSelective(Review record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    List<Review> selectByExampleWithBLOBs(ReviewExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    List<Review> selectByExample(ReviewExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    Review selectByPrimaryKey(Integer r_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    int updateByExampleSelective(@Param("record") Review record, @Param("example") ReviewExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Review record, @Param("example") ReviewExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    int updateByExample(@Param("record") Review record, @Param("example") ReviewExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    int updateByPrimaryKeySelective(Review record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Review record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    int updateByPrimaryKey(Review record);
}