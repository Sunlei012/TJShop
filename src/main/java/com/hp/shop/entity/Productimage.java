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
@Table(name="productimage")
public class Productimage implements Serializable {
    /**
     * 产品图片ID
     *
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    @Column(name="pi_id")
    @Id
    @GeneratedValue
    private Integer pi_id;

    /**
     * 产品表ID
     *
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    @Column(name="p_id")
    private Integer p_id;

    /**
     * 产品图片1
     *
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    @Column(name="pi_image1")
    private String pi_image1;

    /**
     * 产品图片2
     *
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    @Column(name="pi_image2")
    private String pi_image2;

    /**
     * 产品图片3
     *
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    @Column(name="pi_image3")
    private String pi_image3;

    /**
     * 产品图片4
     *
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    @Column(name="pi_image4")
    private String pi_image4;

    /**
     * 产品图片5
     *
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    @Column(name="pi_image5")
    private String pi_image5;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column productimage.pi_id
     *
     * @return the value of productimage.pi_id
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public Integer getPi_id() {
        return pi_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public Productimage withPi_id(Integer pi_id) {
        this.setPi_id(pi_id);
        return this;
    }

    /**
     * This method sets the value of the database column productimage.pi_id
     *
     * @param pi_id the value for productimage.pi_id
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public void setPi_id(Integer pi_id) {
        this.pi_id = pi_id;
    }

    /**
     * This method returns the value of the database column productimage.p_id
     *
     * @return the value of productimage.p_id
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public Integer getP_id() {
        return p_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public Productimage withP_id(Integer p_id) {
        this.setP_id(p_id);
        return this;
    }

    /**
     * This method sets the value of the database column productimage.p_id
     *
     * @param p_id the value for productimage.p_id
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    /**
     * This method returns the value of the database column productimage.pi_image1
     *
     * @return the value of productimage.pi_image1
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public String getPi_image1() {
        return pi_image1;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public Productimage withPi_image1(String pi_image1) {
        this.setPi_image1(pi_image1);
        return this;
    }

    /**
     * This method sets the value of the database column productimage.pi_image1
     *
     * @param pi_image1 the value for productimage.pi_image1
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public void setPi_image1(String pi_image1) {
        this.pi_image1 = pi_image1;
    }

    /**
     * This method returns the value of the database column productimage.pi_image2
     *
     * @return the value of productimage.pi_image2
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public String getPi_image2() {
        return pi_image2;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public Productimage withPi_image2(String pi_image2) {
        this.setPi_image2(pi_image2);
        return this;
    }

    /**
     * This method sets the value of the database column productimage.pi_image2
     *
     * @param pi_image2 the value for productimage.pi_image2
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public void setPi_image2(String pi_image2) {
        this.pi_image2 = pi_image2;
    }

    /**
     * This method returns the value of the database column productimage.pi_image3
     *
     * @return the value of productimage.pi_image3
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public String getPi_image3() {
        return pi_image3;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public Productimage withPi_image3(String pi_image3) {
        this.setPi_image3(pi_image3);
        return this;
    }

    /**
     * This method sets the value of the database column productimage.pi_image3
     *
     * @param pi_image3 the value for productimage.pi_image3
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public void setPi_image3(String pi_image3) {
        this.pi_image3 = pi_image3;
    }

    /**
     * This method returns the value of the database column productimage.pi_image4
     *
     * @return the value of productimage.pi_image4
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public String getPi_image4() {
        return pi_image4;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public Productimage withPi_image4(String pi_image4) {
        this.setPi_image4(pi_image4);
        return this;
    }

    /**
     * This method sets the value of the database column productimage.pi_image4
     *
     * @param pi_image4 the value for productimage.pi_image4
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public void setPi_image4(String pi_image4) {
        this.pi_image4 = pi_image4;
    }

    /**
     * This method returns the value of the database column productimage.pi_image5
     *
     * @return the value of productimage.pi_image5
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public String getPi_image5() {
        return pi_image5;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public Productimage withPi_image5(String pi_image5) {
        this.setPi_image5(pi_image5);
        return this;
    }

    /**
     * This method sets the value of the database column productimage.pi_image5
     *
     * @param pi_image5 the value for productimage.pi_image5
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public void setPi_image5(String pi_image5) {
        this.pi_image5 = pi_image5;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pi_id=").append(pi_id);
        sb.append(", p_id=").append(p_id);
        sb.append(", pi_image1=").append(pi_image1);
        sb.append(", pi_image2=").append(pi_image2);
        sb.append(", pi_image3=").append(pi_image3);
        sb.append(", pi_image4=").append(pi_image4);
        sb.append(", pi_image5=").append(pi_image5);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
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
        Productimage other = (Productimage) that;
        return (this.getPi_id() == null ? other.getPi_id() == null : this.getPi_id().equals(other.getPi_id()))
            && (this.getP_id() == null ? other.getP_id() == null : this.getP_id().equals(other.getP_id()))
            && (this.getPi_image1() == null ? other.getPi_image1() == null : this.getPi_image1().equals(other.getPi_image1()))
            && (this.getPi_image2() == null ? other.getPi_image2() == null : this.getPi_image2().equals(other.getPi_image2()))
            && (this.getPi_image3() == null ? other.getPi_image3() == null : this.getPi_image3().equals(other.getPi_image3()))
            && (this.getPi_image4() == null ? other.getPi_image4() == null : this.getPi_image4().equals(other.getPi_image4()))
            && (this.getPi_image5() == null ? other.getPi_image5() == null : this.getPi_image5().equals(other.getPi_image5()));
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPi_id() == null) ? 0 : getPi_id().hashCode());
        result = prime * result + ((getP_id() == null) ? 0 : getP_id().hashCode());
        result = prime * result + ((getPi_image1() == null) ? 0 : getPi_image1().hashCode());
        result = prime * result + ((getPi_image2() == null) ? 0 : getPi_image2().hashCode());
        result = prime * result + ((getPi_image3() == null) ? 0 : getPi_image3().hashCode());
        result = prime * result + ((getPi_image4() == null) ? 0 : getPi_image4().hashCode());
        result = prime * result + ((getPi_image5() == null) ? 0 : getPi_image5().hashCode());
        return result;
    }
}