package model.jumei_product.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class jumei_tagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public jumei_tagExample() {
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jumei_tag
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public jumei_tagExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jumei_tag
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public jumei_tagExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jumei_tag
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static Criteria newAndCreateCriteria() {
        jumei_tagExample example = new jumei_tagExample();
        return example.createCriteria();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jumei_tag
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public jumei_tagExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jumei_tag
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public jumei_tagExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
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

        public Criteria andTagIdIsNull() {
            addCriterion("tag_id is null");
            return (Criteria) this;
        }

        public Criteria andTagIdIsNotNull() {
            addCriterion("tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andTagIdEqualTo(Integer value) {
            addCriterion("tag_id =", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotEqualTo(Integer value) {
            addCriterion("tag_id <>", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThan(Integer value) {
            addCriterion("tag_id >", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tag_id >=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThan(Integer value) {
            addCriterion("tag_id <", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThanOrEqualTo(Integer value) {
            addCriterion("tag_id <=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdIn(List<Integer> values) {
            addCriterion("tag_id in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotIn(List<Integer> values) {
            addCriterion("tag_id not in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdBetween(Integer value1, Integer value2) {
            addCriterion("tag_id between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tag_id not between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagNameIsNull() {
            addCriterion("tag_name is null");
            return (Criteria) this;
        }

        public Criteria andTagNameIsNotNull() {
            addCriterion("tag_name is not null");
            return (Criteria) this;
        }

        public Criteria andTagNameEqualTo(String value) {
            addCriterion("tag_name =", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotEqualTo(String value) {
            addCriterion("tag_name <>", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameGreaterThan(String value) {
            addCriterion("tag_name >", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameGreaterThanOrEqualTo(String value) {
            addCriterion("tag_name >=", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLessThan(String value) {
            addCriterion("tag_name <", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLessThanOrEqualTo(String value) {
            addCriterion("tag_name <=", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLike(String value) {
            addCriterion("tag_name like", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotLike(String value) {
            addCriterion("tag_name not like", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameIn(List<String> values) {
            addCriterion("tag_name in", values, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotIn(List<String> values) {
            addCriterion("tag_name not in", values, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameBetween(String value1, String value2) {
            addCriterion("tag_name between", value1, value2, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotBetween(String value1, String value2) {
            addCriterion("tag_name not between", value1, value2, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagStatusIsNull() {
            addCriterion("tag_status is null");
            return (Criteria) this;
        }

        public Criteria andTagStatusIsNotNull() {
            addCriterion("tag_status is not null");
            return (Criteria) this;
        }

        public Criteria andTagStatusEqualTo(Byte value) {
            addCriterion("tag_status =", value, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusNotEqualTo(Byte value) {
            addCriterion("tag_status <>", value, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusGreaterThan(Byte value) {
            addCriterion("tag_status >", value, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tag_status >=", value, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusLessThan(Byte value) {
            addCriterion("tag_status <", value, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tag_status <=", value, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusIn(List<Byte> values) {
            addCriterion("tag_status in", values, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusNotIn(List<Byte> values) {
            addCriterion("tag_status not in", values, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusBetween(Byte value1, Byte value2) {
            addCriterion("tag_status between", value1, value2, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tag_status not between", value1, value2, "tagStatus");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionIsNull() {
            addCriterion("tag_description is null");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionIsNotNull() {
            addCriterion("tag_description is not null");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionEqualTo(String value) {
            addCriterion("tag_description =", value, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionNotEqualTo(String value) {
            addCriterion("tag_description <>", value, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionGreaterThan(String value) {
            addCriterion("tag_description >", value, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("tag_description >=", value, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionLessThan(String value) {
            addCriterion("tag_description <", value, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionLessThanOrEqualTo(String value) {
            addCriterion("tag_description <=", value, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionLike(String value) {
            addCriterion("tag_description like", value, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionNotLike(String value) {
            addCriterion("tag_description not like", value, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionIn(List<String> values) {
            addCriterion("tag_description in", values, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionNotIn(List<String> values) {
            addCriterion("tag_description not in", values, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionBetween(String value1, String value2) {
            addCriterion("tag_description between", value1, value2, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionNotBetween(String value1, String value2) {
            addCriterion("tag_description not between", value1, value2, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIsNull() {
            addCriterion("last_update_user is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIsNotNull() {
            addCriterion("last_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserEqualTo(String value) {
            addCriterion("last_update_user =", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotEqualTo(String value) {
            addCriterion("last_update_user <>", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserGreaterThan(String value) {
            addCriterion("last_update_user >", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("last_update_user >=", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserLessThan(String value) {
            addCriterion("last_update_user <", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("last_update_user <=", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserLike(String value) {
            addCriterion("last_update_user like", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotLike(String value) {
            addCriterion("last_update_user not like", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIn(List<String> values) {
            addCriterion("last_update_user in", values, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotIn(List<String> values) {
            addCriterion("last_update_user not in", values, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserBetween(String value1, String value2) {
            addCriterion("last_update_user between", value1, value2, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotBetween(String value1, String value2) {
            addCriterion("last_update_user not between", value1, value2, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTagSaleImgIsNull() {
            addCriterion("tag_sale_img is null");
            return (Criteria) this;
        }

        public Criteria andTagSaleImgIsNotNull() {
            addCriterion("tag_sale_img is not null");
            return (Criteria) this;
        }

        public Criteria andTagSaleImgEqualTo(String value) {
            addCriterion("tag_sale_img =", value, "tagSaleImg");
            return (Criteria) this;
        }

        public Criteria andTagSaleImgNotEqualTo(String value) {
            addCriterion("tag_sale_img <>", value, "tagSaleImg");
            return (Criteria) this;
        }

        public Criteria andTagSaleImgGreaterThan(String value) {
            addCriterion("tag_sale_img >", value, "tagSaleImg");
            return (Criteria) this;
        }

        public Criteria andTagSaleImgGreaterThanOrEqualTo(String value) {
            addCriterion("tag_sale_img >=", value, "tagSaleImg");
            return (Criteria) this;
        }

        public Criteria andTagSaleImgLessThan(String value) {
            addCriterion("tag_sale_img <", value, "tagSaleImg");
            return (Criteria) this;
        }

        public Criteria andTagSaleImgLessThanOrEqualTo(String value) {
            addCriterion("tag_sale_img <=", value, "tagSaleImg");
            return (Criteria) this;
        }

        public Criteria andTagSaleImgLike(String value) {
            addCriterion("tag_sale_img like", value, "tagSaleImg");
            return (Criteria) this;
        }

        public Criteria andTagSaleImgNotLike(String value) {
            addCriterion("tag_sale_img not like", value, "tagSaleImg");
            return (Criteria) this;
        }

        public Criteria andTagSaleImgIn(List<String> values) {
            addCriterion("tag_sale_img in", values, "tagSaleImg");
            return (Criteria) this;
        }

        public Criteria andTagSaleImgNotIn(List<String> values) {
            addCriterion("tag_sale_img not in", values, "tagSaleImg");
            return (Criteria) this;
        }

        public Criteria andTagSaleImgBetween(String value1, String value2) {
            addCriterion("tag_sale_img between", value1, value2, "tagSaleImg");
            return (Criteria) this;
        }

        public Criteria andTagSaleImgNotBetween(String value1, String value2) {
            addCriterion("tag_sale_img not between", value1, value2, "tagSaleImg");
            return (Criteria) this;
        }

        public Criteria andTagUseTypeIsNull() {
            addCriterion("tag_use_type is null");
            return (Criteria) this;
        }

        public Criteria andTagUseTypeIsNotNull() {
            addCriterion("tag_use_type is not null");
            return (Criteria) this;
        }

        public Criteria andTagUseTypeEqualTo(String value) {
            addCriterion("tag_use_type =", value, "tagUseType");
            return (Criteria) this;
        }

        public Criteria andTagUseTypeNotEqualTo(String value) {
            addCriterion("tag_use_type <>", value, "tagUseType");
            return (Criteria) this;
        }

        public Criteria andTagUseTypeGreaterThan(String value) {
            addCriterion("tag_use_type >", value, "tagUseType");
            return (Criteria) this;
        }

        public Criteria andTagUseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tag_use_type >=", value, "tagUseType");
            return (Criteria) this;
        }

        public Criteria andTagUseTypeLessThan(String value) {
            addCriterion("tag_use_type <", value, "tagUseType");
            return (Criteria) this;
        }

        public Criteria andTagUseTypeLessThanOrEqualTo(String value) {
            addCriterion("tag_use_type <=", value, "tagUseType");
            return (Criteria) this;
        }

        public Criteria andTagUseTypeLike(String value) {
            addCriterion("tag_use_type like", value, "tagUseType");
            return (Criteria) this;
        }

        public Criteria andTagUseTypeNotLike(String value) {
            addCriterion("tag_use_type not like", value, "tagUseType");
            return (Criteria) this;
        }

        public Criteria andTagUseTypeIn(List<String> values) {
            addCriterion("tag_use_type in", values, "tagUseType");
            return (Criteria) this;
        }

        public Criteria andTagUseTypeNotIn(List<String> values) {
            addCriterion("tag_use_type not in", values, "tagUseType");
            return (Criteria) this;
        }

        public Criteria andTagUseTypeBetween(String value1, String value2) {
            addCriterion("tag_use_type between", value1, value2, "tagUseType");
            return (Criteria) this;
        }

        public Criteria andTagUseTypeNotBetween(String value1, String value2) {
            addCriterion("tag_use_type not between", value1, value2, "tagUseType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table jumei_tag
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private jumei_tagExample example;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jumei_tag
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        protected Criteria(jumei_tagExample example) {
            super();
            this.example = example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jumei_tag
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public jumei_tagExample example() {
            return this.example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jumei_tag
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jumei_tag
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jumei_tag
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        /**
         * This interface was generated by MyBatis Generator.
         * This interface corresponds to the database table jumei_tag
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        @Deprecated
        public interface ICriteriaAdd {
            /**
             * This method was generated by MyBatis Generator.
             * This method corresponds to the database table jumei_tag
             *
             * @mbg.generated
             * @project https://github.com/itfsw/mybatis-generator-plugin
             */
            Criteria add(Criteria add);
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

    /**
     * This interface was generated by MyBatis Generator.
     * This interface corresponds to the database table jumei_tag
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public interface ICriteriaWhen {
        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jumei_tag
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        void criteria(Criteria criteria);
    }

    /**
     * This interface was generated by MyBatis Generator.
     * This interface corresponds to the database table jumei_tag
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public interface IExampleWhen {
        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jumei_tag
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        void example(model.jumei_product.pojo.jumei_tagExample example);
    }
}