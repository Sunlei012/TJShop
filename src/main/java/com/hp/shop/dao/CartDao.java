package com.hp.shop.dao;

import com.hp.shop.entity.Cart;
import org.apache.ibatis.annotations.Param;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public interface CartDao {


    /**
    *通过用户ID查询购物车内所有商品编号
    *
    * @param id 用户编号ID
    * @return 购物车结果
     */
    ResultSet PIdByUIdInCart(int id);


    /**
     * 通过用户ID和商品ID更改用户购物车内该商品的数量
     *
     * @param UId 用户编号
     * @param PId 商品编号
     * @param CaNumber 更改到的数量
     */
    void CaNumberByUIdPIdInCart(@Param("uId") int UId,@Param("pId") int PId,@Param("caNumber") int CaNumber );

    /**
     * 通过用户ID和产品ID删除购物车内商品
     *
     * @param UId 用户编号
     * @param PId 商品编号
     * @return 删除的行数
     */
    int DelectByUIdPIdInCart(@Param("uId") int UId,@Param("pId") int PId);



    /**
     * 增加该用户的购物车商品
     *
     * @param UId 用户编号
     * @param PId 商品编号
     * @param CaNumber 商品数量
     * @param ts 加入时间
     * @return 插入的行数
     */
    int InsertInCart(@Param("uId") int UId, @Param("pId") int PId, @Param("caNumber") int CaNumber, @Param("caTime")Timestamp ts);


}
