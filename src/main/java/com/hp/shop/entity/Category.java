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
@Table(name="category")
public class Category implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    @Column(name="category_id")
    @Id
    @GeneratedValue
    private Byte category_id;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    @Column(name="name")
    @NotEmpty
    private String name;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    @Column(name="last_update")
    @NotEmpty
    private Date last_update;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column category.category_id
     *
     * @return the value of category.category_id
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public Byte getCategory_id() {
        return category_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public Category withCategory_id(Byte category_id) {
        this.setCategory_id(category_id);
        return this;
    }

    /**
     * This method sets the value of the database column category.category_id
     *
     * @param category_id the value for category.category_id
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public void setCategory_id(Byte category_id) {
        this.category_id = category_id;
    }

    /**
     * This method returns the value of the database column category.name
     *
     * @return the value of category.name
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public Category withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column category.name
     *
     * @param name the value for category.name
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column category.last_update
     *
     * @return the value of category.last_update
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public Date getLast_update() {
        return last_update;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public Category withLast_update(Date last_update) {
        this.setLast_update(last_update);
        return this;
    }

    /**
     * This method sets the value of the database column category.last_update
     *
     * @param last_update the value for category.last_update
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public void setLast_update(Date last_update) {
        this.last_update = last_update;
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
        sb.append(", category_id=").append(category_id);
        sb.append(", name=").append(name);
        sb.append(", last_update=").append(last_update);
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
        Category other = (Category) that;
        return (this.getCategory_id() == null ? other.getCategory_id() == null : this.getCategory_id().equals(other.getCategory_id()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getLast_update() == null ? other.getLast_update() == null : this.getLast_update().equals(other.getLast_update()));
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCategory_id() == null) ? 0 : getCategory_id().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getLast_update() == null) ? 0 : getLast_update().hashCode());
        return result;
    }
}