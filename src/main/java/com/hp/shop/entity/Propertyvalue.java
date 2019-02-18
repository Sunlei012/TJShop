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
@Table(name="propertyvalue")
public class Propertyvalue implements Serializable {
    /**
     * 属性值ID
     *
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    @Column(name="prova_id")
    @Id
    @GeneratedValue
    private Integer prova_id;

    /**
     * 产品表ID
     *
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    @Column(name="p_id")
    private Integer p_id;

    /**
     * 属性表id
     *
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    @Column(name="pro_id")
    private Integer pro_id;

    /**
     * 属性值
     *
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    @Column(name="value")
    private String value;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column propertyvalue.prova_id
     *
     * @return the value of propertyvalue.prova_id
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public Integer getProva_id() {
        return prova_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public Propertyvalue withProva_id(Integer prova_id) {
        this.setProva_id(prova_id);
        return this;
    }

    /**
     * This method sets the value of the database column propertyvalue.prova_id
     *
     * @param prova_id the value for propertyvalue.prova_id
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public void setProva_id(Integer prova_id) {
        this.prova_id = prova_id;
    }

    /**
     * This method returns the value of the database column propertyvalue.p_id
     *
     * @return the value of propertyvalue.p_id
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public Integer getP_id() {
        return p_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public Propertyvalue withP_id(Integer p_id) {
        this.setP_id(p_id);
        return this;
    }

    /**
     * This method sets the value of the database column propertyvalue.p_id
     *
     * @param p_id the value for propertyvalue.p_id
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    /**
     * This method returns the value of the database column propertyvalue.pro_id
     *
     * @return the value of propertyvalue.pro_id
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public Integer getPro_id() {
        return pro_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public Propertyvalue withPro_id(Integer pro_id) {
        this.setPro_id(pro_id);
        return this;
    }

    /**
     * This method sets the value of the database column propertyvalue.pro_id
     *
     * @param pro_id the value for propertyvalue.pro_id
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    /**
     * This method returns the value of the database column propertyvalue.value
     *
     * @return the value of propertyvalue.value
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public String getValue() {
        return value;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public Propertyvalue withValue(String value) {
        this.setValue(value);
        return this;
    }

    /**
     * This method sets the value of the database column propertyvalue.value
     *
     * @param value the value for propertyvalue.value
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prova_id=").append(prova_id);
        sb.append(", p_id=").append(p_id);
        sb.append(", pro_id=").append(pro_id);
        sb.append(", value=").append(value);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
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
        Propertyvalue other = (Propertyvalue) that;
        return (this.getProva_id() == null ? other.getProva_id() == null : this.getProva_id().equals(other.getProva_id()))
            && (this.getP_id() == null ? other.getP_id() == null : this.getP_id().equals(other.getP_id()))
            && (this.getPro_id() == null ? other.getPro_id() == null : this.getPro_id().equals(other.getPro_id()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()));
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProva_id() == null) ? 0 : getProva_id().hashCode());
        result = prime * result + ((getP_id() == null) ? 0 : getP_id().hashCode());
        result = prime * result + ((getPro_id() == null) ? 0 : getPro_id().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        return result;
    }
}