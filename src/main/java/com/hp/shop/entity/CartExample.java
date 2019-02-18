package com.hp.shop.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

public class CartExample {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public CartExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
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
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
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

        public Criteria andCart_IdIsNull() {
            addCriterion("cart_Id is null");
            return (Criteria) this;
        }

        public Criteria andCart_IdIsNotNull() {
            addCriterion("cart_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCart_IdEqualTo(Integer value) {
            addCriterion("cart_Id =", value, "cart_Id");
            return (Criteria) this;
        }

        public Criteria andCart_IdNotEqualTo(Integer value) {
            addCriterion("cart_Id <>", value, "cart_Id");
            return (Criteria) this;
        }

        public Criteria andCart_IdGreaterThan(Integer value) {
            addCriterion("cart_Id >", value, "cart_Id");
            return (Criteria) this;
        }

        public Criteria andCart_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_Id >=", value, "cart_Id");
            return (Criteria) this;
        }

        public Criteria andCart_IdLessThan(Integer value) {
            addCriterion("cart_Id <", value, "cart_Id");
            return (Criteria) this;
        }

        public Criteria andCart_IdLessThanOrEqualTo(Integer value) {
            addCriterion("cart_Id <=", value, "cart_Id");
            return (Criteria) this;
        }

        public Criteria andCart_IdIn(List<Integer> values) {
            addCriterion("cart_Id in", values, "cart_Id");
            return (Criteria) this;
        }

        public Criteria andCart_IdNotIn(List<Integer> values) {
            addCriterion("cart_Id not in", values, "cart_Id");
            return (Criteria) this;
        }

        public Criteria andCart_IdBetween(Integer value1, Integer value2) {
            addCriterion("cart_Id between", value1, value2, "cart_Id");
            return (Criteria) this;
        }

