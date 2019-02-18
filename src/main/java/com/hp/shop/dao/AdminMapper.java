package com.hp.shop.dao;

import generator.entity.Admin;
import generator.entity.AdminExample;
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
public interface AdminMapper {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    long countByExample(AdminExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    int deleteByExample(AdminExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    int deleteByPrimaryKey(Integer a_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    int insert(Admin record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    int insertSelective(Admin record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    List<Admin> selectByExample(AdminExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    Admin selectByPrimaryKey(Integer a_id);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    int updateByPrimaryKey(Admin record);
}