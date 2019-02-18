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
@Table(name="receiver")
public class Receiver implements Serializable {
    /**
     * 收货人ID
     *
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    @Column(name="re_id")
    @Id
    @GeneratedValue
    private Integer re_id;

    /**
     * 会员ID
     *
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    @Column(name="c_id")
    private Integer c_id;

    /**
     * 收货人姓名
     *
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    @Column(name="re_name")
    private String re_name;

    /**
     * 收货人地址
     *
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    @Column(name="re_address")
    private String re_address;

    /**
     * 收货人联系电话
     *
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    @Column(name="re_mobile")
    private Integer re_mobile;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column receiver.re_id
     *
     * @return the value of receiver.re_id
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public Integer getRe_id() {
        return re_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public Receiver withRe_id(Integer re_id) {
        this.setRe_id(re_id);
        return this;
    }

    /**
     * This method sets the value of the database column receiver.re_id
     *
     * @param re_id the value for receiver.re_id
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public void setRe_id(Integer re_id) {
        this.re_id = re_id;
    }

    /**
     * This method returns the value of the database column receiver.c_id
     *
     * @return the value of receiver.c_id
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public Integer getC_id() {
        return c_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public Receiver withC_id(Integer c_id) {
        this.setC_id(c_id);
        return this;
    }

    /**
     * This method sets the value of the database column receiver.c_id
     *
     * @param c_id the value for receiver.c_id
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    /**
     * This method returns the value of the database column receiver.re_name
     *
     * @return the value of receiver.re_name
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public String getRe_name() {
        return re_name;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public Receiver withRe_name(String re_name) {
        this.setRe_name(re_name);
        return this;
    }

    /**
     * This method sets the value of the database column receiver.re_name
     *
     * @param re_name the value for receiver.re_name
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public void setRe_name(String re_name) {
        this.re_name = re_name;
    }

    /**
     * This method returns the value of the database column receiver.re_address
     *
     * @return the value of receiver.re_address
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public String getRe_address() {
        return re_address;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public Receiver withRe_address(String re_address) {
        this.setRe_address(re_address);
        return this;
    }

    /**
     * This method sets the value of the database column receiver.re_address
     *
     * @param re_address the value for receiver.re_address
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public void setRe_address(String re_address) {
        this.re_address = re_address;
    }

    /**
     * This method returns the value of the database column receiver.re_mobile
     *
     * @return the value of receiver.re_mobile
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public Integer getRe_mobile() {
        return re_mobile;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public Receiver withRe_mobile(Integer re_mobile) {
        this.setRe_mobile(re_mobile);
        return this;
    }

    /**
     * This method sets the value of the database column receiver.re_mobile
     *
     * @param re_mobile the value for receiver.re_mobile
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public void setRe_mobile(Integer re_mobile) {
        this.re_mobile = re_mobile;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", re_id=").append(re_id);
        sb.append(", c_id=").append(c_id);
        sb.append(", re_name=").append(re_name);
        sb.append(", re_address=").append(re_address);
        sb.append(", re_mobile=").append(re_mobile);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
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
        Receiver other = (Receiver) that;
        return (this.getRe_id() == null ? other.getRe_id() == null : this.getRe_id().equals(other.getRe_id()))
            && (this.getC_id() == null ? other.getC_id() == null : this.getC_id().equals(other.getC_id()))
            && (this.getRe_name() == null ? other.getRe_name() == null : this.getRe_name().equals(other.getRe_name()))
            && (this.getRe_address() == null ? other.getRe_address() == null : this.getRe_address().equals(other.getRe_address()))
            && (this.getRe_mobile() == null ? other.getRe_mobile() == null : this.getRe_mobile().equals(other.getRe_mobile()));
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRe_id() == null) ? 0 : getRe_id().hashCode());
        result = prime * result + ((getC_id() == null) ? 0 : getC_id().hashCode());
        result = prime * result + ((getRe_name() == null) ? 0 : getRe_name().hashCode());
        result = prime * result + ((getRe_address() == null) ? 0 : getRe_address().hashCode());
        result = prime * result + ((getRe_mobile() == null) ? 0 : getRe_mobile().hashCode());
        return result;
    }
}