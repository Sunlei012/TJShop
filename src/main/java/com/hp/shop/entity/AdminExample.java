package com.hp.shop.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

public class AdminExample {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public AdminExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
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
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
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

        public Criteria andA_idIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andA_idIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andA_idEqualTo(Integer value) {
            addCriterion("a_id =", value, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idGreaterThan(Integer value) {
            addCriterion("a_id >", value, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idLessThan(Integer value) {
            addCriterion("a_id <", value, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idIn(List<Integer> values) {
            addCriterion("a_id in", values, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_nameIsNull() {
            addCriterion("a_name is null");
            return (Criteria) this;
        }

        public Criteria andA_nameIsNotNull() {
            addCriterion("a_name is not null");
            return (Criteria) this;
        }

        public Criteria andA_nameEqualTo(String value) {
            addCriterion("a_name =", value, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameNotEqualTo(String value) {
            addCriterion("a_name <>", value, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameGreaterThan(String value) {
            addCriterion("a_name >", value, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameGreaterThanOrEqualTo(String value) {
            addCriterion("a_name >=", value, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameLessThan(String value) {
            addCriterion("a_name <", value, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameLessThanOrEqualTo(String value) {
            addCriterion("a_name <=", value, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameLike(String value) {
            addCriterion("a_name like", value, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameNotLike(String value) {
            addCriterion("a_name not like", value, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameIn(List<String> values) {
            addCriterion("a_name in", values, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameNotIn(List<String> values) {
            addCriterion("a_name not in", values, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameBetween(String value1, String value2) {
            addCriterion("a_name between", value1, value2, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameNotBetween(String value1, String value2) {
            addCriterion("a_name not between", value1, value2, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_passwordIsNull() {
            addCriterion("a_password is null");
            return (Criteria) this;
        }

        public Criteria andA_passwordIsNotNull() {
            addCriterion("a_password is not null");
            return (Criteria) this;
        }

        public Criteria andA_passwordEqualTo(String value) {
            addCriterion("a_password =", value, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordNotEqualTo(String value) {
            addCriterion("a_password <>", value, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordGreaterThan(String value) {
            addCriterion("a_password >", value, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("a_password >=", value, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordLessThan(String value) {
            addCriterion("a_password <", value, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordLessThanOrEqualTo(String value) {
            addCriterion("a_password <=", value, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordLike(String value) {
            addCriterion("a_password like", value, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordNotLike(String value) {
            addCriterion("a_password not like", value, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordIn(List<String> values) {
            addCriterion("a_password in", values, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordNotIn(List<String> values) {
            addCriterion("a_password not in", values, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordBetween(String value1, String value2) {
            addCriterion("a_password between", value1, value2, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordNotBetween(String value1, String value2) {
            addCriterion("a_password not between", value1, value2, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_nameLikeInsensitive(String value) {
            addCriterion("upper(a_name) like", value.toUpperCase(), "a_name");
            return (Criteria) this;
        }

        public Criteria andA_passwordLikeInsensitive(String value) {
            addCriterion("upper(a_password) like", value.toUpperCase(), "a_password");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Mon Feb 18 10:35:51 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:51 CST 2019
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