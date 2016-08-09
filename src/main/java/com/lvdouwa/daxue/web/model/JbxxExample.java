package com.lvdouwa.daxue.web.model;

import java.util.ArrayList;
import java.util.List;

public class JbxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JbxxExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSubjectionIsNull() {
            addCriterion("subjection is null");
            return (Criteria) this;
        }

        public Criteria andSubjectionIsNotNull() {
            addCriterion("subjection is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectionEqualTo(String value) {
            addCriterion("subjection =", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionNotEqualTo(String value) {
            addCriterion("subjection <>", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionGreaterThan(String value) {
            addCriterion("subjection >", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionGreaterThanOrEqualTo(String value) {
            addCriterion("subjection >=", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionLessThan(String value) {
            addCriterion("subjection <", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionLessThanOrEqualTo(String value) {
            addCriterion("subjection <=", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionLike(String value) {
            addCriterion("subjection like", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionNotLike(String value) {
            addCriterion("subjection not like", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionIn(List<String> values) {
            addCriterion("subjection in", values, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionNotIn(List<String> values) {
            addCriterion("subjection not in", values, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionBetween(String value1, String value2) {
            addCriterion("subjection between", value1, value2, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionNotBetween(String value1, String value2) {
            addCriterion("subjection not between", value1, value2, "subjection");
            return (Criteria) this;
        }

        public Criteria andKeydisciplineIsNull() {
            addCriterion("keydiscipline is null");
            return (Criteria) this;
        }

        public Criteria andKeydisciplineIsNotNull() {
            addCriterion("keydiscipline is not null");
            return (Criteria) this;
        }

        public Criteria andKeydisciplineEqualTo(Integer value) {
            addCriterion("keydiscipline =", value, "keydiscipline");
            return (Criteria) this;
        }

        public Criteria andKeydisciplineNotEqualTo(Integer value) {
            addCriterion("keydiscipline <>", value, "keydiscipline");
            return (Criteria) this;
        }

        public Criteria andKeydisciplineGreaterThan(Integer value) {
            addCriterion("keydiscipline >", value, "keydiscipline");
            return (Criteria) this;
        }

        public Criteria andKeydisciplineGreaterThanOrEqualTo(Integer value) {
            addCriterion("keydiscipline >=", value, "keydiscipline");
            return (Criteria) this;
        }

        public Criteria andKeydisciplineLessThan(Integer value) {
            addCriterion("keydiscipline <", value, "keydiscipline");
            return (Criteria) this;
        }

        public Criteria andKeydisciplineLessThanOrEqualTo(Integer value) {
            addCriterion("keydiscipline <=", value, "keydiscipline");
            return (Criteria) this;
        }

        public Criteria andKeydisciplineIn(List<Integer> values) {
            addCriterion("keydiscipline in", values, "keydiscipline");
            return (Criteria) this;
        }

        public Criteria andKeydisciplineNotIn(List<Integer> values) {
            addCriterion("keydiscipline not in", values, "keydiscipline");
            return (Criteria) this;
        }

        public Criteria andKeydisciplineBetween(Integer value1, Integer value2) {
            addCriterion("keydiscipline between", value1, value2, "keydiscipline");
            return (Criteria) this;
        }

        public Criteria andKeydisciplineNotBetween(Integer value1, Integer value2) {
            addCriterion("keydiscipline not between", value1, value2, "keydiscipline");
            return (Criteria) this;
        }

        public Criteria andAcademicianIsNull() {
            addCriterion("academician is null");
            return (Criteria) this;
        }

        public Criteria andAcademicianIsNotNull() {
            addCriterion("academician is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicianEqualTo(Integer value) {
            addCriterion("academician =", value, "academician");
            return (Criteria) this;
        }

        public Criteria andAcademicianNotEqualTo(Integer value) {
            addCriterion("academician <>", value, "academician");
            return (Criteria) this;
        }

        public Criteria andAcademicianGreaterThan(Integer value) {
            addCriterion("academician >", value, "academician");
            return (Criteria) this;
        }

        public Criteria andAcademicianGreaterThanOrEqualTo(Integer value) {
            addCriterion("academician >=", value, "academician");
            return (Criteria) this;
        }

        public Criteria andAcademicianLessThan(Integer value) {
            addCriterion("academician <", value, "academician");
            return (Criteria) this;
        }

        public Criteria andAcademicianLessThanOrEqualTo(Integer value) {
            addCriterion("academician <=", value, "academician");
            return (Criteria) this;
        }

        public Criteria andAcademicianIn(List<Integer> values) {
            addCriterion("academician in", values, "academician");
            return (Criteria) this;
        }

        public Criteria andAcademicianNotIn(List<Integer> values) {
            addCriterion("academician not in", values, "academician");
            return (Criteria) this;
        }

        public Criteria andAcademicianBetween(Integer value1, Integer value2) {
            addCriterion("academician between", value1, value2, "academician");
            return (Criteria) this;
        }

        public Criteria andAcademicianNotBetween(Integer value1, Integer value2) {
            addCriterion("academician not between", value1, value2, "academician");
            return (Criteria) this;
        }

        public Criteria andDoctordegreeIsNull() {
            addCriterion("doctordegree is null");
            return (Criteria) this;
        }

        public Criteria andDoctordegreeIsNotNull() {
            addCriterion("doctordegree is not null");
            return (Criteria) this;
        }

        public Criteria andDoctordegreeEqualTo(Integer value) {
            addCriterion("doctordegree =", value, "doctordegree");
            return (Criteria) this;
        }

        public Criteria andDoctordegreeNotEqualTo(Integer value) {
            addCriterion("doctordegree <>", value, "doctordegree");
            return (Criteria) this;
        }

        public Criteria andDoctordegreeGreaterThan(Integer value) {
            addCriterion("doctordegree >", value, "doctordegree");
            return (Criteria) this;
        }

        public Criteria andDoctordegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctordegree >=", value, "doctordegree");
            return (Criteria) this;
        }

        public Criteria andDoctordegreeLessThan(Integer value) {
            addCriterion("doctordegree <", value, "doctordegree");
            return (Criteria) this;
        }

        public Criteria andDoctordegreeLessThanOrEqualTo(Integer value) {
            addCriterion("doctordegree <=", value, "doctordegree");
            return (Criteria) this;
        }

        public Criteria andDoctordegreeIn(List<Integer> values) {
            addCriterion("doctordegree in", values, "doctordegree");
            return (Criteria) this;
        }

        public Criteria andDoctordegreeNotIn(List<Integer> values) {
            addCriterion("doctordegree not in", values, "doctordegree");
            return (Criteria) this;
        }

        public Criteria andDoctordegreeBetween(Integer value1, Integer value2) {
            addCriterion("doctordegree between", value1, value2, "doctordegree");
            return (Criteria) this;
        }

        public Criteria andDoctordegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("doctordegree not between", value1, value2, "doctordegree");
            return (Criteria) this;
        }

        public Criteria andMasterdegreeIsNull() {
            addCriterion("masterdegree is null");
            return (Criteria) this;
        }

        public Criteria andMasterdegreeIsNotNull() {
            addCriterion("masterdegree is not null");
            return (Criteria) this;
        }

        public Criteria andMasterdegreeEqualTo(Integer value) {
            addCriterion("masterdegree =", value, "masterdegree");
            return (Criteria) this;
        }

        public Criteria andMasterdegreeNotEqualTo(Integer value) {
            addCriterion("masterdegree <>", value, "masterdegree");
            return (Criteria) this;
        }

        public Criteria andMasterdegreeGreaterThan(Integer value) {
            addCriterion("masterdegree >", value, "masterdegree");
            return (Criteria) this;
        }

        public Criteria andMasterdegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("masterdegree >=", value, "masterdegree");
            return (Criteria) this;
        }

        public Criteria andMasterdegreeLessThan(Integer value) {
            addCriterion("masterdegree <", value, "masterdegree");
            return (Criteria) this;
        }

        public Criteria andMasterdegreeLessThanOrEqualTo(Integer value) {
            addCriterion("masterdegree <=", value, "masterdegree");
            return (Criteria) this;
        }

        public Criteria andMasterdegreeIn(List<Integer> values) {
            addCriterion("masterdegree in", values, "masterdegree");
            return (Criteria) this;
        }

        public Criteria andMasterdegreeNotIn(List<Integer> values) {
            addCriterion("masterdegree not in", values, "masterdegree");
            return (Criteria) this;
        }

        public Criteria andMasterdegreeBetween(Integer value1, Integer value2) {
            addCriterion("masterdegree between", value1, value2, "masterdegree");
            return (Criteria) this;
        }

        public Criteria andMasterdegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("masterdegree not between", value1, value2, "masterdegree");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria and985or211IsNull() {
            addCriterion("985or211 is null");
            return (Criteria) this;
        }

        public Criteria and985or211IsNotNull() {
            addCriterion("985or211 is not null");
            return (Criteria) this;
        }

        public Criteria and985or211EqualTo(String value) {
            addCriterion("985or211 =", value, "985or211");
            return (Criteria) this;
        }

        public Criteria and985or211NotEqualTo(String value) {
            addCriterion("985or211 <>", value, "985or211");
            return (Criteria) this;
        }

        public Criteria and985or211GreaterThan(String value) {
            addCriterion("985or211 >", value, "985or211");
            return (Criteria) this;
        }

        public Criteria and985or211GreaterThanOrEqualTo(String value) {
            addCriterion("985or211 >=", value, "985or211");
            return (Criteria) this;
        }

        public Criteria and985or211LessThan(String value) {
            addCriterion("985or211 <", value, "985or211");
            return (Criteria) this;
        }

        public Criteria and985or211LessThanOrEqualTo(String value) {
            addCriterion("985or211 <=", value, "985or211");
            return (Criteria) this;
        }

        public Criteria and985or211Like(String value) {
            addCriterion("985or211 like", value, "985or211");
            return (Criteria) this;
        }

        public Criteria and985or211NotLike(String value) {
            addCriterion("985or211 not like", value, "985or211");
            return (Criteria) this;
        }

        public Criteria and985or211In(List<String> values) {
            addCriterion("985or211 in", values, "985or211");
            return (Criteria) this;
        }

        public Criteria and985or211NotIn(List<String> values) {
            addCriterion("985or211 not in", values, "985or211");
            return (Criteria) this;
        }

        public Criteria and985or211Between(String value1, String value2) {
            addCriterion("985or211 between", value1, value2, "985or211");
            return (Criteria) this;
        }

        public Criteria and985or211NotBetween(String value1, String value2) {
            addCriterion("985or211 not between", value1, value2, "985or211");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andWebIsNull() {
            addCriterion("web is null");
            return (Criteria) this;
        }

        public Criteria andWebIsNotNull() {
            addCriterion("web is not null");
            return (Criteria) this;
        }

        public Criteria andWebEqualTo(String value) {
            addCriterion("web =", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotEqualTo(String value) {
            addCriterion("web <>", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebGreaterThan(String value) {
            addCriterion("web >", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebGreaterThanOrEqualTo(String value) {
            addCriterion("web >=", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLessThan(String value) {
            addCriterion("web <", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLessThanOrEqualTo(String value) {
            addCriterion("web <=", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebLike(String value) {
            addCriterion("web like", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotLike(String value) {
            addCriterion("web not like", value, "web");
            return (Criteria) this;
        }

        public Criteria andWebIn(List<String> values) {
            addCriterion("web in", values, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotIn(List<String> values) {
            addCriterion("web not in", values, "web");
            return (Criteria) this;
        }

        public Criteria andWebBetween(String value1, String value2) {
            addCriterion("web between", value1, value2, "web");
            return (Criteria) this;
        }

        public Criteria andWebNotBetween(String value1, String value2) {
            addCriterion("web not between", value1, value2, "web");
            return (Criteria) this;
        }

        public Criteria andProfileIsNull() {
            addCriterion("profile is null");
            return (Criteria) this;
        }

        public Criteria andProfileIsNotNull() {
            addCriterion("profile is not null");
            return (Criteria) this;
        }

        public Criteria andProfileEqualTo(String value) {
            addCriterion("profile =", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotEqualTo(String value) {
            addCriterion("profile <>", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileGreaterThan(String value) {
            addCriterion("profile >", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileGreaterThanOrEqualTo(String value) {
            addCriterion("profile >=", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLessThan(String value) {
            addCriterion("profile <", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLessThanOrEqualTo(String value) {
            addCriterion("profile <=", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLike(String value) {
            addCriterion("profile like", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotLike(String value) {
            addCriterion("profile not like", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileIn(List<String> values) {
            addCriterion("profile in", values, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotIn(List<String> values) {
            addCriterion("profile not in", values, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileBetween(String value1, String value2) {
            addCriterion("profile between", value1, value2, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotBetween(String value1, String value2) {
            addCriterion("profile not between", value1, value2, "profile");
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