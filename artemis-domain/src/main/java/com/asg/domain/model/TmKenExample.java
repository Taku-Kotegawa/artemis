package com.asg.domain.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TmKenExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TM_KEN
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TM_KEN
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TM_KEN
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_KEN
     *
     * @mbg.generated
     */
    public TmKenExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_KEN
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_KEN
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_KEN
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_KEN
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_KEN
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_KEN
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_KEN
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
     * This method corresponds to the database table TM_KEN
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
     * This method corresponds to the database table TM_KEN
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TM_KEN
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
     * This class corresponds to the database table TM_KEN
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

        public Criteria andCdKenIsNull() {
            addCriterion("CD_KEN is null");
            return (Criteria) this;
        }

        public Criteria andCdKenIsNotNull() {
            addCriterion("CD_KEN is not null");
            return (Criteria) this;
        }

        public Criteria andCdKenEqualTo(String value) {
            addCriterion("CD_KEN =", value, "cdKen");
            return (Criteria) this;
        }

        public Criteria andCdKenNotEqualTo(String value) {
            addCriterion("CD_KEN <>", value, "cdKen");
            return (Criteria) this;
        }

        public Criteria andCdKenGreaterThan(String value) {
            addCriterion("CD_KEN >", value, "cdKen");
            return (Criteria) this;
        }

        public Criteria andCdKenGreaterThanOrEqualTo(String value) {
            addCriterion("CD_KEN >=", value, "cdKen");
            return (Criteria) this;
        }

        public Criteria andCdKenLessThan(String value) {
            addCriterion("CD_KEN <", value, "cdKen");
            return (Criteria) this;
        }

        public Criteria andCdKenLessThanOrEqualTo(String value) {
            addCriterion("CD_KEN <=", value, "cdKen");
            return (Criteria) this;
        }

        public Criteria andCdKenLike(String value) {
            addCriterion("CD_KEN like", value, "cdKen");
            return (Criteria) this;
        }

        public Criteria andCdKenNotLike(String value) {
            addCriterion("CD_KEN not like", value, "cdKen");
            return (Criteria) this;
        }

        public Criteria andCdKenIn(List<String> values) {
            addCriterion("CD_KEN in", values, "cdKen");
            return (Criteria) this;
        }

        public Criteria andCdKenNotIn(List<String> values) {
            addCriterion("CD_KEN not in", values, "cdKen");
            return (Criteria) this;
        }

        public Criteria andCdKenBetween(String value1, String value2) {
            addCriterion("CD_KEN between", value1, value2, "cdKen");
            return (Criteria) this;
        }

        public Criteria andCdKenNotBetween(String value1, String value2) {
            addCriterion("CD_KEN not between", value1, value2, "cdKen");
            return (Criteria) this;
        }

        public Criteria andKjKenIsNull() {
            addCriterion("KJ_KEN is null");
            return (Criteria) this;
        }

        public Criteria andKjKenIsNotNull() {
            addCriterion("KJ_KEN is not null");
            return (Criteria) this;
        }

        public Criteria andKjKenEqualTo(String value) {
            addCriterion("KJ_KEN =", value, "kjKen");
            return (Criteria) this;
        }

        public Criteria andKjKenNotEqualTo(String value) {
            addCriterion("KJ_KEN <>", value, "kjKen");
            return (Criteria) this;
        }

        public Criteria andKjKenGreaterThan(String value) {
            addCriterion("KJ_KEN >", value, "kjKen");
            return (Criteria) this;
        }

        public Criteria andKjKenGreaterThanOrEqualTo(String value) {
            addCriterion("KJ_KEN >=", value, "kjKen");
            return (Criteria) this;
        }

        public Criteria andKjKenLessThan(String value) {
            addCriterion("KJ_KEN <", value, "kjKen");
            return (Criteria) this;
        }

        public Criteria andKjKenLessThanOrEqualTo(String value) {
            addCriterion("KJ_KEN <=", value, "kjKen");
            return (Criteria) this;
        }

        public Criteria andKjKenLike(String value) {
            addCriterion("KJ_KEN like", value, "kjKen");
            return (Criteria) this;
        }

        public Criteria andKjKenNotLike(String value) {
            addCriterion("KJ_KEN not like", value, "kjKen");
            return (Criteria) this;
        }

        public Criteria andKjKenIn(List<String> values) {
            addCriterion("KJ_KEN in", values, "kjKen");
            return (Criteria) this;
        }

        public Criteria andKjKenNotIn(List<String> values) {
            addCriterion("KJ_KEN not in", values, "kjKen");
            return (Criteria) this;
        }

        public Criteria andKjKenBetween(String value1, String value2) {
            addCriterion("KJ_KEN between", value1, value2, "kjKen");
            return (Criteria) this;
        }

        public Criteria andKjKenNotBetween(String value1, String value2) {
            addCriterion("KJ_KEN not between", value1, value2, "kjKen");
            return (Criteria) this;
        }

        public Criteria andCdKaisha1IsNull() {
            addCriterion("CD_KAISHA1 is null");
            return (Criteria) this;
        }

        public Criteria andCdKaisha1IsNotNull() {
            addCriterion("CD_KAISHA1 is not null");
            return (Criteria) this;
        }

        public Criteria andCdKaisha1EqualTo(String value) {
            addCriterion("CD_KAISHA1 =", value, "cdKaisha1");
            return (Criteria) this;
        }

        public Criteria andCdKaisha1NotEqualTo(String value) {
            addCriterion("CD_KAISHA1 <>", value, "cdKaisha1");
            return (Criteria) this;
        }

        public Criteria andCdKaisha1GreaterThan(String value) {
            addCriterion("CD_KAISHA1 >", value, "cdKaisha1");
            return (Criteria) this;
        }

        public Criteria andCdKaisha1GreaterThanOrEqualTo(String value) {
            addCriterion("CD_KAISHA1 >=", value, "cdKaisha1");
            return (Criteria) this;
        }

        public Criteria andCdKaisha1LessThan(String value) {
            addCriterion("CD_KAISHA1 <", value, "cdKaisha1");
            return (Criteria) this;
        }

        public Criteria andCdKaisha1LessThanOrEqualTo(String value) {
            addCriterion("CD_KAISHA1 <=", value, "cdKaisha1");
            return (Criteria) this;
        }

        public Criteria andCdKaisha1Like(String value) {
            addCriterion("CD_KAISHA1 like", value, "cdKaisha1");
            return (Criteria) this;
        }

        public Criteria andCdKaisha1NotLike(String value) {
            addCriterion("CD_KAISHA1 not like", value, "cdKaisha1");
            return (Criteria) this;
        }

        public Criteria andCdKaisha1In(List<String> values) {
            addCriterion("CD_KAISHA1 in", values, "cdKaisha1");
            return (Criteria) this;
        }

        public Criteria andCdKaisha1NotIn(List<String> values) {
            addCriterion("CD_KAISHA1 not in", values, "cdKaisha1");
            return (Criteria) this;
        }

        public Criteria andCdKaisha1Between(String value1, String value2) {
            addCriterion("CD_KAISHA1 between", value1, value2, "cdKaisha1");
            return (Criteria) this;
        }

        public Criteria andCdKaisha1NotBetween(String value1, String value2) {
            addCriterion("CD_KAISHA1 not between", value1, value2, "cdKaisha1");
            return (Criteria) this;
        }

        public Criteria andCdKaisha2IsNull() {
            addCriterion("CD_KAISHA2 is null");
            return (Criteria) this;
        }

        public Criteria andCdKaisha2IsNotNull() {
            addCriterion("CD_KAISHA2 is not null");
            return (Criteria) this;
        }

        public Criteria andCdKaisha2EqualTo(String value) {
            addCriterion("CD_KAISHA2 =", value, "cdKaisha2");
            return (Criteria) this;
        }

        public Criteria andCdKaisha2NotEqualTo(String value) {
            addCriterion("CD_KAISHA2 <>", value, "cdKaisha2");
            return (Criteria) this;
        }

        public Criteria andCdKaisha2GreaterThan(String value) {
            addCriterion("CD_KAISHA2 >", value, "cdKaisha2");
            return (Criteria) this;
        }

        public Criteria andCdKaisha2GreaterThanOrEqualTo(String value) {
            addCriterion("CD_KAISHA2 >=", value, "cdKaisha2");
            return (Criteria) this;
        }

        public Criteria andCdKaisha2LessThan(String value) {
            addCriterion("CD_KAISHA2 <", value, "cdKaisha2");
            return (Criteria) this;
        }

        public Criteria andCdKaisha2LessThanOrEqualTo(String value) {
            addCriterion("CD_KAISHA2 <=", value, "cdKaisha2");
            return (Criteria) this;
        }

        public Criteria andCdKaisha2Like(String value) {
            addCriterion("CD_KAISHA2 like", value, "cdKaisha2");
            return (Criteria) this;
        }

        public Criteria andCdKaisha2NotLike(String value) {
            addCriterion("CD_KAISHA2 not like", value, "cdKaisha2");
            return (Criteria) this;
        }

        public Criteria andCdKaisha2In(List<String> values) {
            addCriterion("CD_KAISHA2 in", values, "cdKaisha2");
            return (Criteria) this;
        }

        public Criteria andCdKaisha2NotIn(List<String> values) {
            addCriterion("CD_KAISHA2 not in", values, "cdKaisha2");
            return (Criteria) this;
        }

        public Criteria andCdKaisha2Between(String value1, String value2) {
            addCriterion("CD_KAISHA2 between", value1, value2, "cdKaisha2");
            return (Criteria) this;
        }

        public Criteria andCdKaisha2NotBetween(String value1, String value2) {
            addCriterion("CD_KAISHA2 not between", value1, value2, "cdKaisha2");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu1IsNull() {
            addCriterion("NM_JORETSU1 is null");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu1IsNotNull() {
            addCriterion("NM_JORETSU1 is not null");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu1EqualTo(Short value) {
            addCriterion("NM_JORETSU1 =", value, "nmJoretsu1");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu1NotEqualTo(Short value) {
            addCriterion("NM_JORETSU1 <>", value, "nmJoretsu1");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu1GreaterThan(Short value) {
            addCriterion("NM_JORETSU1 >", value, "nmJoretsu1");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu1GreaterThanOrEqualTo(Short value) {
            addCriterion("NM_JORETSU1 >=", value, "nmJoretsu1");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu1LessThan(Short value) {
            addCriterion("NM_JORETSU1 <", value, "nmJoretsu1");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu1LessThanOrEqualTo(Short value) {
            addCriterion("NM_JORETSU1 <=", value, "nmJoretsu1");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu1In(List<Short> values) {
            addCriterion("NM_JORETSU1 in", values, "nmJoretsu1");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu1NotIn(List<Short> values) {
            addCriterion("NM_JORETSU1 not in", values, "nmJoretsu1");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu1Between(Short value1, Short value2) {
            addCriterion("NM_JORETSU1 between", value1, value2, "nmJoretsu1");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu1NotBetween(Short value1, Short value2) {
            addCriterion("NM_JORETSU1 not between", value1, value2, "nmJoretsu1");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu2IsNull() {
            addCriterion("NM_JORETSU2 is null");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu2IsNotNull() {
            addCriterion("NM_JORETSU2 is not null");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu2EqualTo(Short value) {
            addCriterion("NM_JORETSU2 =", value, "nmJoretsu2");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu2NotEqualTo(Short value) {
            addCriterion("NM_JORETSU2 <>", value, "nmJoretsu2");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu2GreaterThan(Short value) {
            addCriterion("NM_JORETSU2 >", value, "nmJoretsu2");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu2GreaterThanOrEqualTo(Short value) {
            addCriterion("NM_JORETSU2 >=", value, "nmJoretsu2");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu2LessThan(Short value) {
            addCriterion("NM_JORETSU2 <", value, "nmJoretsu2");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu2LessThanOrEqualTo(Short value) {
            addCriterion("NM_JORETSU2 <=", value, "nmJoretsu2");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu2In(List<Short> values) {
            addCriterion("NM_JORETSU2 in", values, "nmJoretsu2");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu2NotIn(List<Short> values) {
            addCriterion("NM_JORETSU2 not in", values, "nmJoretsu2");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu2Between(Short value1, Short value2) {
            addCriterion("NM_JORETSU2 between", value1, value2, "nmJoretsu2");
            return (Criteria) this;
        }

        public Criteria andNmJoretsu2NotBetween(Short value1, Short value2) {
            addCriterion("NM_JORETSU2 not between", value1, value2, "nmJoretsu2");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TM_KEN
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
     * This class corresponds to the database table TM_KEN
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