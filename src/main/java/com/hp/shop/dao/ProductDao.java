package com.hp.shop.dao;

import com.hp.shop.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {
    /**
     *InsertProduct 新增商品
     *
     * @param PName 商品名称
     * @param SubTitle 商品小标题
     * @param AriginalPrice 原始价格
     * @param PromotePrice 优惠价格
     * @param Stock 库存
     * @param CId 分类ID
     * @return 插入行数
     */
    int insertProduct(@Param("pName") String PName,@Param("subTitle") String SubTitle,@Param("ariginalPrice") float AriginalPrice,
                       @Param("promotePrice") float PromotePrice,@Param("stock") int Stock,@Param("cId") int CId);

    /**
     * deleteProduct 删除商品
     *
     * @param PName 商品名称
     * @param PId 商品ID
     * @return 删除行数
     */
    int deleteProduct(@Param("pName") String PName,@Param("pId") int PId);

    /**
     * updateProduct 更改商品信息
     *
     * @param PName 商品名称
     * @param SubTitle 商品小标题
     * @param AriginalPrice 商品原始价格
     * @param PromotePrice 优惠价格
     * @param Stock 库存
     * @param CId 分类ID
     * @return 更改行数
     */
    int updateProduct(@Param("pName") String PName,@Param("subTitle") String SubTitle,@Param("ariginalPrice") float AriginalPrice,
                      @Param("promotePrice") float PromotePrice,@Param("stock") int Stock,@Param("cId") int CId);

    /**
     * selectProductByNameOrSub 通过商品名称或小标题查找商品
     *
     * @param PName 商品名称
     * @param SubTitle 商品小标题
     * @return 商品对象列表
     */
    List<Product> selectProductByNameOrSub(@Param("pName") String PName,@Param("subTitle") String SubTitle);

    /**
     * 通过分类查找产品
     *
     * @param CId 分类ID
     * @return 产品对象列表
     */
    List<Product> selectProductByCategory(@Param("cId") int CId);

    /**
     * 查找全部商品
     *
     * @return
     */
    List<Product> selectProductAll();



}
