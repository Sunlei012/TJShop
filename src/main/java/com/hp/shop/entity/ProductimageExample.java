package com.hp.shop.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

public class ProductimageExample {
    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public ProductimageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
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
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
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

        public Criteria andPi_idIsNull() {
            addCriterion("pi_id is null");
            return (Criteria) this;
        }

        public Criteria andPi_idIsNotNull() {
            addCriterion("pi_id is not null");
            return (Criteria) this;
        }

        public Criteria andPi_idEqualTo(Integer value) {
            addCriterion("pi_id =", value, "pi_id");
            return (Criteria) this;
        }

        public Criteria andPi_idNotEqualTo(Integer value) {
            addCriterion("pi_id <>", value, "pi_id");
            return (Criteria) this;
        }

        public Criteria andPi_idGreaterThan(Integer value) {
            addCriterion("pi_id >", value, "pi_id");
            return (Criteria) this;
        }

        public Criteria andPi_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("pi_id >=", value, "pi_id");
            return (Criteria) this;
        }

        public Criteria andPi_idLessThan(Integer value) {
            addCriterion("pi_id <", value, "pi_id");
            return (Criteria) this;
        }

        public Criteria andPi_idLessThanOrEqualTo(Integer value) {
            addCriterion("pi_id <=", value, "pi_id");
            return (Criteria) this;
        }

        public Criteria andPi_idIn(List<Integer> values) {
            addCriterion("pi_id in", values, "pi_id");
            return (Criteria) this;
        }

        public Criteria andPi_idNotIn(List<Integer> values) {
            addCriterion("pi_id not in", values, "pi_id");
            return (Criteria) this;
        }

        public Criteria andPi_idBetween(Integer value1, Integer value2) {
            addCriterion("pi_id between", value1, value2, "pi_id");
            return (Criteria) this;
        }

        public Criteria andPi_idNotBetween(Integer value1, Integer value2) {
            addCriterion("pi_id not between", value1, value2, "pi_id");
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

        public Criteria andPi_image1IsNull() {
            addCriterion("pi_image1 is null");
            return (Criteria) this;
        }

        public Criteria andPi_image1IsNotNull() {
            addCriterion("pi_image1 is not null");
            return (Criteria) this;
        }

        public Criteria andPi_image1EqualTo(String value) {
            addCriterion("pi_image1 =", value, "pi_image1");
            return (Criteria) this;
        }

        public Criteria andPi_image1NotEqualTo(String value) {
            addCriterion("pi_image1 <>", value, "pi_image1");
            return (Criteria) this;
        }

        public Criteria andPi_image1GreaterThan(String value) {
            addCriterion("pi_image1 >", value, "pi_image1");
            return (Criteria) this;
        }

        public Criteria andPi_image1GreaterThanOrEqualTo(String value) {
            addCriterion("pi_image1 >=", value, "pi_image1");
            return (Criteria) this;
        }

        public Criteria andPi_image1LessThan(String value) {
            addCriterion("pi_image1 <", value, "pi_image1");
            return (Criteria) this;
        }

        public Criteria andPi_image1LessThanOrEqualTo(String value) {
            addCriterion("pi_image1 <=", value, "pi_image1");
            return (Criteria) this;
        }

        public Criteria andPi_image1Like(String value) {
            addCriterion("pi_image1 like", value, "pi_image1");
            return (Criteria) this;
        }

        public Criteria andPi_image1NotLike(String value) {
            addCriterion("pi_image1 not like", value, "pi_image1");
            return (Criteria) this;
        }

        public Criteria andPi_image1In(List<String> values) {
            addCriterion("pi_image1 in", values, "pi_image1");
            return (Criteria) this;
        }

        public Criteria andPi_image1NotIn(List<String> values) {
            addCriterion("pi_image1 not in", values, "pi_image1");
            return (Criteria) this;
        }

        public Criteria andPi_image1Between(String value1, String value2) {
            addCriterion("pi_image1 between", value1, value2, "pi_image1");
            return (Criteria) this;
        }

        public Criteria andPi_image1NotBetween(String value1, String value2) {
            addCriterion("pi_image1 not between", value1, value2, "pi_image1");
            return (Criteria) this;
        }

        public Criteria andPi_image2IsNull() {
            addCriterion("pi_image2 is null");
            return (Criteria) this;
        }

        public Criteria andPi_image2IsNotNull() {
            addCriterion("pi_image2 is not null");
            return (Criteria) this;
        }

        public Criteria andPi_image2EqualTo(String value) {
            addCriterion("pi_image2 =", value, "pi_image2");
            return (Criteria) this;
        }

        public Criteria andPi_image2NotEqualTo(String value) {
            addCriterion("pi_image2 <>", value, "pi_image2");
            return (Criteria) this;
        }

        public Criteria andPi_image2GreaterThan(String value) {
            addCriterion("pi_image2 >", value, "pi_image2");
            return (Criteria) this;
        }

        public Criteria andPi_image2GreaterThanOrEqualTo(String value) {
            addCriterion("pi_image2 >=", value, "pi_image2");
            return (Criteria) this;
        }

        public Criteria andPi_image2LessThan(String value) {
            addCriterion("pi_image2 <", value, "pi_image2");
            return (Criteria) this;
        }

        public Criteria andPi_image2LessThanOrEqualTo(String value) {
            addCriterion("pi_image2 <=", value, "pi_image2");
            return (Criteria) this;
        }

        public Criteria andPi_image2Like(String value) {
            addCriterion("pi_image2 like", value, "pi_image2");
            return (Criteria) this;
        }

        public Criteria andPi_image2NotLike(String value) {
            addCriterion("pi_image2 not like", value, "pi_image2");
            return (Criteria) this;
        }

        public Criteria andPi_image2In(List<String> values) {
            addCriterion("pi_image2 in", values, "pi_image2");
            return (Criteria) this;
        }

        public Criteria andPi_image2NotIn(List<String> values) {
            addCriterion("pi_image2 not in", values, "pi_image2");
            return (Criteria) this;
        }

        public Criteria andPi_image2Between(String value1, String value2) {
            addCriterion("pi_image2 between", value1, value2, "pi_image2");
            return (Criteria) this;
        }

        public Criteria andPi_image2NotBetween(String value1, String value2) {
            addCriterion("pi_image2 not between", value1, value2, "pi_image2");
            return (Criteria) this;
        }

        public Criteria andPi_image3IsNull() {
            addCriterion("pi_image3 is null");
            return (Criteria) this;
        }

        public Criteria andPi_image3IsNotNull() {
            addCriterion("pi_image3 is not null");
            return (Criteria) this;
        }

        public Criteria andPi_image3EqualTo(String value) {
            addCriterion("pi_image3 =", value, "pi_image3");
            return (Criteria) this;
        }

        public Criteria andPi_image3NotEqualTo(String value) {
            addCriterion("pi_image3 <>", value, "pi_image3");
            return (Criteria) this;
        }

        public Criteria andPi_image3GreaterThan(String value) {
            addCriterion("pi_image3 >", value, "pi_image3");
            return (Criteria) this;
        }

        public Criteria andPi_image3GreaterThanOrEqualTo(String value) {
            addCriterion("pi_image3 >=", value, "pi_image3");
            return (Criteria) this;
        }

        public Criteria andPi_image3LessThan(String value) {
            addCriterion("pi_image3 <", value, "pi_image3");
            return (Criteria) this;
        }

        public Criteria andPi_image3LessThanOrEqualTo(String value) {
            addCriterion("pi_image3 <=", value, "pi_image3");
            return (Criteria) this;
        }

        public Criteria andPi_image3Like(String value) {
            addCriterion("pi_image3 like", value, "pi_image3");
            return (Criteria) this;
        }

        public Criteria andPi_image3NotLike(String value) {
            addCriterion("pi_image3 not like", value, "pi_image3");
            return (Criteria) this;
        }

        public Criteria andPi_image3In(List<String> values) {
            addCriterion("pi_image3 in", values, "pi_image3");
            return (Criteria) this;
        }

        public Criteria andPi_image3NotIn(List<String> values) {
            addCriterion("pi_image3 not in", values, "pi_image3");
            return (Criteria) this;
        }

        public Criteria andPi_image3Between(String value1, String value2) {
            addCriterion("pi_image3 between", value1, value2, "pi_image3");
            return (Criteria) this;
        }

        public Criteria andPi_image3NotBetween(String value1, String value2) {
            addCriterion("pi_image3 not between", value1, value2, "pi_image3");
            return (Criteria) this;
        }

        public Criteria andPi_image4IsNull() {
            addCriterion("pi_image4 is null");
            return (Criteria) this;
        }

        public Criteria andPi_image4IsNotNull() {
            addCriterion("pi_image4 is not null");
            return (Criteria) this;
        }

        public Criteria andPi_image4EqualTo(String value) {
            addCriterion("pi_image4 =", value, "pi_image4");
            return (Criteria) this;
        }

        public Criteria andPi_image4NotEqualTo(String value) {
            addCriterion("pi_image4 <>", value, "pi_image4");
            return (Criteria) this;
        }

        public Criteria andPi_image4GreaterThan(String value) {
            addCriterion("pi_image4 >", value, "pi_image4");
            return (Criteria) this;
        }

        public Criteria andPi_image4GreaterThanOrEqualTo(String value) {
            addCriterion("pi_image4 >=", value, "pi_image4");
            return (Criteria) this;
        }

        public Criteria andPi_image4LessThan(String value) {
            addCriterion("pi_image4 <", value, "pi_image4");
            return (Criteria) this;
        }

        public Criteria andPi_image4LessThanOrEqualTo(String value) {
            addCriterion("pi_image4 <=", value, "pi_image4");
            return (Criteria) this;
        }

        public Criteria andPi_image4Like(String value) {
            addCriterion("pi_image4 like", value, "pi_image4");
            return (Criteria) this;
        }

        public Criteria andPi_image4NotLike(String value) {
            addCriterion("pi_image4 not like", value, "pi_image4");
            return (Criteria) this;
        }

        public Criteria andPi_image4In(List<String> values) {
            addCriterion("pi_image4 in", values, "pi_image4");
            return (Criteria) this;
        }

        public Criteria andPi_image4NotIn(List<String> values) {
            addCriterion("pi_image4 not in", values, "pi_image4");
            return (Criteria) this;
        }

        public Criteria andPi_image4Between(String value1, String value2) {
            addCriterion("pi_image4 between", value1, value2, "pi_image4");
            return (Criteria) this;
        }

        public Criteria andPi_image4NotBetween(String value1, String value2) {
            addCriterion("pi_image4 not between", value1, value2, "pi_image4");
            return (Criteria) this;
        }

        public Criteria andPi_image5IsNull() {
            addCriterion("pi_image5 is null");
            return (Criteria) this;
        }

        public Criteria andPi_image5IsNotNull() {
            addCriterion("pi_image5 is not null");
            return (Criteria) this;
        }

        public Criteria andPi_image5EqualTo(String value) {
            addCriterion("pi_image5 =", value, "pi_image5");
            return (Criteria) this;
        }

        public Criteria andPi_image5NotEqualTo(String value) {
            addCriterion("pi_image5 <>", value, "pi_image5");
            return (Criteria) this;
        }

        public Criteria andPi_image5GreaterThan(String value) {
            addCriterion("pi_image5 >", value, "pi_image5");
            return (Criteria) this;
        }

        public Criteria andPi_image5GreaterThanOrEqualTo(String value) {
            addCriterion("pi_image5 >=", value, "pi_image5");
            return (Criteria) this;
        }

        public Criteria andPi_image5LessThan(String value) {
            addCriterion("pi_image5 <", value, "pi_image5");
            return (Criteria) this;
        }

        public Criteria andPi_image5LessThanOrEqualTo(String value) {
            addCriterion("pi_image5 <=", value, "pi_image5");
            return (Criteria) this;
        }

        public Criteria andPi_image5Like(String value) {
            addCriterion("pi_image5 like", value, "pi_image5");
            return (Criteria) this;
        }

        public Criteria andPi_image5NotLike(String value) {
            addCriterion("pi_image5 not like", value, "pi_image5");
            return (Criteria) this;
        }

        public Criteria andPi_image5In(List<String> values) {
            addCriterion("pi_image5 in", values, "pi_image5");
            return (Criteria) this;
        }

        public Criteria andPi_image5NotIn(List<String> values) {
            addCriterion("pi_image5 not in", values, "pi_image5");
            return (Criteria) this;
        }

        public Criteria andPi_image5Between(String value1, String value2) {
            addCriterion("pi_image5 between", value1, value2, "pi_image5");
            return (Criteria) this;
        }

        public Criteria andPi_image5NotBetween(String value1, String value2) {
            addCriterion("pi_image5 not between", value1, value2, "pi_image5");
            return (Criteria) this;
        }

        public Criteria andPi_image1LikeInsensitive(String value) {
            addCriterion("upper(pi_image1) like", value.toUpperCase(), "pi_image1");
            return (Criteria) this;
        }

        public Criteria andPi_image2LikeInsensitive(String value) {
            addCriterion("upper(pi_image2) like", value.toUpperCase(), "pi_image2");
            return (Criteria) this;
        }

        public Criteria andPi_image3LikeInsensitive(String value) {
            addCriterion("upper(pi_image3) like", value.toUpperCase(), "pi_image3");
            return (Criteria) this;
        }

        public Criteria andPi_image4LikeInsensitive(String value) {
            addCriterion("upper(pi_image4) like", value.toUpperCase(), "pi_image4");
            return (Criteria) this;
        }

        public Criteria andPi_image5LikeInsensitive(String value) {
            addCriterion("upper(pi_image5) like", value.toUpperCase(), "pi_image5");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Mon Feb 18 10:35:50 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Mon Feb 18 10:35:50 CST 2019
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