        public Criteria andCart_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_Id not between", value1, value2, "cart_Id");
            return (Criteria) this;
        }

        public Criteria andCart_GoodsIsNull() {
            addCriterion("cart_Goods is null");
            return (Criteria) this;
        }

        public Criteria andCart_GoodsIsNotNull() {
            addCriterion("cart_Goods is not null");
            return (Criteria) this;
        }

        public Criteria andCart_GoodsEqualTo(Integer value) {
            addCriterion("cart_Goods =", value, "cart_Goods");
            return (Criteria) this;
        }

        public Criteria andCart_GoodsNotEqualTo(Integer value) {
            addCriterion("cart_Goods <>", value, "cart_Goods");
            return (Criteria) this;
        }

        public Criteria andCart_GoodsGreaterThan(Integer value) {
            addCriterion("cart_Goods >", value, "cart_Goods");
            return (Criteria) this;
        }

        public Criteria andCart_GoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_Goods >=", value, "cart_Goods");
            return (Criteria) this;
        }

        public Criteria andCart_GoodsLessThan(Integer value) {
            addCriterion("cart_Goods <", value, "cart_Goods");
            return (Criteria) this;
        }

        public Criteria andCart_GoodsLessThanOrEqualTo(Integer value) {
            addCriterion("cart_Goods <=", value, "cart_Goods");
            return (Criteria) this;
        }

        public Criteria andCart_GoodsIn(List<Integer> values) {
            addCriterion("cart_Goods in", values, "cart_Goods");
            return (Criteria) this;
        }

        public Criteria andCart_GoodsNotIn(List<Integer> values) {
            addCriterion("cart_Goods not in", values, "cart_Goods");
            return (Criteria) this;
        }

        public Criteria andCart_GoodsBetween(Integer value1, Integer value2) {
            addCriterion("cart_Goods between", value1, value2, "cart_Goods");
            return (Criteria) this;
        }

        public Criteria andCart_GoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_Goods not between", value1, value2, "cart_Goods");
            return (Criteria) this;
        }

        public Criteria andCart_NumIsNull() {
            addCriterion("cart_Num is null");
            return (Criteria) this;
        }

        public Criteria andCart_NumIsNotNull() {
            addCriterion("cart_Num is not null");
            return (Criteria) this;
        }

        public Criteria andCart_NumEqualTo(Integer value) {
            addCriterion("cart_Num =", value, "cart_Num");
            return (Criteria) this;
        }

        public Criteria andCart_NumNotEqualTo(Integer value) {
            addCriterion("cart_Num <>", value, "cart_Num");
            return (Criteria) this;
        }

        public Criteria andCart_NumGreaterThan(Integer value) {
            addCriterion("cart_Num >", value, "cart_Num");
            return (Criteria) this;
        }

        public Criteria andCart_NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_Num >=", value, "cart_Num");
            return (Criteria) this;
        }

        public Criteria andCart_NumLessThan(Integer value) {
            addCriterion("cart_Num <", value, "cart_Num");
            return (Criteria) this;
        }

        public Criteria andCart_NumLessThanOrEqualTo(Integer value) {
            addCriterion("cart_Num <=", value, "cart_Num");
            return (Criteria) this;
        }

        public Criteria andCart_NumIn(List<Integer> values) {
            addCriterion("cart_Num in", values, "cart_Num");
            return (Criteria) this;
        }

        public Criteria andCart_NumNotIn(List<Integer> values) {
            addCriterion("cart_Num not in", values, "cart_Num");
            return (Criteria) this;
        }

        public Criteria andCart_NumBetween(Integer value1, Integer value2) {
            addCriterion("cart_Num between", value1, value2, "cart_Num");
            return (Criteria) this;
        }

        public Criteria andCart_NumNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_Num not between", value1, value2, "cart_Num");
            return (Criteria) this;
        }

        public Criteria andCart_PriceIsNull() {
            addCriterion("cart_Price is null");
            return (Criteria) this;
        }

        public Criteria andCart_PriceIsNotNull() {
            addCriterion("cart_Price is not null");
            return (Criteria) this;
        }

        public Criteria andCart_PriceEqualTo(Double value) {
            addCriterion("cart_Price =", value, "cart_Price");
            return (Criteria) this;
        }

        public Criteria andCart_PriceNotEqualTo(Double value) {
            addCriterion("cart_Price <>", value, "cart_Price");
            return (Criteria) this;
        }

        public Criteria andCart_PriceGreaterThan(Double value) {
            addCriterion("cart_Price >", value, "cart_Price");
            return (Criteria) this;
        }

        public Criteria andCart_PriceGreaterThanOrEqualTo(Double value) {
            addCriterion("cart_Price >=", value, "cart_Price");
            return (Criteria) this;
        }

        public Criteria andCart_PriceLessThan(Double value) {
            addCriterion("cart_Price <", value, "cart_Price");
            return (Criteria) this;
        }

        public Criteria andCart_PriceLessThanOrEqualTo(Double value) {
            addCriterion("cart_Price <=", value, "cart_Price");
            return (Criteria) this;
        }

        public Criteria andCart_PriceIn(List<Double> values) {
            addCriterion("cart_Price in", values, "cart_Price");
            return (Criteria) this;
        }

        public Criteria andCart_PriceNotIn(List<Double> values) {
            addCriterion("cart_Price not in", values, "cart_Price");
            return (Criteria) this;
        }

        public Criteria andCart_PriceBetween(Double value1, Double value2) {
            addCriterion("cart_Price between", value1, value2, "cart_Price");
            return (Criteria) this;
        }

        public Criteria andCart_PriceNotBetween(Double value1, Double value2) {
            addCriterion("cart_Price not between", value1, value2, "cart_Price");
            return (Criteria) this;
        }

        public Criteria andCart_UserIsNull() {
            addCriterion("cart_User is null");
            return (Criteria) this;
        }

        public Criteria andCart_UserIsNotNull() {
            addCriterion("cart_User is not null");
            return (Criteria) this;
        }

        public Criteria andCart_UserEqualTo(Integer value) {
            addCriterion("cart_User =", value, "cart_User");
            return (Criteria) this;
        }

        public Criteria andCart_UserNotEqualTo(Integer value) {
            addCriterion("cart_User <>", value, "cart_User");
            return (Criteria) this;
        }

        public Criteria andCart_UserGreaterThan(Integer value) {
            addCriterion("cart_User >", value, "cart_User");
            return (Criteria) this;
        }

        public Criteria andCart_UserGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_User >=", value, "cart_User");
            return (Criteria) this;
        }

        public Criteria andCart_UserLessThan(Integer value) {
            addCriterion("cart_User <", value, "cart_User");
            return (Criteria) this;
        }

        public Criteria andCart_UserLessThanOrEqualTo(Integer value) {
            addCriterion("cart_User <=", value, "cart_User");
            return (Criteria) this;
        }

        public Criteria andCart_UserIn(List<Integer> values) {
            addCriterion("cart_User in", values, "cart_User");
            return (Criteria) this;
        }

        public Criteria andCart_UserNotIn(List<Integer> values) {
            addCriterion("cart_User not in", values, "cart_User");
            return (Criteria) this;
        }

        public Criteria andCart_UserBetween(Integer value1, Integer value2) {
            addCriterion("cart_User between", value1, value2, "cart_User");
            return (Criteria) this;
        }

        public Criteria andCart_UserNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_User not between", value1, value2, "cart_User");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Mon Feb 18 10:35:48 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:48 CST 2019
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