package com.hp.shop.dao;
import com.hp.shop.entity.Category;
import org.apache.ibatis.annotations.Param;

public interface CategoryDao {

    //增加一个分类
    void InsertCategory(@Param("caName") String CaName,@Param("caParentId") int CaParentId,@Param("caGradeNum") int CaGradeNum);

    //删除一个分类通过分类名
    int DelectByCaNameCategory(@Param("caName") String CaName);
}
