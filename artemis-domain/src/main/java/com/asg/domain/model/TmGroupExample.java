package com.asg.domain.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TmGroupExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TM_GROUP
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TM_GROUP
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TM_GROUP
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_GROUP
     *
     * @mbg.generated
     */
    public TmGroupExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_GROUP
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_GROUP
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_GROUP
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_GROUP
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_GROUP
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_GROUP
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_GROUP
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_GROUP
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_GROUP
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_GROUP
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TM_GROUP
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andCdKaishaIsNull() {
            addCriterion("CD_KAISHA is null");
            return (Criteria) this;
        }

        public Criteria andCdKaishaIsNotNull() {
            addCriterion("CD_KAISHA is not null");
            return (Criteria) this;
        }

        public Criteria andCdKaishaEqualTo(String value) {
            addCriterion("CD_KAISHA =", value, "cdKaisha");
            return (Criteria) this;
        }

        public Criteria andCdKaishaNotEqualTo(String value) {
            addCriterion("CD_KAISHA <>", value, "cdKaisha");
            return (Criteria) this;
        }

        public Criteria andCdKaishaGreaterThan(String value) {
            addCriterion("CD_KAISHA >", value, "cdKaisha");
            return (Criteria) this;
        }

        public Criteria andCdKaishaGreaterThanOrEqualTo(String value) {
            addCriterion("CD_KAISHA >=", value, "cdKaisha");
            return (Criteria) this;
        }

        public Criteria andCdKaishaLessThan(String value) {
            addCriterion("CD_KAISHA <", value, "cdKaisha");
            return (Criteria) this;
        }

        public Criteria andCdKaishaLessThanOrEqualTo(String value) {
            addCriterion("CD_KAISHA <=", value, "cdKaisha");
            return (Criteria) this;
        }

        public Criteria andCdKaishaLike(String value) {
            addCriterion("CD_KAISHA like", value, "cdKaisha");
            return (Criteria) this;
        }

        public Criteria andCdKaishaNotLike(String value) {
            addCriterion("CD_KAISHA not like", value, "cdKaisha");
            return (Criteria) this;
        }

        public Criteria andCdKaishaIn(List<String> values) {
            addCriterion("CD_KAISHA in", values, "cdKaisha");
            return (Criteria) this;
        }

        public Criteria andCdKaishaNotIn(List<String> values) {
            addCriterion("CD_KAISHA not in", values, "cdKaisha");
            return (Criteria) this;
        }

        public Criteria andCdKaishaBetween(String value1, String value2) {
            addCriterion("CD_KAISHA between", value1, value2, "cdKaisha");
            return (Criteria) this;
        }

        public Criteria andCdKaishaNotBetween(String value1, String value2) {
            addCriterion("CD_KAISHA not between", value1, value2, "cdKaisha");
            return (Criteria) this;
        }

        public Criteria andCdGroupIsNull() {
            addCriterion("CD_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andCdGroupIsNotNull() {
            addCriterion("CD_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andCdGroupEqualTo(String value) {
            addCriterion("CD_GROUP =", value, "cdGroup");
            return (Criteria) this;
        }

        public Criteria andCdGroupNotEqualTo(String value) {
            addCriterion("CD_GROUP <>", value, "cdGroup");
            return (Criteria) this;
        }

        public Criteria andCdGroupGreaterThan(String value) {
            addCriterion("CD_GROUP >", value, "cdGroup");
            return (Criteria) this;
        }

        public Criteria andCdGroupGreaterThanOrEqualTo(String value) {
            addCriterion("CD_GROUP >=", value, "cdGroup");
            return (Criteria) this;
        }

        public Criteria andCdGroupLessThan(String value) {
            addCriterion("CD_GROUP <", value, "cdGroup");
            return (Criteria) this;
        }

        public Criteria andCdGroupLessThanOrEqualTo(String value) {
            addCriterion("CD_GROUP <=", value, "cdGroup");
            return (Criteria) this;
        }

        public Criteria andCdGroupLike(String value) {
            addCriterion("CD_GROUP like", value, "cdGroup");
            return (Criteria) this;
        }

        public Criteria andCdGroupNotLike(String value) {
            addCriterion("CD_GROUP not like", value, "cdGroup");
            return (Criteria) this;
        }

        public Criteria andCdGroupIn(List<String> values) {
            addCriterion("CD_GROUP in", values, "cdGroup");
            return (Criteria) this;
        }

        public Criteria andCdGroupNotIn(List<String> values) {
            addCriterion("CD_GROUP not in", values, "cdGroup");
            return (Criteria) this;
        }

        public Criteria andCdGroupBetween(String value1, String value2) {
            addCriterion("CD_GROUP between", value1, value2, "cdGroup");
            return (Criteria) this;
        }

        public Criteria andCdGroupNotBetween(String value1, String value2) {
            addCriterion("CD_GROUP not between", value1, value2, "cdGroup");
            return (Criteria) this;
        }

        public Criteria andKjGroupIsNull() {
            addCriterion("KJ_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andKjGroupIsNotNull() {
            addCriterion("KJ_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andKjGroupEqualTo(String value) {
            addCriterion("KJ_GROUP =", value, "kjGroup");
            return (Criteria) this;
        }

        public Criteria andKjGroupNotEqualTo(String value) {
            addCriterion("KJ_GROUP <>", value, "kjGroup");
            return (Criteria) this;
        }

        public Criteria andKjGroupGreaterThan(String value) {
            addCriterion("KJ_GROUP >", value, "kjGroup");
            return (Criteria) this;
        }

        public Criteria andKjGroupGreaterThanOrEqualTo(String value) {
            addCriterion("KJ_GROUP >=", value, "kjGroup");
            return (Criteria) this;
        }

        public Criteria andKjGroupLessThan(String value) {
            addCriterion("KJ_GROUP <", value, "kjGroup");
            return (Criteria) this;
        }

        public Criteria andKjGroupLessThanOrEqualTo(String value) {
            addCriterion("KJ_GROUP <=", value, "kjGroup");
            return (Criteria) this;
        }

        public Criteria andKjGroupLike(String value) {
            addCriterion("KJ_GROUP like", value, "kjGroup");
            return (Criteria) this;
        }

        public Criteria andKjGroupNotLike(String value) {
            addCriterion("KJ_GROUP not like", value, "kjGroup");
            return (Criteria) this;
        }

        public Criteria andKjGroupIn(List<String> values) {
            addCriterion("KJ_GROUP in", values, "kjGroup");
            return (Criteria) this;
        }

        public Criteria andKjGroupNotIn(List<String> values) {
            addCriterion("KJ_GROUP not in", values, "kjGroup");
            return (Criteria) this;
        }

        public Criteria andKjGroupBetween(String value1, String value2) {
            addCriterion("KJ_GROUP between", value1, value2, "kjGroup");
            return (Criteria) this;
        }

        public Criteria andKjGroupNotBetween(String value1, String value2) {
            addCriterion("KJ_GROUP not between", value1, value2, "kjGroup");
            return (Criteria) this;
        }

        public Criteria andCdTeishiIsNull() {
            addCriterion("CD_TEISHI is null");
            return (Criteria) this;
        }

        public Criteria andCdTeishiIsNotNull() {
            addCriterion("CD_TEISHI is not null");
            return (Criteria) this;
        }

        public Criteria andCdTeishiEqualTo(String value) {
            addCriterion("CD_TEISHI =", value, "cdTeishi");
            return (Criteria) this;
        }

        public Criteria andCdTeishiNotEqualTo(String value) {
            addCriterion("CD_TEISHI <>", value, "cdTeishi");
            return (Criteria) this;
        }

        public Criteria andCdTeishiGreaterThan(String value) {
            addCriterion("CD_TEISHI >", value, "cdTeishi");
            return (Criteria) this;
        }

        public Criteria andCdTeishiGreaterThanOrEqualTo(String value) {
            addCriterion("CD_TEISHI >=", value, "cdTeishi");
            return (Criteria) this;
        }

        public Criteria andCdTeishiLessThan(String value) {
            addCriterion("CD_TEISHI <", value, "cdTeishi");
            return (Criteria) this;
        }

        public Criteria andCdTeishiLessThanOrEqualTo(String value) {
            addCriterion("CD_TEISHI <=", value, "cdTeishi");
            return (Criteria) this;
        }

        public Criteria andCdTeishiLike(String value) {
            addCriterion("CD_TEISHI like", value, "cdTeishi");
            return (Criteria) this;
        }

        public Criteria andCdTeishiNotLike(String value) {
            addCriterion("CD_TEISHI not like", value, "cdTeishi");
            return (Criteria) this;
        }

        public Criteria andCdTeishiIn(List<String> values) {
            addCriterion("CD_TEISHI in", values, "cdTeishi");
            return (Criteria) this;
        }

        public Criteria andCdTeishiNotIn(List<String> values) {
            addCriterion("CD_TEISHI not in", values, "cdTeishi");
            return (Criteria) this;
        }

        public Criteria andCdTeishiBetween(String value1, String value2) {
            addCriterion("CD_TEISHI between", value1, value2, "cdTeishi");
            return (Criteria) this;
        }

        public Criteria andCdTeishiNotBetween(String value1, String value2) {
            addCriterion("CD_TEISHI not between", value1, value2, "cdTeishi");
            return (Criteria) this;
        }

        public Criteria andCdLuKaishaIsNull() {
            addCriterion("CD_LU_KAISHA is null");
            return (Criteria) this;
        }

        public Criteria andCdLuKaishaIsNotNull() {
            addCriterion("CD_LU_KAISHA is not null");
            return (Criteria) this;
        }

        public Criteria andCdLuKaishaEqualTo(String value) {
            addCriterion("CD_LU_KAISHA =", value, "cdLuKaisha");
            return (Criteria) this;
        }

        public Criteria andCdLuKaishaNotEqualTo(String value) {
            addCriterion("CD_LU_KAISHA <>", value, "cdLuKaisha");
            return (Criteria) this;
        }

        public Criteria andCdLuKaishaGreaterThan(String value) {
            addCriterion("CD_LU_KAISHA >", value, "cdLuKaisha");
            return (Criteria) this;
        }

        public Criteria andCdLuKaishaGreaterThanOrEqualTo(String value) {
            addCriterion("CD_LU_KAISHA >=", value, "cdLuKaisha");
            return (Criteria) this;
        }

        public Criteria andCdLuKaishaLessThan(String value) {
            addCriterion("CD_LU_KAISHA <", value, "cdLuKaisha");
            return (Criteria) this;
        }

        public Criteria andCdLuKaishaLessThanOrEqualTo(String value) {
            addCriterion("CD_LU_KAISHA <=", value, "cdLuKaisha");
            return (Criteria) this;
        }

        public Criteria andCdLuKaishaLike(String value) {
            addCriterion("CD_LU_KAISHA like", value, "cdLuKaisha");
            return (Criteria) this;
        }

        public Criteria andCdLuKaishaNotLike(String value) {
            addCriterion("CD_LU_KAISHA not like", value, "cdLuKaisha");
            return (Criteria) this;
        }

        public Criteria andCdLuKaishaIn(List<String> values) {
            addCriterion("CD_LU_KAISHA in", values, "cdLuKaisha");
            return (Criteria) this;
        }

        public Criteria andCdLuKaishaNotIn(List<String> values) {
            addCriterion("CD_LU_KAISHA not in", values, "cdLuKaisha");
            return (Criteria) this;
        }

        public Criteria andCdLuKaishaBetween(String value1, String value2) {
            addCriterion("CD_LU_KAISHA between", value1, value2, "cdLuKaisha");
            return (Criteria) this;
        }

        public Criteria andCdLuKaishaNotBetween(String value1, String value2) {
            addCriterion("CD_LU_KAISHA not between", value1, value2, "cdLuKaisha");
            return (Criteria) this;
        }

        public Criteria andCdLuUserIsNull() {
            addCriterion("CD_LU_USER is null");
            return (Criteria) this;
        }

        public Criteria andCdLuUserIsNotNull() {
            addCriterion("CD_LU_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCdLuUserEqualTo(String value) {
            addCriterion("CD_LU_USER =", value, "cdLuUser");
            return (Criteria) this;
        }

        public Criteria andCdLuUserNotEqualTo(String value) {
            addCriterion("CD_LU_USER <>", value, "cdLuUser");
            return (Criteria) this;
        }

        public Criteria andCdLuUserGreaterThan(String value) {
            addCriterion("CD_LU_USER >", value, "cdLuUser");
            return (Criteria) this;
        }

        public Criteria andCdLuUserGreaterThanOrEqualTo(String value) {
            addCriterion("CD_LU_USER >=", value, "cdLuUser");
            return (Criteria) this;
        }

        public Criteria andCdLuUserLessThan(String value) {
            addCriterion("CD_LU_USER <", value, "cdLuUser");
            return (Criteria) this;
        }

        public Criteria andCdLuUserLessThanOrEqualTo(String value) {
            addCriterion("CD_LU_USER <=", value, "cdLuUser");
            return (Criteria) this;
        }

        public Criteria andCdLuUserLike(String value) {
            addCriterion("CD_LU_USER like", value, "cdLuUser");
            return (Criteria) this;
        }

        public Criteria andCdLuUserNotLike(String value) {
            addCriterion("CD_LU_USER not like", value, "cdLuUser");
            return (Criteria) this;
        }

        public Criteria andCdLuUserIn(List<String> values) {
            addCriterion("CD_LU_USER in", values, "cdLuUser");
            return (Criteria) this;
        }

        public Criteria andCdLuUserNotIn(List<String> values) {
            addCriterion("CD_LU_USER not in", values, "cdLuUser");
            return (Criteria) this;
        }

        public Criteria andCdLuUserBetween(String value1, String value2) {
            addCriterion("CD_LU_USER between", value1, value2, "cdLuUser");
            return (Criteria) this;
        }

        public Criteria andCdLuUserNotBetween(String value1, String value2) {
            addCriterion("CD_LU_USER not between", value1, value2, "cdLuUser");
            return (Criteria) this;
        }

        public Criteria andTmLuIsNull() {
            addCriterion("TM_LU is null");
            return (Criteria) this;
        }

        public Criteria andTmLuIsNotNull() {
            addCriterion("TM_LU is not null");
            return (Criteria) this;
        }

        public Criteria andTmLuEqualTo(LocalDateTime value) {
            addCriterion("TM_LU =", value, "tmLu");
            return (Criteria) this;
        }

        public Criteria andTmLuNotEqualTo(LocalDateTime value) {
            addCriterion("TM_LU <>", value, "tmLu");
            return (Criteria) this;
        }

        public Criteria andTmLuGreaterThan(LocalDateTime value) {
            addCriterion("TM_LU >", value, "tmLu");
            return (Criteria) this;
        }

        public Criteria andTmLuGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("TM_LU >=", value, "tmLu");
            return (Criteria) this;
        }

        public Criteria andTmLuLessThan(LocalDateTime value) {
            addCriterion("TM_LU <", value, "tmLu");
            return (Criteria) this;
        }

        public Criteria andTmLuLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("TM_LU <=", value, "tmLu");
            return (Criteria) this;
        }

        public Criteria andTmLuIn(List<LocalDateTime> values) {
            addCriterion("TM_LU in", values, "tmLu");
            return (Criteria) this;
        }

        public Criteria andTmLuNotIn(List<LocalDateTime> values) {
            addCriterion("TM_LU not in", values, "tmLu");
            return (Criteria) this;
        }

        public Criteria andTmLuBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("TM_LU between", value1, value2, "tmLu");
            return (Criteria) this;
        }

        public Criteria andTmLuNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("TM_LU not between", value1, value2, "tmLu");
            return (Criteria) this;
        }

        public Criteria andCdCreateUserIsNull() {
            addCriterion("CD_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCdCreateUserIsNotNull() {
            addCriterion("CD_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCdCreateUserEqualTo(Integer value) {
            addCriterion("CD_CREATE_USER =", value, "cdCreateUser");
            return (Criteria) this;
        }

        public Criteria andCdCreateUserNotEqualTo(Integer value) {
            addCriterion("CD_CREATE_USER <>", value, "cdCreateUser");
            return (Criteria) this;
        }

        public Criteria andCdCreateUserGreaterThan(Integer value) {
            addCriterion("CD_CREATE_USER >", value, "cdCreateUser");
            return (Criteria) this;
        }

        public Criteria andCdCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("CD_CREATE_USER >=", value, "cdCreateUser");
            return (Criteria) this;
        }

        public Criteria andCdCreateUserLessThan(Integer value) {
            addCriterion("CD_CREATE_USER <", value, "cdCreateUser");
            return (Criteria) this;
        }

        public Criteria andCdCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("CD_CREATE_USER <=", value, "cdCreateUser");
            return (Criteria) this;
        }

        public Criteria andCdCreateUserIn(List<Integer> values) {
            addCriterion("CD_CREATE_USER in", values, "cdCreateUser");
            return (Criteria) this;
        }

        public Criteria andCdCreateUserNotIn(List<Integer> values) {
            addCriterion("CD_CREATE_USER not in", values, "cdCreateUser");
            return (Criteria) this;
        }

        public Criteria andCdCreateUserBetween(Integer value1, Integer value2) {
            addCriterion("CD_CREATE_USER between", value1, value2, "cdCreateUser");
            return (Criteria) this;
        }

        public Criteria andCdCreateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("CD_CREATE_USER not between", value1, value2, "cdCreateUser");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TM_GROUP
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TM_GROUP
     *
     * @mbg.generated
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