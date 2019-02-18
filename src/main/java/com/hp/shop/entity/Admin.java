package com.hp.shop.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 *
 * @author
 */
@Entity
@Table(name = "admin")
public class Admin  implements Serializable {
    /**
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    @Column(name = "a_id")
    @Id
    @GeneratedValue
    private Integer a_id;

    /**
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    @Column(name = "a_name")
    @NotEmpty
    private String a_name;

    /**
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    @Column(name = "a_password")
    @NotEmpty
    private String a_password;

    /**
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column admin.a_id
     *
     * @return the value of admin.a_id
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public Integer getA_id() {
        return a_id;
    }

    /**
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public Admin withA_id(Integer a_id) {
        this.setA_id(a_id);
        return this;
    }

    /**
     * This method sets the value of the database column admin.a_id
     *
     * @param a_id the value for admin.a_id
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    /**
     * This method returns the value of the database column admin.a_name
     *
     * @return the value of admin.a_name
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public String getA_name() {
        return a_name;
    }

    /**
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public Admin withA_name(String a_name) {
        this.setA_name(a_name);
        return this;
    }

    /**
     * This method sets the value of the database column admin.a_name
     *
     * @param a_name the value for admin.a_name
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    /**
     * This method returns the value of the database column admin.a_password
     *
     * @return the value of admin.a_password
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public String getA_password() {
        return a_password;
    }

    /**
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public Admin withA_password(String a_password) {
        this.setA_password(a_password);
        return this;
    }

    /**
     * This method sets the value of the database column admin.a_password
     *
     * @param a_password the value for admin.a_password
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public void setA_password(String a_password) {
        this.a_password = a_password;
    }

    /**
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", a_id=").append(a_id);
        sb.append(", a_name=").append(a_name);
        sb.append(", a_password=").append(a_password);
        sb.append("]");
        return sb.toString();
    }

    /**
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
        Admin other = (Admin) that;
        return (this.getA_id() == null ? other.getA_id() == null : this.getA_id().equals(other.getA_id()))
                && (this.getA_name() == null ? other.getA_name() == null : this.getA_name().equals(other.getA_name()))
                && (this.getA_password() == null ? other.getA_password() == null : this.getA_password().equals(other.getA_password()));
    }

    /**
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getA_id() == null) ? 0 : getA_id().hashCode());
        result = prime * result + ((getA_name() == null) ? 0 : getA_name().hashCode());
        result = prime * result + ((getA_password() == null) ? 0 : getA_password().hashCode());
        return result;
    }
}