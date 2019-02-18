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
@Table(name="manager")
public class Manager implements Serializable {
    /**
     * 管理员ID
     *
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    @Column(name="m_id")
    private Integer m_id;

    /**
     * 管理员姓名
     *
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    @Column(name="m_name")
    private String m_name;

    /**
     * 管理员密码
     *
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    @Column(name="m_password")
    private String m_password;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column manager.m_id
     *
     * @return the value of manager.m_id
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public Integer getM_id() {
        return m_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public Manager withM_id(Integer m_id) {
        this.setM_id(m_id);
        return this;
    }

    /**
     * This method sets the value of the database column manager.m_id
     *
     * @param m_id the value for manager.m_id
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    /**
     * This method returns the value of the database column manager.m_name
     *
     * @return the value of manager.m_name
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public String getM_name() {
        return m_name;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public Manager withM_name(String m_name) {
        this.setM_name(m_name);
        return this;
    }

    /**
     * This method sets the value of the database column manager.m_name
     *
     * @param m_name the value for manager.m_name
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    /**
     * This method returns the value of the database column manager.m_password
     *
     * @return the value of manager.m_password
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public String getM_password() {
        return m_password;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public Manager withM_password(String m_password) {
        this.setM_password(m_password);
        return this;
    }

    /**
     * This method sets the value of the database column manager.m_password
     *
     * @param m_password the value for manager.m_password
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public void setM_password(String m_password) {
        this.m_password = m_password;
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
        sb.append(", m_id=").append(m_id);
        sb.append(", m_name=").append(m_name);
        sb.append(", m_password=").append(m_password);
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
        Manager other = (Manager) that;
        return (this.getM_id() == null ? other.getM_id() == null : this.getM_id().equals(other.getM_id()))
            && (this.getM_name() == null ? other.getM_name() == null : this.getM_name().equals(other.getM_name()))
            && (this.getM_password() == null ? other.getM_password() == null : this.getM_password().equals(other.getM_password()));
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getM_id() == null) ? 0 : getM_id().hashCode());
        result = prime * result + ((getM_name() == null) ? 0 : getM_name().hashCode());
        result = prime * result + ((getM_password() == null) ? 0 : getM_password().hashCode());
        return result;
    }
}