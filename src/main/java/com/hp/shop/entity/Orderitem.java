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
@Table(name="orderitem")
public class Orderitem implements Serializable {
    /**
     * 订单项ID
     *
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    @Column(name="or_id")
    @Id
    @GeneratedValue
    private Integer or_id;

    /**
     * 产品表ID
     *
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    @Column(name="p_id")
    private Integer p_id;

    /**
     * 订单表ID
     *
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    @Column(name="o_id")
    private Integer o_id;

    /**
     * 用户表ID
     *
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    @Column(name="u_id")
    private Integer u_id;

    /**
     * 购买数量
     *
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    @Column(name="number")
    private Integer number;

    /**
     * 支付方式
     *
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    @Column(name="pay_way")
    private String pay_way;

    /**
     * 订单金额
     *
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    @Column(name="amount")
    private Double amount;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column orderitem.or_id
     *
     * @return the value of orderitem.or_id
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public Integer getOr_id() {
        return or_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public Orderitem withOr_id(Integer or_id) {
        this.setOr_id(or_id);
        return this;
    }

    /**
     * This method sets the value of the database column orderitem.or_id
     *
     * @param or_id the value for orderitem.or_id
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public void setOr_id(Integer or_id) {
        this.or_id = or_id;
    }

    /**
     * This method returns the value of the database column orderitem.p_id
     *
     * @return the value of orderitem.p_id
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public Integer getP_id() {
        return p_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public Orderitem withP_id(Integer p_id) {
        this.setP_id(p_id);
        return this;
    }

    /**
     * This method sets the value of the database column orderitem.p_id
     *
     * @param p_id the value for orderitem.p_id
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    /**
     * This method returns the value of the database column orderitem.o_id
     *
     * @return the value of orderitem.o_id
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public Integer getO_id() {
        return o_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public Orderitem withO_id(Integer o_id) {
        this.setO_id(o_id);
        return this;
    }

    /**
     * This method sets the value of the database column orderitem.o_id
     *
     * @param o_id the value for orderitem.o_id
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public void setO_id(Integer o_id) {
        this.o_id = o_id;
    }

    /**
     * This method returns the value of the database column orderitem.u_id
     *
     * @return the value of orderitem.u_id
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public Integer getU_id() {
        return u_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public Orderitem withU_id(Integer u_id) {
        this.setU_id(u_id);
        return this;
    }

    /**
     * This method sets the value of the database column orderitem.u_id
     *
     * @param u_id the value for orderitem.u_id
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    /**
     * This method returns the value of the database column orderitem.number
     *
     * @return the value of orderitem.number
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public Integer getNumber() {
        return number;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public Orderitem withNumber(Integer number) {
        this.setNumber(number);
        return this;
    }

    /**
     * This method sets the value of the database column orderitem.number
     *
     * @param number the value for orderitem.number
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method returns the value of the database column orderitem.pay_way
     *
     * @return the value of orderitem.pay_way
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public String getPay_way() {
        return pay_way;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public Orderitem withPay_way(String pay_way) {
        this.setPay_way(pay_way);
        return this;
    }

    /**
     * This method sets the value of the database column orderitem.pay_way
     *
     * @param pay_way the value for orderitem.pay_way
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public void setPay_way(String pay_way) {
        this.pay_way = pay_way;
    }

    /**
     * This method returns the value of the database column orderitem.amount
     *
     * @return the value of orderitem.amount
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public Double getAmount() {
        return amount;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public Orderitem withAmount(Double amount) {
        this.setAmount(amount);
        return this;
    }

    /**
     * This method sets the value of the database column orderitem.amount
     *
     * @param amount the value for orderitem.amount
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", or_id=").append(or_id);
        sb.append(", p_id=").append(p_id);
        sb.append(", o_id=").append(o_id);
        sb.append(", u_id=").append(u_id);
        sb.append(", number=").append(number);
        sb.append(", pay_way=").append(pay_way);
        sb.append(", amount=").append(amount);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
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
        Orderitem other = (Orderitem) that;
        return (this.getOr_id() == null ? other.getOr_id() == null : this.getOr_id().equals(other.getOr_id()))
            && (this.getP_id() == null ? other.getP_id() == null : this.getP_id().equals(other.getP_id()))
            && (this.getO_id() == null ? other.getO_id() == null : this.getO_id().equals(other.getO_id()))
            && (this.getU_id() == null ? other.getU_id() == null : this.getU_id().equals(other.getU_id()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getPay_way() == null ? other.getPay_way() == null : this.getPay_way().equals(other.getPay_way()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()));
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOr_id() == null) ? 0 : getOr_id().hashCode());
        result = prime * result + ((getP_id() == null) ? 0 : getP_id().hashCode());
        result = prime * result + ((getO_id() == null) ? 0 : getO_id().hashCode());
        result = prime * result + ((getU_id() == null) ? 0 : getU_id().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getPay_way() == null) ? 0 : getPay_way().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        return result;
    }
}