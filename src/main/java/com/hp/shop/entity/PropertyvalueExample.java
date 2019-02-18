package com.hp.shop.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

public class PropertyvalueExample {
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
    public PropertyvalueExample() {
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

        public Criteria andProva_idIsNull() {
            addCriterion("prova_id is null");
            return (Criteria) this;
        }

        public Criteria andProva_idIsNotNull() {
            addCriterion("prova_id is not null");
            return (Criteria) this;
        }

        public Criteria andProva_idEqualTo(Integer value) {
            addCriterion("prova_id =", value, "prova_id");
            return (Criteria) this;
        }

        public Criteria andProva_idNotEqualTo(Integer value) {
            addCriterion("prova_id <>", value, "prova_id");
            return (Criteria) this;
        }

        public Criteria andProva_idGreaterThan(Integer value) {
            addCriterion("prova_id >", value, "prova_id");
            return (Criteria) this;
        }

        public Criteria andProva_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("prova_id >=", value, "prova_id");
            return (Criteria) this;
        }

        public Criteria andProva_idLessThan(Integer value) {
            addCriterion("prova_id <", value, "prova_id");
            return (Criteria) this;
        }

        public Criteria andProva_idLessThanOrEqualTo(Integer value) {
            addCriterion("prova_id <=", value, "prova_id");
            return (Criteria) this;
        }

        public Criteria andProva_idIn(List<Integer> values) {
            addCriterion("prova_id in", values, "prova_id");
            return (Criteria) this;
        }

        public Criteria andProva_idNotIn(List<Integer> values) {
            addCriterion("prova_id not in", values, "prova_id");
            return (Criteria) this;
        }

        public Criteria andProva_idBetween(Integer value1, Integer value2) {
            addCriterion("prova_id between", value1, value2, "prova_id");
            return (Criteria) this;
        }

        public Criteria andProva_idNotBetween(Integer value1, Integer value2) {
            addCriterion("prova_id not between", value1, value2, "prova_id");
            return (Criteria) this;
        }

        public Criteria andP_idIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andP_idIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andP_idEqualTo(Integer value) {
            addCriterion("p_id =", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idGreaterThan(Integer value) {
            addCriterion("p_id >", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idLessThan(Integer value) {
            addCriterion("p_id <", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idIn(List<Integer> values) {
            addCriterion("p_id in", values, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "p_id");
            return (Criteria) this;
        }

        public Criteria andPro_idIsNull() {
            addCriterion("pro_id is null");
            return (Criteria) this;
        }

        public Criteria andPro_idIsNotNull() {
            addCriterion("pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andPro_idEqualTo(Integer value) {
            addCriterion("pro_id =", value, "pro_id");
            return (Criteria) this;
        }

        public Criteria andPro_idNotEqualTo(Integer value) {
            addCriterion("pro_id <>", value, "pro_id");
            return (Criteria) this;
        }

        public Criteria andPro_idGreaterThan(Integer value) {
            addCriterion("pro_id >", value, "pro_id");
            return (Criteria) this;
        }

        public Criteria andPro_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_id >=", value, "pro_id");
            return (Criteria) this;
        }

        public Criteria andPro_idLessThan(Integer value) {
            addCriterion("pro_id <", value, "pro_id");
            return (Criteria) this;
        }

        public Criteria andPro_idLessThanOrEqualTo(Integer value) {
            addCriterion("pro_id <=", value, "pro_id");
            return (Criteria) this;
        }

        public Criteria andPro_idIn(List<Integer> values) {
            addCriterion("pro_id in", values, "pro_id");
            return (Criteria) this;
        }

        public Criteria andPro_idNotIn(List<Integer> values) {
            addCriterion("pro_id not in", values, "pro_id");
            return (Criteria) this;
        }

        public Criteria andPro_idBetween(Integer value1, Integer value2) {
            addCriterion("pro_id between", value1, value2, "pro_id");
            return (Criteria) this;
        }

        public Criteria andPro_idNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_id not between", value1, value2, "pro_id");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueLikeInsensitive(String value) {
            addCriterion("upper(value) like", value.toUpperCase(), "value");
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