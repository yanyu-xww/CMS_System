package edu.xww.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemConfigExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table system_config
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table system_config
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table system_config
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_config
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    public SystemConfigExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_config
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_config
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_config
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_config
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_config
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_config
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_config
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_config
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
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
     * This method corresponds to the database table system_config
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_config
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table system_config
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
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

        public Criteria andIdIsNull() {
            addCriterion("config.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("config.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("config.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("config.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("config.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("config.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("config.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("config.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("config.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("config.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("config.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("config.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andConfigNameIsNull() {
            addCriterion("config.config_name is null");
            return (Criteria) this;
        }

        public Criteria andConfigNameIsNotNull() {
            addCriterion("config.config_name is not null");
            return (Criteria) this;
        }

        public Criteria andConfigNameEqualTo(String value) {
            addCriterion("config.config_name =", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotEqualTo(String value) {
            addCriterion("config.config_name <>", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameGreaterThan(String value) {
            addCriterion("config.config_name >", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameGreaterThanOrEqualTo(String value) {
            addCriterion("config.config_name >=", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLessThan(String value) {
            addCriterion("config.config_name <", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLessThanOrEqualTo(String value) {
            addCriterion("config.config_name <=", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLike(String value) {
            addCriterion("config.config_name like", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotLike(String value) {
            addCriterion("config.config_name not like", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameIn(List<String> values) {
            addCriterion("config.config_name in", values, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotIn(List<String> values) {
            addCriterion("config.config_name not in", values, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameBetween(String value1, String value2) {
            addCriterion("config.config_name between", value1, value2, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotBetween(String value1, String value2) {
            addCriterion("config.config_name not between", value1, value2, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigKeyIsNull() {
            addCriterion("config.config_key is null");
            return (Criteria) this;
        }

        public Criteria andConfigKeyIsNotNull() {
            addCriterion("config.config_key is not null");
            return (Criteria) this;
        }

        public Criteria andConfigKeyEqualTo(String value) {
            addCriterion("config.config_key =", value, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyNotEqualTo(String value) {
            addCriterion("config.config_key <>", value, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyGreaterThan(String value) {
            addCriterion("config.config_key >", value, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyGreaterThanOrEqualTo(String value) {
            addCriterion("config.config_key >=", value, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyLessThan(String value) {
            addCriterion("config.config_key <", value, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyLessThanOrEqualTo(String value) {
            addCriterion("config.config_key <=", value, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyLike(String value) {
            addCriterion("config.config_key like", value, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyNotLike(String value) {
            addCriterion("config.config_key not like", value, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyIn(List<String> values) {
            addCriterion("config.config_key in", values, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyNotIn(List<String> values) {
            addCriterion("config.config_key not in", values, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyBetween(String value1, String value2) {
            addCriterion("config.config_key between", value1, value2, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigKeyNotBetween(String value1, String value2) {
            addCriterion("config.config_key not between", value1, value2, "configKey");
            return (Criteria) this;
        }

        public Criteria andConfigTypeIsNull() {
            addCriterion("config.config_type is null");
            return (Criteria) this;
        }

        public Criteria andConfigTypeIsNotNull() {
            addCriterion("config.config_type is not null");
            return (Criteria) this;
        }

        public Criteria andConfigTypeEqualTo(String value) {
            addCriterion("config.config_type =", value, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeNotEqualTo(String value) {
            addCriterion("config.config_type <>", value, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeGreaterThan(String value) {
            addCriterion("config.config_type >", value, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeGreaterThanOrEqualTo(String value) {
            addCriterion("config.config_type >=", value, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeLessThan(String value) {
            addCriterion("config.config_type <", value, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeLessThanOrEqualTo(String value) {
            addCriterion("config.config_type <=", value, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeLike(String value) {
            addCriterion("config.config_type like", value, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeNotLike(String value) {
            addCriterion("config.config_type not like", value, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeIn(List<String> values) {
            addCriterion("config.config_type in", values, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeNotIn(List<String> values) {
            addCriterion("config.config_type not in", values, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeBetween(String value1, String value2) {
            addCriterion("config.config_type between", value1, value2, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeNotBetween(String value1, String value2) {
            addCriterion("config.config_type not between", value1, value2, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigValueIsNull() {
            addCriterion("config.config_value is null");
            return (Criteria) this;
        }

        public Criteria andConfigValueIsNotNull() {
            addCriterion("config.config_value is not null");
            return (Criteria) this;
        }

        public Criteria andConfigValueEqualTo(String value) {
            addCriterion("config.config_value =", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueNotEqualTo(String value) {
            addCriterion("config.config_value <>", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueGreaterThan(String value) {
            addCriterion("config.config_value >", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueGreaterThanOrEqualTo(String value) {
            addCriterion("config.config_value >=", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueLessThan(String value) {
            addCriterion("config.config_value <", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueLessThanOrEqualTo(String value) {
            addCriterion("config.config_value <=", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueLike(String value) {
            addCriterion("config.config_value like", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueNotLike(String value) {
            addCriterion("config.config_value not like", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueIn(List<String> values) {
            addCriterion("config.config_value in", values, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueNotIn(List<String> values) {
            addCriterion("config.config_value not in", values, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueBetween(String value1, String value2) {
            addCriterion("config.config_value between", value1, value2, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueNotBetween(String value1, String value2) {
            addCriterion("config.config_value not between", value1, value2, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigDesIsNull() {
            addCriterion("config.config_des is null");
            return (Criteria) this;
        }

        public Criteria andConfigDesIsNotNull() {
            addCriterion("config.config_des is not null");
            return (Criteria) this;
        }

        public Criteria andConfigDesEqualTo(String value) {
            addCriterion("config.config_des =", value, "configDes");
            return (Criteria) this;
        }

        public Criteria andConfigDesNotEqualTo(String value) {
            addCriterion("config.config_des <>", value, "configDes");
            return (Criteria) this;
        }

        public Criteria andConfigDesGreaterThan(String value) {
            addCriterion("config.config_des >", value, "configDes");
            return (Criteria) this;
        }

        public Criteria andConfigDesGreaterThanOrEqualTo(String value) {
            addCriterion("config.config_des >=", value, "configDes");
            return (Criteria) this;
        }

        public Criteria andConfigDesLessThan(String value) {
            addCriterion("config.config_des <", value, "configDes");
            return (Criteria) this;
        }

        public Criteria andConfigDesLessThanOrEqualTo(String value) {
            addCriterion("config.config_des <=", value, "configDes");
            return (Criteria) this;
        }

        public Criteria andConfigDesLike(String value) {
            addCriterion("config.config_des like", value, "configDes");
            return (Criteria) this;
        }

        public Criteria andConfigDesNotLike(String value) {
            addCriterion("config.config_des not like", value, "configDes");
            return (Criteria) this;
        }

        public Criteria andConfigDesIn(List<String> values) {
            addCriterion("config.config_des in", values, "configDes");
            return (Criteria) this;
        }

        public Criteria andConfigDesNotIn(List<String> values) {
            addCriterion("config.config_des not in", values, "configDes");
            return (Criteria) this;
        }

        public Criteria andConfigDesBetween(String value1, String value2) {
            addCriterion("config.config_des between", value1, value2, "configDes");
            return (Criteria) this;
        }

        public Criteria andConfigDesNotBetween(String value1, String value2) {
            addCriterion("config.config_des not between", value1, value2, "configDes");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("config.add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("config.add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("config.add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("config.add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("config.add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("config.add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("config.add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("config.add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("config.add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("config.add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("config.add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("config.add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("config.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("config.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("config.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("config.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("config.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("config.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("config.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("config.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("config.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("config.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("config.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("config.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeIsNull() {
            addCriterion("config.del_time is null");
            return (Criteria) this;
        }

        public Criteria andDelTimeIsNotNull() {
            addCriterion("config.del_time is not null");
            return (Criteria) this;
        }

        public Criteria andDelTimeEqualTo(Integer value) {
            addCriterion("config.del_time =", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotEqualTo(Integer value) {
            addCriterion("config.del_time <>", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeGreaterThan(Integer value) {
            addCriterion("config.del_time >", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("config.del_time >=", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeLessThan(Integer value) {
            addCriterion("config.del_time <", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeLessThanOrEqualTo(Integer value) {
            addCriterion("config.del_time <=", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeIn(List<Integer> values) {
            addCriterion("config.del_time in", values, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotIn(List<Integer> values) {
            addCriterion("config.del_time not in", values, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeBetween(Integer value1, Integer value2) {
            addCriterion("config.del_time between", value1, value2, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("config.del_time not between", value1, value2, "delTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table system_config
     *
     * @mbg.generated do_not_delete_during_merge Thu Nov 04 10:36:30 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table system_config
     *
     * @mbg.generated Thu Nov 04 10:36:30 CST 2021
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