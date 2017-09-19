package com.hsy.ai.bean.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TAiLogExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TAiLogExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIsNull() {
            addCriterion("request_url is null");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIsNotNull() {
            addCriterion("request_url is not null");
            return (Criteria) this;
        }

        public Criteria andRequestUrlEqualTo(String value) {
            addCriterion("request_url =", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotEqualTo(String value) {
            addCriterion("request_url <>", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlGreaterThan(String value) {
            addCriterion("request_url >", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlGreaterThanOrEqualTo(String value) {
            addCriterion("request_url >=", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLessThan(String value) {
            addCriterion("request_url <", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLessThanOrEqualTo(String value) {
            addCriterion("request_url <=", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLike(String value) {
            addCriterion("request_url like", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotLike(String value) {
            addCriterion("request_url not like", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIn(List<String> values) {
            addCriterion("request_url in", values, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotIn(List<String> values) {
            addCriterion("request_url not in", values, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlBetween(String value1, String value2) {
            addCriterion("request_url between", value1, value2, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotBetween(String value1, String value2) {
            addCriterion("request_url not between", value1, value2, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRequestActionIsNull() {
            addCriterion("request_action is null");
            return (Criteria) this;
        }

        public Criteria andRequestActionIsNotNull() {
            addCriterion("request_action is not null");
            return (Criteria) this;
        }

        public Criteria andRequestActionEqualTo(String value) {
            addCriterion("request_action =", value, "requestAction");
            return (Criteria) this;
        }

        public Criteria andRequestActionNotEqualTo(String value) {
            addCriterion("request_action <>", value, "requestAction");
            return (Criteria) this;
        }

        public Criteria andRequestActionGreaterThan(String value) {
            addCriterion("request_action >", value, "requestAction");
            return (Criteria) this;
        }

        public Criteria andRequestActionGreaterThanOrEqualTo(String value) {
            addCriterion("request_action >=", value, "requestAction");
            return (Criteria) this;
        }

        public Criteria andRequestActionLessThan(String value) {
            addCriterion("request_action <", value, "requestAction");
            return (Criteria) this;
        }

        public Criteria andRequestActionLessThanOrEqualTo(String value) {
            addCriterion("request_action <=", value, "requestAction");
            return (Criteria) this;
        }

        public Criteria andRequestActionLike(String value) {
            addCriterion("request_action like", value, "requestAction");
            return (Criteria) this;
        }

        public Criteria andRequestActionNotLike(String value) {
            addCriterion("request_action not like", value, "requestAction");
            return (Criteria) this;
        }

        public Criteria andRequestActionIn(List<String> values) {
            addCriterion("request_action in", values, "requestAction");
            return (Criteria) this;
        }

        public Criteria andRequestActionNotIn(List<String> values) {
            addCriterion("request_action not in", values, "requestAction");
            return (Criteria) this;
        }

        public Criteria andRequestActionBetween(String value1, String value2) {
            addCriterion("request_action between", value1, value2, "requestAction");
            return (Criteria) this;
        }

        public Criteria andRequestActionNotBetween(String value1, String value2) {
            addCriterion("request_action not between", value1, value2, "requestAction");
            return (Criteria) this;
        }

        public Criteria andTimingIsNull() {
            addCriterion("timing is null");
            return (Criteria) this;
        }

        public Criteria andTimingIsNotNull() {
            addCriterion("timing is not null");
            return (Criteria) this;
        }

        public Criteria andTimingEqualTo(String value) {
            addCriterion("timing =", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingNotEqualTo(String value) {
            addCriterion("timing <>", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingGreaterThan(String value) {
            addCriterion("timing >", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingGreaterThanOrEqualTo(String value) {
            addCriterion("timing >=", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingLessThan(String value) {
            addCriterion("timing <", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingLessThanOrEqualTo(String value) {
            addCriterion("timing <=", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingLike(String value) {
            addCriterion("timing like", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingNotLike(String value) {
            addCriterion("timing not like", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingIn(List<String> values) {
            addCriterion("timing in", values, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingNotIn(List<String> values) {
            addCriterion("timing not in", values, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingBetween(String value1, String value2) {
            addCriterion("timing between", value1, value2, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingNotBetween(String value1, String value2) {
            addCriterion("timing not between", value1, value2, "timing");
            return (Criteria) this;
        }

        public Criteria andRequestMethodTypeIsNull() {
            addCriterion("request_method_type is null");
            return (Criteria) this;
        }

        public Criteria andRequestMethodTypeIsNotNull() {
            addCriterion("request_method_type is not null");
            return (Criteria) this;
        }

        public Criteria andRequestMethodTypeEqualTo(String value) {
            addCriterion("request_method_type =", value, "requestMethodType");
            return (Criteria) this;
        }

        public Criteria andRequestMethodTypeNotEqualTo(String value) {
            addCriterion("request_method_type <>", value, "requestMethodType");
            return (Criteria) this;
        }

        public Criteria andRequestMethodTypeGreaterThan(String value) {
            addCriterion("request_method_type >", value, "requestMethodType");
            return (Criteria) this;
        }

        public Criteria andRequestMethodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("request_method_type >=", value, "requestMethodType");
            return (Criteria) this;
        }

        public Criteria andRequestMethodTypeLessThan(String value) {
            addCriterion("request_method_type <", value, "requestMethodType");
            return (Criteria) this;
        }

        public Criteria andRequestMethodTypeLessThanOrEqualTo(String value) {
            addCriterion("request_method_type <=", value, "requestMethodType");
            return (Criteria) this;
        }

        public Criteria andRequestMethodTypeLike(String value) {
            addCriterion("request_method_type like", value, "requestMethodType");
            return (Criteria) this;
        }

        public Criteria andRequestMethodTypeNotLike(String value) {
            addCriterion("request_method_type not like", value, "requestMethodType");
            return (Criteria) this;
        }

        public Criteria andRequestMethodTypeIn(List<String> values) {
            addCriterion("request_method_type in", values, "requestMethodType");
            return (Criteria) this;
        }

        public Criteria andRequestMethodTypeNotIn(List<String> values) {
            addCriterion("request_method_type not in", values, "requestMethodType");
            return (Criteria) this;
        }

        public Criteria andRequestMethodTypeBetween(String value1, String value2) {
            addCriterion("request_method_type between", value1, value2, "requestMethodType");
            return (Criteria) this;
        }

        public Criteria andRequestMethodTypeNotBetween(String value1, String value2) {
            addCriterion("request_method_type not between", value1, value2, "requestMethodType");
            return (Criteria) this;
        }

        public Criteria andRequestParamIsNull() {
            addCriterion("request_param is null");
            return (Criteria) this;
        }

        public Criteria andRequestParamIsNotNull() {
            addCriterion("request_param is not null");
            return (Criteria) this;
        }

        public Criteria andRequestParamEqualTo(String value) {
            addCriterion("request_param =", value, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamNotEqualTo(String value) {
            addCriterion("request_param <>", value, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamGreaterThan(String value) {
            addCriterion("request_param >", value, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamGreaterThanOrEqualTo(String value) {
            addCriterion("request_param >=", value, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamLessThan(String value) {
            addCriterion("request_param <", value, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamLessThanOrEqualTo(String value) {
            addCriterion("request_param <=", value, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamLike(String value) {
            addCriterion("request_param like", value, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamNotLike(String value) {
            addCriterion("request_param not like", value, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamIn(List<String> values) {
            addCriterion("request_param in", values, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamNotIn(List<String> values) {
            addCriterion("request_param not in", values, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamBetween(String value1, String value2) {
            addCriterion("request_param between", value1, value2, "requestParam");
            return (Criteria) this;
        }

        public Criteria andRequestParamNotBetween(String value1, String value2) {
            addCriterion("request_param not between", value1, value2, "requestParam");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIsNull() {
            addCriterion("user_remark is null");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIsNotNull() {
            addCriterion("user_remark is not null");
            return (Criteria) this;
        }

        public Criteria andUserRemarkEqualTo(String value) {
            addCriterion("user_remark =", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotEqualTo(String value) {
            addCriterion("user_remark <>", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkGreaterThan(String value) {
            addCriterion("user_remark >", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("user_remark >=", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkLessThan(String value) {
            addCriterion("user_remark <", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkLessThanOrEqualTo(String value) {
            addCriterion("user_remark <=", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkLike(String value) {
            addCriterion("user_remark like", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotLike(String value) {
            addCriterion("user_remark not like", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIn(List<String> values) {
            addCriterion("user_remark in", values, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotIn(List<String> values) {
            addCriterion("user_remark not in", values, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkBetween(String value1, String value2) {
            addCriterion("user_remark between", value1, value2, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotBetween(String value1, String value2) {
            addCriterion("user_remark not between", value1, value2, "userRemark");
            return (Criteria) this;
        }

        public Criteria andRequestIpIsNull() {
            addCriterion("request_ip is null");
            return (Criteria) this;
        }

        public Criteria andRequestIpIsNotNull() {
            addCriterion("request_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRequestIpEqualTo(String value) {
            addCriterion("request_ip =", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotEqualTo(String value) {
            addCriterion("request_ip <>", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpGreaterThan(String value) {
            addCriterion("request_ip >", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpGreaterThanOrEqualTo(String value) {
            addCriterion("request_ip >=", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpLessThan(String value) {
            addCriterion("request_ip <", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpLessThanOrEqualTo(String value) {
            addCriterion("request_ip <=", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpLike(String value) {
            addCriterion("request_ip like", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotLike(String value) {
            addCriterion("request_ip not like", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpIn(List<String> values) {
            addCriterion("request_ip in", values, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotIn(List<String> values) {
            addCriterion("request_ip not in", values, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpBetween(String value1, String value2) {
            addCriterion("request_ip between", value1, value2, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotBetween(String value1, String value2) {
            addCriterion("request_ip not between", value1, value2, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestAddressIsNull() {
            addCriterion("request_address is null");
            return (Criteria) this;
        }

        public Criteria andRequestAddressIsNotNull() {
            addCriterion("request_address is not null");
            return (Criteria) this;
        }

        public Criteria andRequestAddressEqualTo(String value) {
            addCriterion("request_address =", value, "requestAddress");
            return (Criteria) this;
        }

        public Criteria andRequestAddressNotEqualTo(String value) {
            addCriterion("request_address <>", value, "requestAddress");
            return (Criteria) this;
        }

        public Criteria andRequestAddressGreaterThan(String value) {
            addCriterion("request_address >", value, "requestAddress");
            return (Criteria) this;
        }

        public Criteria andRequestAddressGreaterThanOrEqualTo(String value) {
            addCriterion("request_address >=", value, "requestAddress");
            return (Criteria) this;
        }

        public Criteria andRequestAddressLessThan(String value) {
            addCriterion("request_address <", value, "requestAddress");
            return (Criteria) this;
        }

        public Criteria andRequestAddressLessThanOrEqualTo(String value) {
            addCriterion("request_address <=", value, "requestAddress");
            return (Criteria) this;
        }

        public Criteria andRequestAddressLike(String value) {
            addCriterion("request_address like", value, "requestAddress");
            return (Criteria) this;
        }

        public Criteria andRequestAddressNotLike(String value) {
            addCriterion("request_address not like", value, "requestAddress");
            return (Criteria) this;
        }

        public Criteria andRequestAddressIn(List<String> values) {
            addCriterion("request_address in", values, "requestAddress");
            return (Criteria) this;
        }

        public Criteria andRequestAddressNotIn(List<String> values) {
            addCriterion("request_address not in", values, "requestAddress");
            return (Criteria) this;
        }

        public Criteria andRequestAddressBetween(String value1, String value2) {
            addCriterion("request_address between", value1, value2, "requestAddress");
            return (Criteria) this;
        }

        public Criteria andRequestAddressNotBetween(String value1, String value2) {
            addCriterion("request_address not between", value1, value2, "requestAddress");
            return (Criteria) this;
        }

        public Criteria andRequestTimeIsNull() {
            addCriterion("request_time is null");
            return (Criteria) this;
        }

        public Criteria andRequestTimeIsNotNull() {
            addCriterion("request_time is not null");
            return (Criteria) this;
        }

        public Criteria andRequestTimeEqualTo(Date value) {
            addCriterion("request_time =", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeNotEqualTo(Date value) {
            addCriterion("request_time <>", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeGreaterThan(Date value) {
            addCriterion("request_time >", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("request_time >=", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeLessThan(Date value) {
            addCriterion("request_time <", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeLessThanOrEqualTo(Date value) {
            addCriterion("request_time <=", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeIn(List<Date> values) {
            addCriterion("request_time in", values, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeNotIn(List<Date> values) {
            addCriterion("request_time not in", values, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeBetween(Date value1, Date value2) {
            addCriterion("request_time between", value1, value2, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeNotBetween(Date value1, Date value2) {
            addCriterion("request_time not between", value1, value2, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestResponseIsNull() {
            addCriterion("request_response is null");
            return (Criteria) this;
        }

        public Criteria andRequestResponseIsNotNull() {
            addCriterion("request_response is not null");
            return (Criteria) this;
        }

        public Criteria andRequestResponseEqualTo(String value) {
            addCriterion("request_response =", value, "requestResponse");
            return (Criteria) this;
        }

        public Criteria andRequestResponseNotEqualTo(String value) {
            addCriterion("request_response <>", value, "requestResponse");
            return (Criteria) this;
        }

        public Criteria andRequestResponseGreaterThan(String value) {
            addCriterion("request_response >", value, "requestResponse");
            return (Criteria) this;
        }

        public Criteria andRequestResponseGreaterThanOrEqualTo(String value) {
            addCriterion("request_response >=", value, "requestResponse");
            return (Criteria) this;
        }

        public Criteria andRequestResponseLessThan(String value) {
            addCriterion("request_response <", value, "requestResponse");
            return (Criteria) this;
        }

        public Criteria andRequestResponseLessThanOrEqualTo(String value) {
            addCriterion("request_response <=", value, "requestResponse");
            return (Criteria) this;
        }

        public Criteria andRequestResponseLike(String value) {
            addCriterion("request_response like", value, "requestResponse");
            return (Criteria) this;
        }

        public Criteria andRequestResponseNotLike(String value) {
            addCriterion("request_response not like", value, "requestResponse");
            return (Criteria) this;
        }

        public Criteria andRequestResponseIn(List<String> values) {
            addCriterion("request_response in", values, "requestResponse");
            return (Criteria) this;
        }

        public Criteria andRequestResponseNotIn(List<String> values) {
            addCriterion("request_response not in", values, "requestResponse");
            return (Criteria) this;
        }

        public Criteria andRequestResponseBetween(String value1, String value2) {
            addCriterion("request_response between", value1, value2, "requestResponse");
            return (Criteria) this;
        }

        public Criteria andRequestResponseNotBetween(String value1, String value2) {
            addCriterion("request_response not between", value1, value2, "requestResponse");
            return (Criteria) this;
        }

        public Criteria andRequestThreadIdIsNull() {
            addCriterion("request_thread_id is null");
            return (Criteria) this;
        }

        public Criteria andRequestThreadIdIsNotNull() {
            addCriterion("request_thread_id is not null");
            return (Criteria) this;
        }

        public Criteria andRequestThreadIdEqualTo(String value) {
            addCriterion("request_thread_id =", value, "requestThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestThreadIdNotEqualTo(String value) {
            addCriterion("request_thread_id <>", value, "requestThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestThreadIdGreaterThan(String value) {
            addCriterion("request_thread_id >", value, "requestThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestThreadIdGreaterThanOrEqualTo(String value) {
            addCriterion("request_thread_id >=", value, "requestThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestThreadIdLessThan(String value) {
            addCriterion("request_thread_id <", value, "requestThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestThreadIdLessThanOrEqualTo(String value) {
            addCriterion("request_thread_id <=", value, "requestThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestThreadIdLike(String value) {
            addCriterion("request_thread_id like", value, "requestThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestThreadIdNotLike(String value) {
            addCriterion("request_thread_id not like", value, "requestThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestThreadIdIn(List<String> values) {
            addCriterion("request_thread_id in", values, "requestThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestThreadIdNotIn(List<String> values) {
            addCriterion("request_thread_id not in", values, "requestThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestThreadIdBetween(String value1, String value2) {
            addCriterion("request_thread_id between", value1, value2, "requestThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestThreadIdNotBetween(String value1, String value2) {
            addCriterion("request_thread_id not between", value1, value2, "requestThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestSourceIsNull() {
            addCriterion("request_source is null");
            return (Criteria) this;
        }

        public Criteria andRequestSourceIsNotNull() {
            addCriterion("request_source is not null");
            return (Criteria) this;
        }

        public Criteria andRequestSourceEqualTo(String value) {
            addCriterion("request_source =", value, "requestSource");
            return (Criteria) this;
        }

        public Criteria andRequestSourceNotEqualTo(String value) {
            addCriterion("request_source <>", value, "requestSource");
            return (Criteria) this;
        }

        public Criteria andRequestSourceGreaterThan(String value) {
            addCriterion("request_source >", value, "requestSource");
            return (Criteria) this;
        }

        public Criteria andRequestSourceGreaterThanOrEqualTo(String value) {
            addCriterion("request_source >=", value, "requestSource");
            return (Criteria) this;
        }

        public Criteria andRequestSourceLessThan(String value) {
            addCriterion("request_source <", value, "requestSource");
            return (Criteria) this;
        }

        public Criteria andRequestSourceLessThanOrEqualTo(String value) {
            addCriterion("request_source <=", value, "requestSource");
            return (Criteria) this;
        }

        public Criteria andRequestSourceLike(String value) {
            addCriterion("request_source like", value, "requestSource");
            return (Criteria) this;
        }

        public Criteria andRequestSourceNotLike(String value) {
            addCriterion("request_source not like", value, "requestSource");
            return (Criteria) this;
        }

        public Criteria andRequestSourceIn(List<String> values) {
            addCriterion("request_source in", values, "requestSource");
            return (Criteria) this;
        }

        public Criteria andRequestSourceNotIn(List<String> values) {
            addCriterion("request_source not in", values, "requestSource");
            return (Criteria) this;
        }

        public Criteria andRequestSourceBetween(String value1, String value2) {
            addCriterion("request_source between", value1, value2, "requestSource");
            return (Criteria) this;
        }

        public Criteria andRequestSourceNotBetween(String value1, String value2) {
            addCriterion("request_source not between", value1, value2, "requestSource");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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