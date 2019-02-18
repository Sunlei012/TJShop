//package com.hp.shop.dao;
//
////import com.hp.shop.entity.Customer;
//import org.apache.ibatis.annotations.Param;
//
//import java.util.List;
//
//public interface CustomerDao {
//
//    /**
//     * 增加用户
//     *
//     * @param CId
//     * @param CMolbile
//     * @param CPassword
//     * @param RealPassword
//     * @param Birthday
//     * @param AddressOne
//     * @param AdressTwe
//     * @param AddressThree
//     * @param Email
//     * @param Point
//     * @param Status
//     */
//    void addCustomer (@Param("cId") String CId,@Param("cMobile") String CMolbile,
//                      @Param("cPassword") String CPassword,@Param("realName") String RealPassword,
//                    @Param("birthday") String Birthday,@Param("addressOne") String AddressOne,
//            @Param("adressTwe") String AdressTwe,@Param("adressThree") String AddressThree,
//            @Param("email") String Email,@Param("point") String Point,@Param("status") String Status);
//
//    /**
//     * 删除用户
//     *
//     * @param CId
//     * @param Email
//     */
//    void delectCustomer(@Param("cId") String CId,@Param("email") String Email);
//
//    /**
//     * 更新用户账户信息
//     *
//     * @param CId
//     * @param CMolbile
//     * @param CPassword
//     * @param RealPassword
//     * @param Birthday
//     * @param AddressOne
//     * @param AdressTwe
//     * @param AddressThree
//     * @param Email
//     * @param Point
//     * @param Status
//     * @return
//     */
//    int updateCustomer(@Param("cId") String CId,@Param("cMobile") String CMolbile,
//                       @Param("cPassword") String CPassword,@Param("realName") String RealPassword,
//                       @Param("birthday") String Birthday,@Param("addressOne") String AddressOne,
//                       @Param("adressTwe") String AdressTwe,@Param("adressThree") String AddressThree,
//                       @Param("email") String Email,@Param("point") String Point,@Param("status") String Status);
//
//    /**
//     * 查询指定账户信息
//     *
//     * @param CId
//     * @param CPassword
//     * @return
//     */
//    Customer selectCustomerInfoByCId (@Param("cId") String CId,@Param("cpassword") String CPassword);
//
//    /**
//     * 查找所有账户信息
//     *
//     * @param Offset 查询起始位置
//     * @param Limit 查询条数
//     * @return
//     */
//    List<Customer> selectAllCUstomer(@Param("offset") int Offset, @Param("limit") int Limit);
//}
