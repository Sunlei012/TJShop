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
@Table(name="review")
public class Review implements Serializable {
    /**
     * 评价表ID
     *
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    @Column(name="r_id")
    @Id
    @GeneratedValue
    private Integer r_id;

    /**
     * 用户表ID
     *
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    @Column(name="u_id")
    private Integer u_id;

    /**
     * 产品表ID
     *
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    @Column(name="p_id")
    private Integer p_id;

    /**
     * 评论时间
     *
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    @Column(name="r_createDate")
    private Date r_createDate;

    /**
     * 评价内容
     *
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    @Column(name="content")
    private String content;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column review.r_id
     *
     * @return the value of review.r_id
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    public Integer getR_id() {
        return r_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    public Review withR_id(Integer r_id) {
        this.setR_id(r_id);
        return this;
    }

    /**
     * This method sets the value of the database column review.r_id
     *
     * @param r_id the value for review.r_id
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    /**
     * This method returns the value of the database column review.u_id
     *
     * @return the value of review.u_id
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    public Integer getU_id() {
        return u_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    public Review withU_id(Integer u_id) {
        this.setU_id(u_id);
        return this;
    }

    /**
     * This method sets the value of the database column review.u_id
     *
     * @param u_id the value for review.u_id
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    /**
     * This method returns the value of the database column review.p_id
     *
     * @return the value of review.p_id
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    public Integer getP_id() {
        return p_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    public Review withP_id(Integer p_id) {
        this.setP_id(p_id);
        return this;
    }

    /**
     * This method sets the value of the database column review.p_id
     *
     * @param p_id the value for review.p_id
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    /**
     * This method returns the value of the database column review.r_createDate
     *
     * @return the value of review.r_createDate
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    public Date getR_createDate() {
        return r_createDate;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    public Review withR_createDate(Date r_createDate) {
        this.setR_createDate(r_createDate);
        return this;
    }

    /**
     * This method sets the value of the database column review.r_createDate
     *
     * @param r_createDate the value for review.r_createDate
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    public void setR_createDate(Date r_createDate) {
        this.r_createDate = r_createDate;
    }

    /**
     * This method returns the value of the database column review.content
     *
     * @return the value of review.content
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    public Review withContent(String content) {
        this.setContent(content);
        return this;
    }

    /**
     * This method sets the value of the database column review.content
     *
     * @param content the value for review.content
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", r_id=").append(r_id);
        sb.append(", u_id=").append(u_id);
        sb.append(", p_id=").append(p_id);
        sb.append(", r_createDate=").append(r_createDate);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
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
        Review other = (Review) that;
        return (this.getR_id() == null ? other.getR_id() == null : this.getR_id().equals(other.getR_id()))
            && (this.getU_id() == null ? other.getU_id() == null : this.getU_id().equals(other.getU_id()))
            && (this.getP_id() == null ? other.getP_id() == null : this.getP_id().equals(other.getP_id()))
            && (this.getR_createDate() == null ? other.getR_createDate() == null : this.getR_createDate().equals(other.getR_createDate()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:52 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getR_id() == null) ? 0 : getR_id().hashCode());
        result = prime * result + ((getU_id() == null) ? 0 : getU_id().hashCode());
        result = prime * result + ((getP_id() == null) ? 0 : getP_id().hashCode());
        result = prime * result + ((getR_createDate() == null) ? 0 : getR_createDate().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}