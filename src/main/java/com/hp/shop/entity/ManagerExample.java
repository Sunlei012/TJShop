package com.hp.shop.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

public class ManagerExample {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public ManagerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
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
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
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

        public Criteria andM_idIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andM_idIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andM_idEqualTo(Integer value) {
            addCriterion("m_id =", value, "m_id");
            return (Criteria) this;
        }

        public Criteria andM_idNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "m_id");
            return (Criteria) this;
        }

        public Criteria andM_idGreaterThan(Integer value) {
            addCriterion("m_id >", value, "m_id");
            return (Criteria) this;
        }

        public Criteria andM_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "m_id");
            return (Criteria) this;
        }

        public Criteria andM_idLessThan(Integer value) {
            addCriterion("m_id <", value, "m_id");
            return (Criteria) this;
        }

        public Criteria andM_idLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "m_id");
            return (Criteria) this;
        }

        public Criteria andM_idIn(List<Integer> values) {
            addCriterion("m_id in", values, "m_id");
            return (Criteria) this;
        }

        public Criteria andM_idNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "m_id");
            return (Criteria) this;
        }

        public Criteria andM_idBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "m_id");
            return (Criteria) this;
        }

        public Criteria andM_idNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "m_id");
            return (Criteria) this;
        }

        public Criteria andM_nameIsNull() {
            addCriterion("m_name is null");
            return (Criteria) this;
        }

        public Criteria andM_nameIsNotNull() {
            addCriterion("m_name is not null");
            return (Criteria) this;
        }

        public Criteria andM_nameEqualTo(String value) {
            addCriterion("m_name =", value, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameNotEqualTo(String value) {
            addCriterion("m_name <>", value, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameGreaterThan(String value) {
            addCriterion("m_name >", value, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameGreaterThanOrEqualTo(String value) {
            addCriterion("m_name >=", value, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameLessThan(String value) {
            addCriterion("m_name <", value, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameLessThanOrEqualTo(String value) {
            addCriterion("m_name <=", value, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameLike(String value) {
            addCriterion("m_name like", value, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameNotLike(String value) {
            addCriterion("m_name not like", value, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameIn(List<String> values) {
            addCriterion("m_name in", values, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameNotIn(List<String> values) {
            addCriterion("m_name not in", values, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameBetween(String value1, String value2) {
            addCriterion("m_name between", value1, value2, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameNotBetween(String value1, String value2) {
            addCriterion("m_name not between", value1, value2, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_passwordIsNull() {
            addCriterion("m_password is null");
            return (Criteria) this;
        }

        public Criteria andM_passwordIsNotNull() {
            addCriterion("m_password is not null");
            return (Criteria) this;
        }

        public Criteria andM_passwordEqualTo(String value) {
            addCriterion("m_password =", value, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordNotEqualTo(String value) {
            addCriterion("m_password <>", value, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordGreaterThan(String value) {
            addCriterion("m_password >", value, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("m_password >=", value, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordLessThan(String value) {
            addCriterion("m_password <", value, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordLessThanOrEqualTo(String value) {
            addCriterion("m_password <=", value, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordLike(String value) {
            addCriterion("m_password like", value, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordNotLike(String value) {
            addCriterion("m_password not like", value, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordIn(List<String> values) {
            addCriterion("m_password in", values, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordNotIn(List<String> values) {
            addCriterion("m_password not in", values, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordBetween(String value1, String value2) {
            addCriterion("m_password between", value1, value2, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordNotBetween(String value1, String value2) {
            addCriterion("m_password not between", value1, value2, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_nameLikeInsensitive(String value) {
            addCriterion("upper(m_name) like", value.toUpperCase(), "m_name");
            return (Criteria) this;
        }

        public Criteria andM_passwordLikeInsensitive(String value) {
            addCriterion("upper(m_password) like", value.toUpperCase(), "m_password");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Mon Feb 18 10:35:47 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:47 CST 2019
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