package com.hp.shop.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
@Entity
@Table(name="order")
public class Order implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    @Column(name="order_Id")
    @Id
    @GeneratedValue
    private String order_Id;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    @Column(name="order_User")
    private Integer order_User;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    @Column(name="order_Date")
    private Date order_Date;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    @Column(name="order_Price")
    private Double order_Price;

    /**
     * -1删除 1 待付款 2待发货 3 待收货 4待评价 5完成
     *
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    @Column(name="order_State")
    private Integer order_State;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    @Column(name="order_UserName")
    private String order_UserName;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    @Column(name="order_Phone")
    private String order_Phone;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    @Column(name="order_Address")
    private String order_Address;

    /**
     * 快递单号
     *
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    @Column(name="order_ExpressNo")
    private String order_ExpressNo;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column order.order_Id
     *
     * @return the value of order.order_Id
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public String getOrder_Id() {
        return order_Id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public Order withOrder_Id(String order_Id) {
        this.setOrder_Id(order_Id);
        return this;
    }

    /**
     * This method sets the value of the database column order.order_Id
     *
     * @param order_Id the value for order.order_Id
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public void setOrder_Id(String order_Id) {
        this.order_Id = order_Id;
    }

    /**
     * This method returns the value of the database column order.order_User
     *
     * @return the value of order.order_User
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public Integer getOrder_User() {
        return order_User;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public Order withOrder_User(Integer order_User) {
        this.setOrder_User(order_User);
        return this;
    }

    /**
     * This method sets the value of the database column order.order_User
     *
     * @param order_User the value for order.order_User
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public void setOrder_User(Integer order_User) {
        this.order_User = order_User;
    }

    /**
     * This method returns the value of the database column order.order_Date
     *
     * @return the value of order.order_Date
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public Date getOrder_Date() {
        return order_Date;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public Order withOrder_Date(Date order_Date) {
        this.setOrder_Date(order_Date);
        return this;
    }

    /**
     * This method sets the value of the database column order.order_Date
     *
     * @param order_Date the value for order.order_Date
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public void setOrder_Date(Date order_Date) {
        this.order_Date = order_Date;
    }

    /**
     * This method returns the value of the database column order.order_Price
     *
     * @return the value of order.order_Price
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public Double getOrder_Price() {
        return order_Price;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public Order withOrder_Price(Double order_Price) {
        this.setOrder_Price(order_Price);
        return this;
    }

    /**
     * This method sets the value of the database column order.order_Price
     *
     * @param order_Price the value for order.order_Price
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public void setOrder_Price(Double order_Price) {
        this.order_Price = order_Price;
    }

    /**
     * This method returns the value of the database column order.order_State
     *
     * @return the value of order.order_State
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public Integer getOrder_State() {
        return order_State;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public Order withOrder_State(Integer order_State) {
        this.setOrder_State(order_State);
        return this;
    }

    /**
     * This method sets the value of the database column order.order_State
     *
     * @param order_State the value for order.order_State
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public void setOrder_State(Integer order_State) {
        this.order_State = order_State;
    }

    /**
     * This method returns the value of the database column order.order_UserName
     *
     * @return the value of order.order_UserName
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public String getOrder_UserName() {
        return order_UserName;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public Order withOrder_UserName(String order_UserName) {
        this.setOrder_UserName(order_UserName);
        return this;
    }

    /**
     * This method sets the value of the database column order.order_UserName
     *
     * @param order_UserName the value for order.order_UserName
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public void setOrder_UserName(String order_UserName) {
        this.order_UserName = order_UserName;
    }

    /**
     * This method returns the value of the database column order.order_Phone
     *
     * @return the value of order.order_Phone
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public String getOrder_Phone() {
        return order_Phone;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public Order withOrder_Phone(String order_Phone) {
        this.setOrder_Phone(order_Phone);
        return this;
    }

    /**
     * This method sets the value of the database column order.order_Phone
     *
     * @param order_Phone the value for order.order_Phone
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public void setOrder_Phone(String order_Phone) {
        this.order_Phone = order_Phone;
    }

    /**
     * This method returns the value of the database column order.order_Address
     *
     * @return the value of order.order_Address
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public String getOrder_Address() {
        return order_Address;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public Order withOrder_Address(String order_Address) {
        this.setOrder_Address(order_Address);
        return this;
    }

    /**
     * This method sets the value of the database column order.order_Address
     *
     * @param order_Address the value for order.order_Address
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public void setOrder_Address(String order_Address) {
        this.order_Address = order_Address;
    }

    /**
     * This method returns the value of the database column order.order_ExpressNo
     *
     * @return the value of order.order_ExpressNo
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public String getOrder_ExpressNo() {
        return order_ExpressNo;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public Order withOrder_ExpressNo(String order_ExpressNo) {
        this.setOrder_ExpressNo(order_ExpressNo);
        return this;
    }

    /**
     * This method sets the value of the database column order.order_ExpressNo
     *
     * @param order_ExpressNo the value for order.order_ExpressNo
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public void setOrder_ExpressNo(String order_ExpressNo) {
        this.order_ExpressNo = order_ExpressNo;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", order_Id=").append(order_Id);
        sb.append(", order_User=").append(order_User);
        sb.append(", order_Date=").append(order_Date);
        sb.append(", order_Price=").append(order_Price);
        sb.append(", order_State=").append(order_State);
        sb.append(", order_UserName=").append(order_UserName);
        sb.append(", order_Phone=").append(order_Phone);
        sb.append(", order_Address=").append(order_Address);
        sb.append(", order_ExpressNo=").append(order_ExpressNo);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getOrder_Id() == null ? other.getOrder_Id() == null : this.getOrder_Id().equals(other.getOrder_Id()))
            && (this.getOrder_User() == null ? other.getOrder_User() == null : this.getOrder_User().equals(other.getOrder_User()))
            && (this.getOrder_Date() == null ? other.getOrder_Date() == null : this.getOrder_Date().equals(other.getOrder_Date()))
            && (this.getOrder_Price() == null ? other.getOrder_Price() == null : this.getOrder_Price().equals(other.getOrder_Price()))
            && (this.getOrder_State() == null ? other.getOrder_State() == null : this.getOrder_State().equals(other.getOrder_State()))
            && (this.getOrder_UserName() == null ? other.getOrder_UserName() == null : this.getOrder_UserName().equals(other.getOrder_UserName()))
            && (this.getOrder_Phone() == null ? other.getOrder_Phone() == null : this.getOrder_Phone().equals(other.getOrder_Phone()))
            && (this.getOrder_Address() == null ? other.getOrder_Address() == null : this.getOrder_Address().equals(other.getOrder_Address()))
            && (this.getOrder_ExpressNo() == null ? other.getOrder_ExpressNo() == null : this.getOrder_ExpressNo().equals(other.getOrder_ExpressNo()));
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrder_Id() == null) ? 0 : getOrder_Id().hashCode());
        result = prime * result + ((getOrder_User() == null) ? 0 : getOrder_User().hashCode());
        result = prime * result + ((getOrder_Date() == null) ? 0 : getOrder_Date().hashCode());
        result = prime * result + ((getOrder_Price() == null) ? 0 : getOrder_Price().hashCode());
        result = prime * result + ((getOrder_State() == null) ? 0 : getOrder_State().hashCode());
        result = prime * result + ((getOrder_UserName() == null) ? 0 : getOrder_UserName().hashCode());
        result = prime * result + ((getOrder_Phone() == null) ? 0 : getOrder_Phone().hashCode());
        result = prime * result + ((getOrder_Address() == null) ? 0 : getOrder_Address().hashCode());
        result = prime * result + ((getOrder_ExpressNo() == null) ? 0 : getOrder_ExpressNo().hashCode());
        return result;
    }
}