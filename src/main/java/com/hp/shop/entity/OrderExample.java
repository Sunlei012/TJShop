package com.hp.shop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

public class OrderExample {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOrder_IdIsNull() {
            addCriterion("order_Id is null");
            return (Criteria) this;
        }

        public Criteria andOrder_IdIsNotNull() {
            addCriterion("order_Id is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_IdEqualTo(String value) {
            addCriterion("order_Id =", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdNotEqualTo(String value) {
            addCriterion("order_Id <>", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdGreaterThan(String value) {
            addCriterion("order_Id >", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdGreaterThanOrEqualTo(String value) {
            addCriterion("order_Id >=", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdLessThan(String value) {
            addCriterion("order_Id <", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdLessThanOrEqualTo(String value) {
            addCriterion("order_Id <=", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdLike(String value) {
            addCriterion("order_Id like", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdNotLike(String value) {
            addCriterion("order_Id not like", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdIn(List<String> values) {
            addCriterion("order_Id in", values, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdNotIn(List<String> values) {
            addCriterion("order_Id not in", values, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdBetween(String value1, String value2) {
            addCriterion("order_Id between", value1, value2, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdNotBetween(String value1, String value2) {
            addCriterion("order_Id not between", value1, value2, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_UserIsNull() {
            addCriterion("order_User is null");
            return (Criteria) this;
        }

        public Criteria andOrder_UserIsNotNull() {
            addCriterion("order_User is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_UserEqualTo(Integer value) {
            addCriterion("order_User =", value, "order_User");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNotEqualTo(Integer value) {
            addCriterion("order_User <>", value, "order_User");
            return (Criteria) this;
        }

        public Criteria andOrder_UserGreaterThan(Integer value) {
            addCriterion("order_User >", value, "order_User");
            return (Criteria) this;
        }

        public Criteria andOrder_UserGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_User >=", value, "order_User");
            return (Criteria) this;
        }

        public Criteria andOrder_UserLessThan(Integer value) {
            addCriterion("order_User <", value, "order_User");
            return (Criteria) this;
        }

        public Criteria andOrder_UserLessThanOrEqualTo(Integer value) {
            addCriterion("order_User <=", value, "order_User");
            return (Criteria) this;
        }

        public Criteria andOrder_UserIn(List<Integer> values) {
            addCriterion("order_User in", values, "order_User");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNotIn(List<Integer> values) {
            addCriterion("order_User not in", values, "order_User");
            return (Criteria) this;
        }

        public Criteria andOrder_UserBetween(Integer value1, Integer value2) {
            addCriterion("order_User between", value1, value2, "order_User");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNotBetween(Integer value1, Integer value2) {
            addCriterion("order_User not between", value1, value2, "order_User");
            return (Criteria) this;
        }

        public Criteria andOrder_DateIsNull() {
            addCriterion("order_Date is null");
            return (Criteria) this;
        }

        public Criteria andOrder_DateIsNotNull() {
            addCriterion("order_Date is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_DateEqualTo(Date value) {
            addCriterionForJDBCDate("order_Date =", value, "order_Date");
            return (Criteria) this;
        }

        public Criteria andOrder_DateNotEqualTo(Date value) {
            addCriterionForJDBCDate("order_Date <>", value, "order_Date");
            return (Criteria) this;
        }

        public Criteria andOrder_DateGreaterThan(Date value) {
            addCriterionForJDBCDate("order_Date >", value, "order_Date");
            return (Criteria) this;
        }

        public Criteria andOrder_DateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_Date >=", value, "order_Date");
            return (Criteria) this;
        }

        public Criteria andOrder_DateLessThan(Date value) {
            addCriterionForJDBCDate("order_Date <", value, "order_Date");
            return (Criteria) this;
        }

        public Criteria andOrder_DateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_Date <=", value, "order_Date");
            return (Criteria) this;
        }

        public Criteria andOrder_DateIn(List<Date> values) {
            addCriterionForJDBCDate("order_Date in", values, "order_Date");
            return (Criteria) this;
        }

        public Criteria andOrder_DateNotIn(List<Date> values) {
            addCriterionForJDBCDate("order_Date not in", values, "order_Date");
            return (Criteria) this;
        }

        public Criteria andOrder_DateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_Date between", value1, value2, "order_Date");
            return (Criteria) this;
        }

        public Criteria andOrder_DateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_Date not between", value1, value2, "order_Date");
            return (Criteria) this;
        }

        public Criteria andOrder_PriceIsNull() {
            addCriterion("order_Price is null");
            return (Criteria) this;
        }

        public Criteria andOrder_PriceIsNotNull() {
            addCriterion("order_Price is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_PriceEqualTo(Double value) {
            addCriterion("order_Price =", value, "order_Price");
            return (Criteria) this;
        }

        public Criteria andOrder_PriceNotEqualTo(Double value) {
            addCriterion("order_Price <>", value, "order_Price");
            return (Criteria) this;
        }

        public Criteria andOrder_PriceGreaterThan(Double value) {
            addCriterion("order_Price >", value, "order_Price");
            return (Criteria) this;
        }

        public Criteria andOrder_PriceGreaterThanOrEqualTo(Double value) {
            addCriterion("order_Price >=", value, "order_Price");
            return (Criteria) this;
        }

        public Criteria andOrder_PriceLessThan(Double value) {
            addCriterion("order_Price <", value, "order_Price");
            return (Criteria) this;
        }

        public Criteria andOrder_PriceLessThanOrEqualTo(Double value) {
            addCriterion("order_Price <=", value, "order_Price");
            return (Criteria) this;
        }

        public Criteria andOrder_PriceIn(List<Double> values) {
            addCriterion("order_Price in", values, "order_Price");
            return (Criteria) this;
        }

        public Criteria andOrder_PriceNotIn(List<Double> values) {
            addCriterion("order_Price not in", values, "order_Price");
            return (Criteria) this;
        }

        public Criteria andOrder_PriceBetween(Double value1, Double value2) {
            addCriterion("order_Price between", value1, value2, "order_Price");
            return (Criteria) this;
        }

        public Criteria andOrder_PriceNotBetween(Double value1, Double value2) {
            addCriterion("order_Price not between", value1, value2, "order_Price");
            return (Criteria) this;
        }

        public Criteria andOrder_StateIsNull() {
            addCriterion("order_State is null");
            return (Criteria) this;
        }

        public Criteria andOrder_StateIsNotNull() {
            addCriterion("order_State is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_StateEqualTo(Integer value) {
            addCriterion("order_State =", value, "order_State");
            return (Criteria) this;
        }

        public Criteria andOrder_StateNotEqualTo(Integer value) {
            addCriterion("order_State <>", value, "order_State");
            return (Criteria) this;
        }

        public Criteria andOrder_StateGreaterThan(Integer value) {
            addCriterion("order_State >", value, "order_State");
            return (Criteria) this;
        }

        public Criteria andOrder_StateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_State >=", value, "order_State");
            return (Criteria) this;
        }

        public Criteria andOrder_StateLessThan(Integer value) {
            addCriterion("order_State <", value, "order_State");
            return (Criteria) this;
        }

        public Criteria andOrder_StateLessThanOrEqualTo(Integer value) {
            addCriterion("order_State <=", value, "order_State");
            return (Criteria) this;
        }

        public Criteria andOrder_StateIn(List<Integer> values) {
            addCriterion("order_State in", values, "order_State");
            return (Criteria) this;
        }

        public Criteria andOrder_StateNotIn(List<Integer> values) {
            addCriterion("order_State not in", values, "order_State");
            return (Criteria) this;
        }

        public Criteria andOrder_StateBetween(Integer value1, Integer value2) {
            addCriterion("order_State between", value1, value2, "order_State");
            return (Criteria) this;
        }

        public Criteria andOrder_StateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_State not between", value1, value2, "order_State");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNameIsNull() {
            addCriterion("order_UserName is null");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNameIsNotNull() {
            addCriterion("order_UserName is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNameEqualTo(String value) {
            addCriterion("order_UserName =", value, "order_UserName");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNameNotEqualTo(String value) {
            addCriterion("order_UserName <>", value, "order_UserName");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNameGreaterThan(String value) {
            addCriterion("order_UserName >", value, "order_UserName");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_UserName >=", value, "order_UserName");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNameLessThan(String value) {
            addCriterion("order_UserName <", value, "order_UserName");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNameLessThanOrEqualTo(String value) {
            addCriterion("order_UserName <=", value, "order_UserName");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNameLike(String value) {
            addCriterion("order_UserName like", value, "order_UserName");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNameNotLike(String value) {
            addCriterion("order_UserName not like", value, "order_UserName");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNameIn(List<String> values) {
            addCriterion("order_UserName in", values, "order_UserName");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNameNotIn(List<String> values) {
            addCriterion("order_UserName not in", values, "order_UserName");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNameBetween(String value1, String value2) {
            addCriterion("order_UserName between", value1, value2, "order_UserName");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNameNotBetween(String value1, String value2) {
            addCriterion("order_UserName not between", value1, value2, "order_UserName");
            return (Criteria) this;
        }

        public Criteria andOrder_PhoneIsNull() {
            addCriterion("order_Phone is null");
            return (Criteria) this;
        }

        public Criteria andOrder_PhoneIsNotNull() {
            addCriterion("order_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_PhoneEqualTo(String value) {
            addCriterion("order_Phone =", value, "order_Phone");
            return (Criteria) this;
        }

        public Criteria andOrder_PhoneNotEqualTo(String value) {
            addCriterion("order_Phone <>", value, "order_Phone");
            return (Criteria) this;
        }

        public Criteria andOrder_PhoneGreaterThan(String value) {
            addCriterion("order_Phone >", value, "order_Phone");
            return (Criteria) this;
        }

        public Criteria andOrder_PhoneGreaterThanOrEqualTo(String value) {
            addCriterion("order_Phone >=", value, "order_Phone");
            return (Criteria) this;
        }

        public Criteria andOrder_PhoneLessThan(String value) {
            addCriterion("order_Phone <", value, "order_Phone");
            return (Criteria) this;
        }

        public Criteria andOrder_PhoneLessThanOrEqualTo(String value) {
            addCriterion("order_Phone <=", value, "order_Phone");
            return (Criteria) this;
        }

        public Criteria andOrder_PhoneLike(String value) {
            addCriterion("order_Phone like", value, "order_Phone");
            return (Criteria) this;
        }

        public Criteria andOrder_PhoneNotLike(String value) {
            addCriterion("order_Phone not like", value, "order_Phone");
            return (Criteria) this;
        }

        public Criteria andOrder_PhoneIn(List<String> values) {
            addCriterion("order_Phone in", values, "order_Phone");
            return (Criteria) this;
        }

        public Criteria andOrder_PhoneNotIn(List<String> values) {
            addCriterion("order_Phone not in", values, "order_Phone");
            return (Criteria) this;
        }

        public Criteria andOrder_PhoneBetween(String value1, String value2) {
            addCriterion("order_Phone between", value1, value2, "order_Phone");
            return (Criteria) this;
        }

        public Criteria andOrder_PhoneNotBetween(String value1, String value2) {
            addCriterion("order_Phone not between", value1, value2, "order_Phone");
            return (Criteria) this;
        }

        public Criteria andOrder_AddressIsNull() {
            addCriterion("order_Address is null");
            return (Criteria) this;
        }

        public Criteria andOrder_AddressIsNotNull() {
            addCriterion("order_Address is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_AddressEqualTo(String value) {
            addCriterion("order_Address =", value, "order_Address");
            return (Criteria) this;
        }

        public Criteria andOrder_AddressNotEqualTo(String value) {
            addCriterion("order_Address <>", value, "order_Address");
            return (Criteria) this;
        }

        public Criteria andOrder_AddressGreaterThan(String value) {
            addCriterion("order_Address >", value, "order_Address");
            return (Criteria) this;
        }

        public Criteria andOrder_AddressGreaterThanOrEqualTo(String value) {
            addCriterion("order_Address >=", value, "order_Address");
            return (Criteria) this;
        }

        public Criteria andOrder_AddressLessThan(String value) {
            addCriterion("order_Address <", value, "order_Address");
            return (Criteria) this;
        }

        public Criteria andOrder_AddressLessThanOrEqualTo(String value) {
            addCriterion("order_Address <=", value, "order_Address");
            return (Criteria) this;
        }

        public Criteria andOrder_AddressLike(String value) {
            addCriterion("order_Address like", value, "order_Address");
            return (Criteria) this;
        }

        public Criteria andOrder_AddressNotLike(String value) {
            addCriterion("order_Address not like", value, "order_Address");
            return (Criteria) this;
        }

        public Criteria andOrder_AddressIn(List<String> values) {
            addCriterion("order_Address in", values, "order_Address");
            return (Criteria) this;
        }

        public Criteria andOrder_AddressNotIn(List<String> values) {
            addCriterion("order_Address not in", values, "order_Address");
            return (Criteria) this;
        }

        public Criteria andOrder_AddressBetween(String value1, String value2) {
            addCriterion("order_Address between", value1, value2, "order_Address");
            return (Criteria) this;
        }

        public Criteria andOrder_AddressNotBetween(String value1, String value2) {
            addCriterion("order_Address not between", value1, value2, "order_Address");
            return (Criteria) this;
        }

        public Criteria andOrder_ExpressNoIsNull() {
            addCriterion("order_ExpressNo is null");
            return (Criteria) this;
        }

        public Criteria andOrder_ExpressNoIsNotNull() {
            addCriterion("order_ExpressNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_ExpressNoEqualTo(String value) {
            addCriterion("order_ExpressNo =", value, "order_ExpressNo");
            return (Criteria) this;
        }

        public Criteria andOrder_ExpressNoNotEqualTo(String value) {
            addCriterion("order_ExpressNo <>", value, "order_ExpressNo");
            return (Criteria) this;
        }

        public Criteria andOrder_ExpressNoGreaterThan(String value) {
            addCriterion("order_ExpressNo >", value, "order_ExpressNo");
            return (Criteria) this;
        }

        public Criteria andOrder_ExpressNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_ExpressNo >=", value, "order_ExpressNo");
            return (Criteria) this;
        }

        public Criteria andOrder_ExpressNoLessThan(String value) {
            addCriterion("order_ExpressNo <", value, "order_ExpressNo");
            return (Criteria) this;
        }

        public Criteria andOrder_ExpressNoLessThanOrEqualTo(String value) {
            addCriterion("order_ExpressNo <=", value, "order_ExpressNo");
            return (Criteria) this;
        }

        public Criteria andOrder_ExpressNoLike(String value) {
            addCriterion("order_ExpressNo like", value, "order_ExpressNo");
            return (Criteria) this;
        }

        public Criteria andOrder_ExpressNoNotLike(String value) {
            addCriterion("order_ExpressNo not like", value, "order_ExpressNo");
            return (Criteria) this;
        }

        public Criteria andOrder_ExpressNoIn(List<String> values) {
            addCriterion("order_ExpressNo in", values, "order_ExpressNo");
            return (Criteria) this;
        }

        public Criteria andOrder_ExpressNoNotIn(List<String> values) {
            addCriterion("order_ExpressNo not in", values, "order_ExpressNo");
            return (Criteria) this;
        }

        public Criteria andOrder_ExpressNoBetween(String value1, String value2) {
            addCriterion("order_ExpressNo between", value1, value2, "order_ExpressNo");
            return (Criteria) this;
        }

        public Criteria andOrder_ExpressNoNotBetween(String value1, String value2) {
            addCriterion("order_ExpressNo not between", value1, value2, "order_ExpressNo");
            return (Criteria) this;
        }

        public Criteria andOrder_IdLikeInsensitive(String value) {
            addCriterion("upper(order_Id) like", value.toUpperCase(), "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_UserNameLikeInsensitive(String value) {
            addCriterion("upper(order_UserName) like", value.toUpperCase(), "order_UserName");
            return (Criteria) this;
        }

        public Criteria andOrder_PhoneLikeInsensitive(String value) {
            addCriterion("upper(order_Phone) like", value.toUpperCase(), "order_Phone");
            return (Criteria) this;
        }

        public Criteria andOrder_AddressLikeInsensitive(String value) {
            addCriterion("upper(order_Address) like", value.toUpperCase(), "order_Address");
            return (Criteria) this;
        }

        public Criteria andOrder_ExpressNoLikeInsensitive(String value) {
            addCriterion("upper(order_ExpressNo) like", value.toUpperCase(), "order_ExpressNo");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Mon Feb 18 10:35:46 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:46 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}