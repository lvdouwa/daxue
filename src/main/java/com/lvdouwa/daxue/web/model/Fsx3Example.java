package com.lvdouwa.daxue.web.model;

import java.util.ArrayList;
import java.util.List;

public class Fsx3Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Fsx3Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andAveragescoreIsNull() {
            addCriterion("averagescore is null");
            return (Criteria) this;
        }

        public Criteria andAveragescoreIsNotNull() {
            addCriterion("averagescore is not null");
            return (Criteria) this;
        }

        public Criteria andAveragescoreEqualTo(Integer value) {
            addCriterion("averagescore =", value, "averagescore");
            return (Criteria) this;
        }

        public Criteria andAveragescoreNotEqualTo(Integer value) {
            addCriterion("averagescore <>", value, "averagescore");
            return (Criteria) this;
        }

        public Criteria andAveragescoreGreaterThan(Integer value) {
            addCriterion("averagescore >", value, "averagescore");
            return (Criteria) this;
        }

        public Criteria andAveragescoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("averagescore >=", value, "averagescore");
            return (Criteria) this;
        }

        public Criteria andAveragescoreLessThan(Integer value) {
            addCriterion("averagescore <", value, "averagescore");
            return (Criteria) this;
        }

        public Criteria andAveragescoreLessThanOrEqualTo(Integer value) {
            addCriterion("averagescore <=", value, "averagescore");
            return (Criteria) this;
        }

        public Criteria andAveragescoreIn(List<Integer> values) {
            addCriterion("averagescore in", values, "averagescore");
            return (Criteria) this;
        }

        public Criteria andAveragescoreNotIn(List<Integer> values) {
            addCriterion("averagescore not in", values, "averagescore");
            return (Criteria) this;
        }

        public Criteria andAveragescoreBetween(Integer value1, Integer value2) {
            addCriterion("averagescore between", value1, value2, "averagescore");
            return (Criteria) this;
        }

        public Criteria andAveragescoreNotBetween(Integer value1, Integer value2) {
            addCriterion("averagescore not between", value1, value2, "averagescore");
            return (Criteria) this;
        }

        public Criteria andAdvancebatchIsNull() {
            addCriterion("advancebatch is null");
            return (Criteria) this;
        }

        public Criteria andAdvancebatchIsNotNull() {
            addCriterion("advancebatch is not null");
            return (Criteria) this;
        }

        public Criteria andAdvancebatchEqualTo(Integer value) {
            addCriterion("advancebatch =", value, "advancebatch");
            return (Criteria) this;
        }

        public Criteria andAdvancebatchNotEqualTo(Integer value) {
            addCriterion("advancebatch <>", value, "advancebatch");
            return (Criteria) this;
        }

        public Criteria andAdvancebatchGreaterThan(Integer value) {
            addCriterion("advancebatch >", value, "advancebatch");
            return (Criteria) this;
        }

        public Criteria andAdvancebatchGreaterThanOrEqualTo(Integer value) {
            addCriterion("advancebatch >=", value, "advancebatch");
            return (Criteria) this;
        }

        public Criteria andAdvancebatchLessThan(Integer value) {
            addCriterion("advancebatch <", value, "advancebatch");
            return (Criteria) this;
        }

        public Criteria andAdvancebatchLessThanOrEqualTo(Integer value) {
            addCriterion("advancebatch <=", value, "advancebatch");
            return (Criteria) this;
        }

        public Criteria andAdvancebatchIn(List<Integer> values) {
            addCriterion("advancebatch in", values, "advancebatch");
            return (Criteria) this;
        }

        public Criteria andAdvancebatchNotIn(List<Integer> values) {
            addCriterion("advancebatch not in", values, "advancebatch");
            return (Criteria) this;
        }

        public Criteria andAdvancebatchBetween(Integer value1, Integer value2) {
            addCriterion("advancebatch between", value1, value2, "advancebatch");
            return (Criteria) this;
        }

        public Criteria andAdvancebatchNotBetween(Integer value1, Integer value2) {
            addCriterion("advancebatch not between", value1, value2, "advancebatch");
            return (Criteria) this;
        }

        public Criteria andFirstbatchIsNull() {
            addCriterion("firstbatch is null");
            return (Criteria) this;
        }

        public Criteria andFirstbatchIsNotNull() {
            addCriterion("firstbatch is not null");
            return (Criteria) this;
        }

        public Criteria andFirstbatchEqualTo(Integer value) {
            addCriterion("firstbatch =", value, "firstbatch");
            return (Criteria) this;
        }

        public Criteria andFirstbatchNotEqualTo(Integer value) {
            addCriterion("firstbatch <>", value, "firstbatch");
            return (Criteria) this;
        }

        public Criteria andFirstbatchGreaterThan(Integer value) {
            addCriterion("firstbatch >", value, "firstbatch");
            return (Criteria) this;
        }

        public Criteria andFirstbatchGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstbatch >=", value, "firstbatch");
            return (Criteria) this;
        }

        public Criteria andFirstbatchLessThan(Integer value) {
            addCriterion("firstbatch <", value, "firstbatch");
            return (Criteria) this;
        }

        public Criteria andFirstbatchLessThanOrEqualTo(Integer value) {
            addCriterion("firstbatch <=", value, "firstbatch");
            return (Criteria) this;
        }

        public Criteria andFirstbatchIn(List<Integer> values) {
            addCriterion("firstbatch in", values, "firstbatch");
            return (Criteria) this;
        }

        public Criteria andFirstbatchNotIn(List<Integer> values) {
            addCriterion("firstbatch not in", values, "firstbatch");
            return (Criteria) this;
        }

        public Criteria andFirstbatchBetween(Integer value1, Integer value2) {
            addCriterion("firstbatch between", value1, value2, "firstbatch");
            return (Criteria) this;
        }

        public Criteria andFirstbatchNotBetween(Integer value1, Integer value2) {
            addCriterion("firstbatch not between", value1, value2, "firstbatch");
            return (Criteria) this;
        }

        public Criteria andSecondbatchIsNull() {
            addCriterion("secondbatch is null");
            return (Criteria) this;
        }

        public Criteria andSecondbatchIsNotNull() {
            addCriterion("secondbatch is not null");
            return (Criteria) this;
        }

        public Criteria andSecondbatchEqualTo(Integer value) {
            addCriterion("secondbatch =", value, "secondbatch");
            return (Criteria) this;
        }

        public Criteria andSecondbatchNotEqualTo(Integer value) {
            addCriterion("secondbatch <>", value, "secondbatch");
            return (Criteria) this;
        }

        public Criteria andSecondbatchGreaterThan(Integer value) {
            addCriterion("secondbatch >", value, "secondbatch");
            return (Criteria) this;
        }

        public Criteria andSecondbatchGreaterThanOrEqualTo(Integer value) {
            addCriterion("secondbatch >=", value, "secondbatch");
            return (Criteria) this;
        }

        public Criteria andSecondbatchLessThan(Integer value) {
            addCriterion("secondbatch <", value, "secondbatch");
            return (Criteria) this;
        }

        public Criteria andSecondbatchLessThanOrEqualTo(Integer value) {
            addCriterion("secondbatch <=", value, "secondbatch");
            return (Criteria) this;
        }

        public Criteria andSecondbatchIn(List<Integer> values) {
            addCriterion("secondbatch in", values, "secondbatch");
            return (Criteria) this;
        }

        public Criteria andSecondbatchNotIn(List<Integer> values) {
            addCriterion("secondbatch not in", values, "secondbatch");
            return (Criteria) this;
        }

        public Criteria andSecondbatchBetween(Integer value1, Integer value2) {
            addCriterion("secondbatch between", value1, value2, "secondbatch");
            return (Criteria) this;
        }

        public Criteria andSecondbatchNotBetween(Integer value1, Integer value2) {
            addCriterion("secondbatch not between", value1, value2, "secondbatch");
            return (Criteria) this;
        }

        public Criteria andThirdbatchIsNull() {
            addCriterion("thirdbatch is null");
            return (Criteria) this;
        }

        public Criteria andThirdbatchIsNotNull() {
            addCriterion("thirdbatch is not null");
            return (Criteria) this;
        }

        public Criteria andThirdbatchEqualTo(Integer value) {
            addCriterion("thirdbatch =", value, "thirdbatch");
            return (Criteria) this;
        }

        public Criteria andThirdbatchNotEqualTo(Integer value) {
            addCriterion("thirdbatch <>", value, "thirdbatch");
            return (Criteria) this;
        }

        public Criteria andThirdbatchGreaterThan(Integer value) {
            addCriterion("thirdbatch >", value, "thirdbatch");
            return (Criteria) this;
        }

        public Criteria andThirdbatchGreaterThanOrEqualTo(Integer value) {
            addCriterion("thirdbatch >=", value, "thirdbatch");
            return (Criteria) this;
        }

        public Criteria andThirdbatchLessThan(Integer value) {
            addCriterion("thirdbatch <", value, "thirdbatch");
            return (Criteria) this;
        }

        public Criteria andThirdbatchLessThanOrEqualTo(Integer value) {
            addCriterion("thirdbatch <=", value, "thirdbatch");
            return (Criteria) this;
        }

        public Criteria andThirdbatchIn(List<Integer> values) {
            addCriterion("thirdbatch in", values, "thirdbatch");
            return (Criteria) this;
        }

        public Criteria andThirdbatchNotIn(List<Integer> values) {
            addCriterion("thirdbatch not in", values, "thirdbatch");
            return (Criteria) this;
        }

        public Criteria andThirdbatchBetween(Integer value1, Integer value2) {
            addCriterion("thirdbatch between", value1, value2, "thirdbatch");
            return (Criteria) this;
        }

        public Criteria andThirdbatchNotBetween(Integer value1, Integer value2) {
            addCriterion("thirdbatch not between", value1, value2, "thirdbatch");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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