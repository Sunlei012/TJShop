package com.hp.shop.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
@Entity
@Table(name="cart")
public class Cart implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    @Column(name="cart_Id")
    @Id
    @GeneratedValue
    private Integer cart_Id;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    @Column(name="cart_Goods")
    private Integer cart_Goods;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    @Column(name="cart_Num")
    private Integer cart_Num;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    @Column(name="cart_Price")
    private Double cart_Price;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    @Column(name="cart_User")
    private Integer cart_User;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column cart.cart_Id
     *
     * @return the value of cart.cart_Id
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Integer getCart_Id() {
        return cart_Id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Cart withCart_Id(Integer cart_Id) {
        this.setCart_Id(cart_Id);
        return this;
    }

    /**
     * This method sets the value of the database column cart.cart_Id
     *
     * @param cart_Id the value for cart.cart_Id
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void setCart_Id(Integer cart_Id) {
        this.cart_Id = cart_Id;
    }

    /**
     * This method returns the value of the database column cart.cart_Goods
     *
     * @return the value of cart.cart_Goods
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Integer getCart_Goods() {
        return cart_Goods;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Cart withCart_Goods(Integer cart_Goods) {
        this.setCart_Goods(cart_Goods);
        return this;
    }

    /**
     * This method sets the value of the database column cart.cart_Goods
     *
     * @param cart_Goods the value for cart.cart_Goods
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void setCart_Goods(Integer cart_Goods) {
        this.cart_Goods = cart_Goods;
    }

    /**
     * This method returns the value of the database column cart.cart_Num
     *
     * @return the value of cart.cart_Num
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Integer getCart_Num() {
        return cart_Num;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Cart withCart_Num(Integer cart_Num) {
        this.setCart_Num(cart_Num);
        return this;
    }

    /**
     * This method sets the value of the database column cart.cart_Num
     *
     * @param cart_Num the value for cart.cart_Num
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void setCart_Num(Integer cart_Num) {
        this.cart_Num = cart_Num;
    }

    /**
     * This method returns the value of the database column cart.cart_Price
     *
     * @return the value of cart.cart_Price
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Double getCart_Price() {
        return cart_Price;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Cart withCart_Price(Double cart_Price) {
        this.setCart_Price(cart_Price);
        return this;
    }

    /**
     * This method sets the value of the database column cart.cart_Price
     *
     * @param cart_Price the value for cart.cart_Price
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void setCart_Price(Double cart_Price) {
        this.cart_Price = cart_Price;
    }

    /**
     * This method returns the value of the database column cart.cart_User
     *
     * @return the value of cart.cart_User
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Integer getCart_User() {
        return cart_User;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Cart withCart_User(Integer cart_User) {
        this.setCart_User(cart_User);
        return this;
    }

    /**
     * This method sets the value of the database column cart.cart_User
     *
     * @param cart_User the value for cart.cart_User
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void setCart_User(Integer cart_User) {
        this.cart_User = cart_User;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cart_Id=").append(cart_Id);
        sb.append(", cart_Goods=").append(cart_Goods);
        sb.append(", cart_Num=").append(cart_Num);
        sb.append(", cart_Price=").append(cart_Price);
        sb.append(", cart_User=").append(cart_User);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
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
        Cart other = (Cart) that;
        return (this.getCart_Id() == null ? other.getCart_Id() == null : this.getCart_Id().equals(other.getCart_Id()))
            && (this.getCart_Goods() == null ? other.getCart_Goods() == null : this.getCart_Goods().equals(other.getCart_Goods()))
            && (this.getCart_Num() == null ? other.getCart_Num() == null : this.getCart_Num().equals(other.getCart_Num()))
            && (this.getCart_Price() == null ? other.getCart_Price() == null : this.getCart_Price().equals(other.getCart_Price()))
            && (this.getCart_User() == null ? other.getCart_User() == null : this.getCart_User().equals(other.getCart_User()));
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCart_Id() == null) ? 0 : getCart_Id().hashCode());
        result = prime * result + ((getCart_Goods() == null) ? 0 : getCart_Goods().hashCode());
        result = prime * result + ((getCart_Num() == null) ? 0 : getCart_Num().hashCode());
        result = prime * result + ((getCart_Price() == null) ? 0 : getCart_Price().hashCode());
        result = prime * result + ((getCart_User() == null) ? 0 : getCart_User().hashCode());
        return result;
    }
}