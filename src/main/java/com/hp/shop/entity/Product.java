package com.hp.shop.entity;

import java.io.Serializable;
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
@Table(name="product")
public class Product implements Serializable {
    /**
     * 产品ID
     *
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    @Column(name="p_id")
    @Id
    @GeneratedValue
    private Integer p_id;

    /**
     * 产品名称
     *
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    @Column(name="p_name")
    private String p_name;

    /**
     * 小标题
     *
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    @Column(name="subTitle")
    private String subTitle;

    /**
     * 原始价格
     *
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    @Column(name="ariginalPrice")
    private Float ariginalPrice;

    /**
     * 优惠价格
     *
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    @Column(name="promotePrice")
    private Float promotePrice;

    /**
     * 库存量
     *
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    @Column(name="stock")
    private Integer stock;

    /**
     * 分类表ID
     *
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    @Column(name="c_id")
    private Integer c_id;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column product.p_id
     *
     * @return the value of product.p_id
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public Integer getP_id() {
        return p_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public Product withP_id(Integer p_id) {
        this.setP_id(p_id);
        return this;
    }

    /**
     * This method sets the value of the database column product.p_id
     *
     * @param p_id the value for product.p_id
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    /**
     * This method returns the value of the database column product.p_name
     *
     * @return the value of product.p_name
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public String getP_name() {
        return p_name;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public Product withP_name(String p_name) {
        this.setP_name(p_name);
        return this;
    }

    /**
     * This method sets the value of the database column product.p_name
     *
     * @param p_name the value for product.p_name
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    /**
     * This method returns the value of the database column product.subTitle
     *
     * @return the value of product.subTitle
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public Product withSubTitle(String subTitle) {
        this.setSubTitle(subTitle);
        return this;
    }

    /**
     * This method sets the value of the database column product.subTitle
     *
     * @param subTitle the value for product.subTitle
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /**
     * This method returns the value of the database column product.ariginalPrice
     *
     * @return the value of product.ariginalPrice
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public Float getAriginalPrice() {
        return ariginalPrice;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public Product withAriginalPrice(Float ariginalPrice) {
        this.setAriginalPrice(ariginalPrice);
        return this;
    }

    /**
     * This method sets the value of the database column product.ariginalPrice
     *
     * @param ariginalPrice the value for product.ariginalPrice
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public void setAriginalPrice(Float ariginalPrice) {
        this.ariginalPrice = ariginalPrice;
    }

    /**
     * This method returns the value of the database column product.promotePrice
     *
     * @return the value of product.promotePrice
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public Float getPromotePrice() {
        return promotePrice;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public Product withPromotePrice(Float promotePrice) {
        this.setPromotePrice(promotePrice);
        return this;
    }

    /**
     * This method sets the value of the database column product.promotePrice
     *
     * @param promotePrice the value for product.promotePrice
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public void setPromotePrice(Float promotePrice) {
        this.promotePrice = promotePrice;
    }

    /**
     * This method returns the value of the database column product.stock
     *
     * @return the value of product.stock
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public Integer getStock() {
        return stock;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public Product withStock(Integer stock) {
        this.setStock(stock);
        return this;
    }

    /**
     * This method sets the value of the database column product.stock
     *
     * @param stock the value for product.stock
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method returns the value of the database column product.c_id
     *
     * @return the value of product.c_id
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public Integer getC_id() {
        return c_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public Product withC_id(Integer c_id) {
        this.setC_id(c_id);
        return this;
    }

    /**
     * This method sets the value of the database column product.c_id
     *
     * @param c_id the value for product.c_id
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", p_id=").append(p_id);
        sb.append(", p_name=").append(p_name);
        sb.append(", subTitle=").append(subTitle);
        sb.append(", ariginalPrice=").append(ariginalPrice);
        sb.append(", promotePrice=").append(promotePrice);
        sb.append(", stock=").append(stock);
        sb.append(", c_id=").append(c_id);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
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
        Product other = (Product) that;
        return (this.getP_id() == null ? other.getP_id() == null : this.getP_id().equals(other.getP_id()))
            && (this.getP_name() == null ? other.getP_name() == null : this.getP_name().equals(other.getP_name()))
            && (this.getSubTitle() == null ? other.getSubTitle() == null : this.getSubTitle().equals(other.getSubTitle()))
            && (this.getAriginalPrice() == null ? other.getAriginalPrice() == null : this.getAriginalPrice().equals(other.getAriginalPrice()))
            && (this.getPromotePrice() == null ? other.getPromotePrice() == null : this.getPromotePrice().equals(other.getPromotePrice()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getC_id() == null ? other.getC_id() == null : this.getC_id().equals(other.getC_id()));
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getP_id() == null) ? 0 : getP_id().hashCode());
        result = prime * result + ((getP_name() == null) ? 0 : getP_name().hashCode());
        result = prime * result + ((getSubTitle() == null) ? 0 : getSubTitle().hashCode());
        result = prime * result + ((getAriginalPrice() == null) ? 0 : getAriginalPrice().hashCode());
        result = prime * result + ((getPromotePrice() == null) ? 0 : getPromotePrice().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getC_id() == null) ? 0 : getC_id().hashCode());
        return result;
    }
}