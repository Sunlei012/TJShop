package com.hp.shop.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

public class ReceiverExample {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public ReceiverExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
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
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
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

        public Criteria andRe_idIsNull() {
            addCriterion("re_id is null");
            return (Criteria) this;
        }

        public Criteria andRe_idIsNotNull() {
            addCriterion("re_id is not null");
            return (Criteria) this;
        }

        public Criteria andRe_idEqualTo(Integer value) {
            addCriterion("re_id =", value, "re_id");
            return (Criteria) this;
        }

        public Criteria andRe_idNotEqualTo(Integer value) {
            addCriterion("re_id <>", value, "re_id");
            return (Criteria) this;
        }

        public Criteria andRe_idGreaterThan(Integer value) {
            addCriterion("re_id >", value, "re_id");
            return (Criteria) this;
        }

        public Criteria andRe_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("re_id >=", value, "re_id");
            return (Criteria) this;
        }

        public Criteria andRe_idLessThan(Integer value) {
            addCriterion("re_id <", value, "re_id");
            return (Criteria) this;
        }

        public Criteria andRe_idLessThanOrEqualTo(Integer value) {
            addCriterion("re_id <=", value, "re_id");
            return (Criteria) this;
        }

        public Criteria andRe_idIn(List<Integer> values) {
            addCriterion("re_id in", values, "re_id");
            return (Criteria) this;
        }

        public Criteria andRe_idNotIn(List<Integer> values) {
            addCriterion("re_id not in", values, "re_id");
            return (Criteria) this;
        }

        public Criteria andRe_idBetween(Integer value1, Integer value2) {
            addCriterion("re_id between", value1, value2, "re_id");
            return (Criteria) this;
        }

        public Criteria andRe_idNotBetween(Integer value1, Integer value2) {
            addCriterion("re_id not between", value1, value2, "re_id");
            return (Criteria) this;
        }

        public Criteria andC_idIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andC_idIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andC_idEqualTo(Integer value) {
            addCriterion("c_id =", value, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idGreaterThan(Integer value) {
            addCriterion("c_id >", value, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idLessThan(Integer value) {
            addCriterion("c_id <", value, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idIn(List<Integer> values) {
            addCriterion("c_id in", values, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "c_id");
            return (Criteria) this;
        }

        public Criteria andC_idNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "c_id");
            return (Criteria) this;
        }

        public Criteria andRe_nameIsNull() {
            addCriterion("re_name is null");
            return (Criteria) this;
        }

        public Criteria andRe_nameIsNotNull() {
            addCriterion("re_name is not null");
            return (Criteria) this;
        }

        public Criteria andRe_nameEqualTo(String value) {
            addCriterion("re_name =", value, "re_name");
            return (Criteria) this;
        }

        public Criteria andRe_nameNotEqualTo(String value) {
            addCriterion("re_name <>", value, "re_name");
            return (Criteria) this;
        }

        public Criteria andRe_nameGreaterThan(String value) {
            addCriterion("re_name >", value, "re_name");
            return (Criteria) this;
        }

        public Criteria andRe_nameGreaterThanOrEqualTo(String value) {
            addCriterion("re_name >=", value, "re_name");
            return (Criteria) this;
        }

        public Criteria andRe_nameLessThan(String value) {
            addCriterion("re_name <", value, "re_name");
            return (Criteria) this;
        }

        public Criteria andRe_nameLessThanOrEqualTo(String value) {
            addCriterion("re_name <=", value, "re_name");
            return (Criteria) this;
        }

        public Criteria andRe_nameLike(String value) {
            addCriterion("re_name like", value, "re_name");
            return (Criteria) this;
        }

        public Criteria andRe_nameNotLike(String value) {
            addCriterion("re_name not like", value, "re_name");
            return (Criteria) this;
        }

        public Criteria andRe_nameIn(List<String> values) {
            addCriterion("re_name in", values, "re_name");
            return (Criteria) this;
        }

        public Criteria andRe_nameNotIn(List<String> values) {
            addCriterion("re_name not in", values, "re_name");
            return (Criteria) this;
        }

        public Criteria andRe_nameBetween(String value1, String value2) {
            addCriterion("re_name between", value1, value2, "re_name");
            return (Criteria) this;
        }

        public Criteria andRe_nameNotBetween(String value1, String value2) {
            addCriterion("re_name not between", value1, value2, "re_name");
            return (Criteria) this;
        }

        public Criteria andRe_addressIsNull() {
            addCriterion("re_address is null");
            return (Criteria) this;
        }

        public Criteria andRe_addressIsNotNull() {
            addCriterion("re_address is not null");
            return (Criteria) this;
        }

        public Criteria andRe_addressEqualTo(String value) {
            addCriterion("re_address =", value, "re_address");
            return (Criteria) this;
        }

        public Criteria andRe_addressNotEqualTo(String value) {
            addCriterion("re_address <>", value, "re_address");
            return (Criteria) this;
        }

        public Criteria andRe_addressGreaterThan(String value) {
            addCriterion("re_address >", value, "re_address");
            return (Criteria) this;
        }

        public Criteria andRe_addressGreaterThanOrEqualTo(String value) {
            addCriterion("re_address >=", value, "re_address");
            return (Criteria) this;
        }

        public Criteria andRe_addressLessThan(String value) {
            addCriterion("re_address <", value, "re_address");
            return (Criteria) this;
        }

        public Criteria andRe_addressLessThanOrEqualTo(String value) {
            addCriterion("re_address <=", value, "re_address");
            return (Criteria) this;
        }

        public Criteria andRe_addressLike(String value) {
            addCriterion("re_address like", value, "re_address");
            return (Criteria) this;
        }

        public Criteria andRe_addressNotLike(String value) {
            addCriterion("re_address not like", value, "re_address");
            return (Criteria) this;
        }

        public Criteria andRe_addressIn(List<String> values) {
            addCriterion("re_address in", values, "re_address");
            return (Criteria) this;
        }

        public Criteria andRe_addressNotIn(List<String> values) {
            addCriterion("re_address not in", values, "re_address");
            return (Criteria) this;
        }

        public Criteria andRe_addressBetween(String value1, String value2) {
            addCriterion("re_address between", value1, value2, "re_address");
            return (Criteria) this;
        }

        public Criteria andRe_addressNotBetween(String value1, String value2) {
            addCriterion("re_address not between", value1, value2, "re_address");
            return (Criteria) this;
        }

        public Criteria andRe_mobileIsNull() {
            addCriterion("re_mobile is null");
            return (Criteria) this;
        }

        public Criteria andRe_mobileIsNotNull() {
            addCriterion("re_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andRe_mobileEqualTo(Integer value) {
            addCriterion("re_mobile =", value, "re_mobile");
            return (Criteria) this;
        }

        public Criteria andRe_mobileNotEqualTo(Integer value) {
            addCriterion("re_mobile <>", value, "re_mobile");
            return (Criteria) this;
        }

        public Criteria andRe_mobileGreaterThan(Integer value) {
            addCriterion("re_mobile >", value, "re_mobile");
            return (Criteria) this;
        }

        public Criteria andRe_mobileGreaterThanOrEqualTo(Integer value) {
            addCriterion("re_mobile >=", value, "re_mobile");
            return (Criteria) this;
        }

        public Criteria andRe_mobileLessThan(Integer value) {
            addCriterion("re_mobile <", value, "re_mobile");
            return (Criteria) this;
        }

        public Criteria andRe_mobileLessThanOrEqualTo(Integer value) {
            addCriterion("re_mobile <=", value, "re_mobile");
            return (Criteria) this;
        }

        public Criteria andRe_mobileIn(List<Integer> values) {
            addCriterion("re_mobile in", values, "re_mobile");
            return (Criteria) this;
        }

        public Criteria andRe_mobileNotIn(List<Integer> values) {
            addCriterion("re_mobile not in", values, "re_mobile");
            return (Criteria) this;
        }

        public Criteria andRe_mobileBetween(Integer value1, Integer value2) {
            addCriterion("re_mobile between", value1, value2, "re_mobile");
            return (Criteria) this;
        }

        public Criteria andRe_mobileNotBetween(Integer value1, Integer value2) {
            addCriterion("re_mobile not between", value1, value2, "re_mobile");
            return (Criteria) this;
        }

        public Criteria andRe_nameLikeInsensitive(String value) {
            addCriterion("upper(re_name) like", value.toUpperCase(), "re_name");
            return (Criteria) this;
        }

        public Criteria andRe_addressLikeInsensitive(String value) {
            addCriterion("upper(re_address) like", value.toUpperCase(), "re_address");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Mon Feb 18 10:35:45 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:45 CST 2019
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