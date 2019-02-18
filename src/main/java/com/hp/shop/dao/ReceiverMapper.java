package com.hp.shop.dao;

import generator.entity.Receiver;
import generator.entity.ReceiverExample;
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
public interface ReceiverMapper {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    long countByExample(ReceiverExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    int deleteByExample(ReceiverExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    int deleteByPrimaryKey(Integer re_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    int insert(Receiver record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    int insertSelective(Receiver record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    List<Receiver> selectByExample(ReceiverExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    Receiver selectByPrimaryKey(Integer re_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") Receiver record, @Param("example") ReceiverExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    int updateByExample(@Param("record") Receiver record, @Param("example") ReceiverExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    int updateByPrimaryKeySelective(Receiver record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    int updateByPrimaryKey(Receiver record);
}