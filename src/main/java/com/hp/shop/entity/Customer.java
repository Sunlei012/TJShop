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
@Table(name="customer")
public class Customer implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    @Column(name="customer_id")
    @Id
    @GeneratedValue
    private Short customer_id;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    @Column(name="store_id")
    @NotEmpty
    private Byte store_id;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    @Column(name="first_name")
    @NotEmpty
    private String first_name;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    @Column(name="last_name")
    @NotEmpty
    private String last_name;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    @Column(name="email")
    private String email;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    @Column(name="address_id")
    @NotEmpty
    private Short address_id;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    @Column(name="active")
    @NotEmpty
    private Boolean active;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    @Column(name="create_date")
    @NotEmpty
    private Date create_date;

    /**
     *
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    @Column(name="last_update")
    private Date last_update;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column customer.customer_id
     *
     * @return the value of customer.customer_id
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Short getCustomer_id() {
        return customer_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Customer withCustomer_id(Short customer_id) {
        this.setCustomer_id(customer_id);
        return this;
    }

    /**
     * This method sets the value of the database column customer.customer_id
     *
     * @param customer_id the value for customer.customer_id
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void setCustomer_id(Short customer_id) {
        this.customer_id = customer_id;
    }

    /**
     * This method returns the value of the database column customer.store_id
     *
     * @return the value of customer.store_id
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Byte getStore_id() {
        return store_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Customer withStore_id(Byte store_id) {
        this.setStore_id(store_id);
        return this;
    }

    /**
     * This method sets the value of the database column customer.store_id
     *
     * @param store_id the value for customer.store_id
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void setStore_id(Byte store_id) {
        this.store_id = store_id;
    }

    /**
     * This method returns the value of the database column customer.first_name
     *
     * @return the value of customer.first_name
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Customer withFirst_name(String first_name) {
        this.setFirst_name(first_name);
        return this;
    }

    /**
     * This method sets the value of the database column customer.first_name
     *
     * @param first_name the value for customer.first_name
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * This method returns the value of the database column customer.last_name
     *
     * @return the value of customer.last_name
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Customer withLast_name(String last_name) {
        this.setLast_name(last_name);
        return this;
    }

    /**
     * This method sets the value of the database column customer.last_name
     *
     * @param last_name the value for customer.last_name
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * This method returns the value of the database column customer.email
     *
     * @return the value of customer.email
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Customer withEmail(String email) {
        this.setEmail(email);
        return this;
    }

    /**
     * This method sets the value of the database column customer.email
     *
     * @param email the value for customer.email
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method returns the value of the database column customer.address_id
     *
     * @return the value of customer.address_id
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Short getAddress_id() {
        return address_id;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Customer withAddress_id(Short address_id) {
        this.setAddress_id(address_id);
        return this;
    }

    /**
     * This method sets the value of the database column customer.address_id
     *
     * @param address_id the value for customer.address_id
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void setAddress_id(Short address_id) {
        this.address_id = address_id;
    }

    /**
     * This method returns the value of the database column customer.active
     *
     * @return the value of customer.active
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Boolean getActive() {
        return active;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Customer withActive(Boolean active) {
        this.setActive(active);
        return this;
    }

    /**
     * This method sets the value of the database column customer.active
     *
     * @param active the value for customer.active
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * This method returns the value of the database column customer.create_date
     *
     * @return the value of customer.create_date
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Date getCreate_date() {
        return create_date;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Customer withCreate_date(Date create_date) {
        this.setCreate_date(create_date);
        return this;
    }

    /**
     * This method sets the value of the database column customer.create_date
     *
     * @param create_date the value for customer.create_date
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    /**
     * This method returns the value of the database column customer.last_update
     *
     * @return the value of customer.last_update
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Date getLast_update() {
        return last_update;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Customer withLast_update(Date last_update) {
        this.setLast_update(last_update);
        return this;
    }

    /**
     * This method sets the value of the database column customer.last_update
     *
     * @param last_update the value for customer.last_update
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void setLast_update(Date last_update) {
        this.last_update = last_update;
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
        sb.append(", customer_id=").append(customer_id);
        sb.append(", store_id=").append(store_id);
        sb.append(", first_name=").append(first_name);
        sb.append(", last_name=").append(last_name);
        sb.append(", email=").append(email);
        sb.append(", address_id=").append(address_id);
        sb.append(", active=").append(active);
        sb.append(", create_date=").append(create_date);
        sb.append(", last_update=").append(last_update);
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
        Customer other = (Customer) that;
        return (this.getCustomer_id() == null ? other.getCustomer_id() == null : this.getCustomer_id().equals(other.getCustomer_id()))
            && (this.getStore_id() == null ? other.getStore_id() == null : this.getStore_id().equals(other.getStore_id()))
            && (this.getFirst_name() == null ? other.getFirst_name() == null : this.getFirst_name().equals(other.getFirst_name()))
            && (this.getLast_name() == null ? other.getLast_name() == null : this.getLast_name().equals(other.getLast_name()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAddress_id() == null ? other.getAddress_id() == null : this.getAddress_id().equals(other.getAddress_id()))
            && (this.getActive() == null ? other.getActive() == null : this.getActive().equals(other.getActive()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getLast_update() == null ? other.getLast_update() == null : this.getLast_update().equals(other.getLast_update()));
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomer_id() == null) ? 0 : getCustomer_id().hashCode());
        result = prime * result + ((getStore_id() == null) ? 0 : getStore_id().hashCode());
        result = prime * result + ((getFirst_name() == null) ? 0 : getFirst_name().hashCode());
        result = prime * result + ((getLast_name() == null) ? 0 : getLast_name().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAddress_id() == null) ? 0 : getAddress_id().hashCode());
        result = prime * result + ((getActive() == null) ? 0 : getActive().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getLast_update() == null) ? 0 : getLast_update().hashCode());
        return result;
    }
}