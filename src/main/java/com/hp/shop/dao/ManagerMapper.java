package com.hp.shop.dao;

import generator.entity.Manager;
import generator.entity.ManagerExample;
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
public interface ManagerMapper {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    long countByExample(ManagerExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    int deleteByExample(ManagerExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    int insert(Manager record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    int insertSelective(Manager record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    List<Manager> selectByExample(ManagerExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    int updateByExampleSelective(@Param("record") Manager record, @Param("example") ManagerExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    int updateByExample(@Param("record") Manager record, @Param("example") ManagerExample example);
}