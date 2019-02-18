package com.hp.shop.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

public class OrderitemExample {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public OrderitemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
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
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
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

        public Criteria andOr_idIsNull() {
            addCriterion("or_id is null");
            return (Criteria) this;
        }

        public Criteria andOr_idIsNotNull() {
            addCriterion("or_id is not null");
            return (Criteria) this;
        }

        public Criteria andOr_idEqualTo(Integer value) {
            addCriterion("or_id =", value, "or_id");
            return (Criteria) this;
        }

        public Criteria andOr_idNotEqualTo(Integer value) {
            addCriterion("or_id <>", value, "or_id");
            return (Criteria) this;
        }

        public Criteria andOr_idGreaterThan(Integer value) {
            addCriterion("or_id >", value, "or_id");
            return (Criteria) this;
        }

        public Criteria andOr_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("or_id >=", value, "or_id");
            return (Criteria) this;
        }

        public Criteria andOr_idLessThan(Integer value) {
            addCriterion("or_id <", value, "or_id");
            return (Criteria) this;
        }

        public Criteria andOr_idLessThanOrEqualTo(Integer value) {
            addCriterion("or_id <=", value, "or_id");
            return (Criteria) this;
        }

        public Criteria andOr_idIn(List<Integer> values) {
            addCriterion("or_id in", values, "or_id");
            return (Criteria) this;
        }

        public Criteria andOr_idNotIn(List<Integer> values) {
            addCriterion("or_id not in", values, "or_id");
            return (Criteria) this;
        }

        public Criteria andOr_idBetween(Integer value1, Integer value2) {
            addCriterion("or_id between", value1, value2, "or_id");
            return (Criteria) this;
        }

        public Criteria andOr_idNotBetween(Integer value1, Integer value2) {
            addCriterion("or_id not between", value1, value2, "or_id");
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

        public Criteria andO_idIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andO_idIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andO_idEqualTo(Integer value) {
            addCriterion("o_id =", value, "o_id");
            return (Criteria) this;
        }

        public Criteria andO_idNotEqualTo(Integer value) {
            addCriterion("o_id <>", value, "o_id");
            return (Criteria) this;
        }

        public Criteria andO_idGreaterThan(Integer value) {
            addCriterion("o_id >", value, "o_id");
            return (Criteria) this;
        }

        public Criteria andO_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_id >=", value, "o_id");
            return (Criteria) this;
        }

        public Criteria andO_idLessThan(Integer value) {
            addCriterion("o_id <", value, "o_id");
            return (Criteria) this;
        }

        public Criteria andO_idLessThanOrEqualTo(Integer value) {
            addCriterion("o_id <=", value, "o_id");
            return (Criteria) this;
        }

        public Criteria andO_idIn(List<Integer> values) {
            addCriterion("o_id in", values, "o_id");
            return (Criteria) this;
        }

        public Criteria andO_idNotIn(List<Integer> values) {
            addCriterion("o_id not in", values, "o_id");
            return (Criteria) this;
        }

        public Criteria andO_idBetween(Integer value1, Integer value2) {
            addCriterion("o_id between", value1, value2, "o_id");
            return (Criteria) this;
        }

        public Criteria andO_idNotBetween(Integer value1, Integer value2) {
            addCriterion("o_id not between", value1, value2, "o_id");
            return (Criteria) this;
        }

        public Criteria andU_idIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andU_idIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andU_idEqualTo(Integer value) {
            addCriterion("u_id =", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idGreaterThan(Integer value) {
            addCriterion("u_id >", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idLessThan(Integer value) {
            addCriterion("u_id <", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idIn(List<Integer> values) {
            addCriterion("u_id in", values, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "u_id");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andPay_wayIsNull() {
            addCriterion("pay_way is null");
            return (Criteria) this;
        }

        public Criteria andPay_wayIsNotNull() {
            addCriterion("pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andPay_wayEqualTo(String value) {
            addCriterion("pay_way =", value, "pay_way");
            return (Criteria) this;
        }

        public Criteria andPay_wayNotEqualTo(String value) {
            addCriterion("pay_way <>", value, "pay_way");
            return (Criteria) this;
        }

        public Criteria andPay_wayGreaterThan(String value) {
            addCriterion("pay_way >", value, "pay_way");
            return (Criteria) this;
        }

        public Criteria andPay_wayGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way >=", value, "pay_way");
            return (Criteria) this;
        }

        public Criteria andPay_wayLessThan(String value) {
            addCriterion("pay_way <", value, "pay_way");
            return (Criteria) this;
        }

        public Criteria andPay_wayLessThanOrEqualTo(String value) {
            addCriterion("pay_way <=", value, "pay_way");
            return (Criteria) this;
        }

        public Criteria andPay_wayLike(String value) {
            addCriterion("pay_way like", value, "pay_way");
            return (Criteria) this;
        }

        public Criteria andPay_wayNotLike(String value) {
            addCriterion("pay_way not like", value, "pay_way");
            return (Criteria) this;
        }

        public Criteria andPay_wayIn(List<String> values) {
            addCriterion("pay_way in", values, "pay_way");
            return (Criteria) this;
        }

        public Criteria andPay_wayNotIn(List<String> values) {
            addCriterion("pay_way not in", values, "pay_way");
            return (Criteria) this;
        }

        public Criteria andPay_wayBetween(String value1, String value2) {
            addCriterion("pay_way between", value1, value2, "pay_way");
            return (Criteria) this;
        }

        public Criteria andPay_wayNotBetween(String value1, String value2) {
            addCriterion("pay_way not between", value1, value2, "pay_way");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPay_wayLikeInsensitive(String value) {
            addCriterion("upper(pay_way) like", value.toUpperCase(), "pay_way");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Mon Feb 18 10:35:49 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:49 CST 2019
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