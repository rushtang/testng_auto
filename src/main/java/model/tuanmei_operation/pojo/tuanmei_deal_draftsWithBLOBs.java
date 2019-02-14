package model.tuanmei_operation.pojo;

import java.math.BigDecimal;

public class tuanmei_deal_draftsWithBLOBs extends tuanmei_deal_drafts {
    private String note;

    private String description;

    private String descriptionImages;

    private String descriptionProperties;

    private String descriptionUsage;

    private String metaDescription;

    private String draftGuideComments;

    private String draftOurComments;

    private String draftRelatedHashIds;

    private String draftMobileInfos;

    private String orderPromoCardSet;

    private String productDetailImages;

    private String dealProductProperties;

    public tuanmei_deal_draftsWithBLOBs(String hashId, Integer dealId, String name, Double originalPrice, Double discountedPrice, String discount, Integer buyerNumber, Integer purchaseLowerLimit, Integer purchaseUpperLimit, Integer startTime, Integer endTime, Byte status, Integer tippedTime, Integer stocks, String shortName, String attributes, Double deliveryFee, String category, String showCategory, String dealGroupLabel, String site, Integer realBuyerNumber, String skuNo, String metaKeywords, Integer draftCreateTime, String draftCreateUsername, Integer draftUpdateTime, String draftUpdateUsername, String draftContentTopAdImage, String draftContentTopAdUrl, Integer productId, Integer brandId, String brandLabel, BigDecimal redeemLowestTotalPrice, Integer userPurchaseLimit, Integer secondKillTime, String mediumName, Byte isB2cDeal, String relatedDealGroupName, String editorUsername, Integer shippingSystemId, String shippingSystemType, String specialDealGroupName, Boolean isShownInHome, String updateEditor, String refundPolicy, String saleType, Byte needSync, Integer endingBuyerNumber, String adCopy, BigDecimal goldMemberPrice, BigDecimal platinumMemberPrice, BigDecimal diamondMemberPrice, String company, Boolean dxTag, String focusTitle, String focusImgCount, String focusBgColor, String platform, String saleShortName, BigDecimal maxDiscountedPrice, String note, String description, String descriptionImages, String descriptionProperties, String descriptionUsage, String metaDescription, String draftGuideComments, String draftOurComments, String draftRelatedHashIds, String draftMobileInfos, String orderPromoCardSet, String productDetailImages, String dealProductProperties) {
        super(hashId, dealId, name, originalPrice, discountedPrice, discount, buyerNumber, purchaseLowerLimit, purchaseUpperLimit, startTime, endTime, status, tippedTime, stocks, shortName, attributes, deliveryFee, category, showCategory, dealGroupLabel, site, realBuyerNumber, skuNo, metaKeywords, draftCreateTime, draftCreateUsername, draftUpdateTime, draftUpdateUsername, draftContentTopAdImage, draftContentTopAdUrl, productId, brandId, brandLabel, redeemLowestTotalPrice, userPurchaseLimit, secondKillTime, mediumName, isB2cDeal, relatedDealGroupName, editorUsername, shippingSystemId, shippingSystemType, specialDealGroupName, isShownInHome, updateEditor, refundPolicy, saleType, needSync, endingBuyerNumber, adCopy, goldMemberPrice, platinumMemberPrice, diamondMemberPrice, company, dxTag, focusTitle, focusImgCount, focusBgColor, platform, saleShortName, maxDiscountedPrice);
        this.note = note;
        this.description = description;
        this.descriptionImages = descriptionImages;
        this.descriptionProperties = descriptionProperties;
        this.descriptionUsage = descriptionUsage;
        this.metaDescription = metaDescription;
        this.draftGuideComments = draftGuideComments;
        this.draftOurComments = draftOurComments;
        this.draftRelatedHashIds = draftRelatedHashIds;
        this.draftMobileInfos = draftMobileInfos;
        this.orderPromoCardSet = orderPromoCardSet;
        this.productDetailImages = productDetailImages;
        this.dealProductProperties = dealProductProperties;
    }

    public tuanmei_deal_draftsWithBLOBs() {
        super();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDescriptionImages() {
        return descriptionImages;
    }

    public void setDescriptionImages(String descriptionImages) {
        this.descriptionImages = descriptionImages == null ? null : descriptionImages.trim();
    }

    public String getDescriptionProperties() {
        return descriptionProperties;
    }

    public void setDescriptionProperties(String descriptionProperties) {
        this.descriptionProperties = descriptionProperties == null ? null : descriptionProperties.trim();
    }

    public String getDescriptionUsage() {
        return descriptionUsage;
    }

    public void setDescriptionUsage(String descriptionUsage) {
        this.descriptionUsage = descriptionUsage == null ? null : descriptionUsage.trim();
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription == null ? null : metaDescription.trim();
    }

    public String getDraftGuideComments() {
        return draftGuideComments;
    }

    public void setDraftGuideComments(String draftGuideComments) {
        this.draftGuideComments = draftGuideComments == null ? null : draftGuideComments.trim();
    }

    public String getDraftOurComments() {
        return draftOurComments;
    }

    public void setDraftOurComments(String draftOurComments) {
        this.draftOurComments = draftOurComments == null ? null : draftOurComments.trim();
    }

    public String getDraftRelatedHashIds() {
        return draftRelatedHashIds;
    }

    public void setDraftRelatedHashIds(String draftRelatedHashIds) {
        this.draftRelatedHashIds = draftRelatedHashIds == null ? null : draftRelatedHashIds.trim();
    }

    public String getDraftMobileInfos() {
        return draftMobileInfos;
    }

    public void setDraftMobileInfos(String draftMobileInfos) {
        this.draftMobileInfos = draftMobileInfos == null ? null : draftMobileInfos.trim();
    }

    public String getOrderPromoCardSet() {
        return orderPromoCardSet;
    }

    public void setOrderPromoCardSet(String orderPromoCardSet) {
        this.orderPromoCardSet = orderPromoCardSet == null ? null : orderPromoCardSet.trim();
    }

    public String getProductDetailImages() {
        return productDetailImages;
    }

    public void setProductDetailImages(String productDetailImages) {
        this.productDetailImages = productDetailImages == null ? null : productDetailImages.trim();
    }

    public String getDealProductProperties() {
        return dealProductProperties;
    }

    public void setDealProductProperties(String dealProductProperties) {
        this.dealProductProperties = dealProductProperties == null ? null : dealProductProperties.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuanmei_deal_drafts
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static tuanmei_deal_draftsWithBLOBs.Builder builder() {
        return new tuanmei_deal_draftsWithBLOBs.Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tuanmei_deal_drafts
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static class Builder extends tuanmei_deal_drafts.Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table tuanmei_deal_drafts
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private tuanmei_deal_draftsWithBLOBs obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table tuanmei_deal_drafts
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder() {
            this.obj = new tuanmei_deal_draftsWithBLOBs();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.hash_id
         *
         * @param hashId the value for tuanmei_deal_drafts.hash_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder hashId(String hashId) {
            obj.setHashId(hashId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.deal_id
         *
         * @param dealId the value for tuanmei_deal_drafts.deal_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder dealId(Integer dealId) {
            obj.setDealId(dealId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.name
         *
         * @param name the value for tuanmei_deal_drafts.name
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder name(String name) {
            obj.setName(name);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.original_price
         *
         * @param originalPrice the value for tuanmei_deal_drafts.original_price
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder originalPrice(Double originalPrice) {
            obj.setOriginalPrice(originalPrice);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.discount
         *
         * @param discount the value for tuanmei_deal_drafts.discount
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder discount(String discount) {
            obj.setDiscount(discount);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.discounted_price
         *
         * @param discountedPrice the value for tuanmei_deal_drafts.discounted_price
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder discountedPrice(Double discountedPrice) {
            obj.setDiscountedPrice(discountedPrice);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.buyer_number
         *
         * @param buyerNumber the value for tuanmei_deal_drafts.buyer_number
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder buyerNumber(Integer buyerNumber) {
            obj.setBuyerNumber(buyerNumber);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.purchase_lower_limit
         *
         * @param purchaseLowerLimit the value for tuanmei_deal_drafts.purchase_lower_limit
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder purchaseLowerLimit(Integer purchaseLowerLimit) {
            obj.setPurchaseLowerLimit(purchaseLowerLimit);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.purchase_upper_limit
         *
         * @param purchaseUpperLimit the value for tuanmei_deal_drafts.purchase_upper_limit
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder purchaseUpperLimit(Integer purchaseUpperLimit) {
            obj.setPurchaseUpperLimit(purchaseUpperLimit);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.start_time
         *
         * @param startTime the value for tuanmei_deal_drafts.start_time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder startTime(Integer startTime) {
            obj.setStartTime(startTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.end_time
         *
         * @param endTime the value for tuanmei_deal_drafts.end_time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder endTime(Integer endTime) {
            obj.setEndTime(endTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.status
         *
         * @param status the value for tuanmei_deal_drafts.status
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder status(Byte status) {
            obj.setStatus(status);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.tipped_time
         *
         * @param tippedTime the value for tuanmei_deal_drafts.tipped_time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder tippedTime(Integer tippedTime) {
            obj.setTippedTime(tippedTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.stocks
         *
         * @param stocks the value for tuanmei_deal_drafts.stocks
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder stocks(Integer stocks) {
            obj.setStocks(stocks);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.short_name
         *
         * @param shortName the value for tuanmei_deal_drafts.short_name
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder shortName(String shortName) {
            obj.setShortName(shortName);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.attributes
         *
         * @param attributes the value for tuanmei_deal_drafts.attributes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder attributes(String attributes) {
            obj.setAttributes(attributes);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.delivery_fee
         *
         * @param deliveryFee the value for tuanmei_deal_drafts.delivery_fee
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder deliveryFee(Double deliveryFee) {
            obj.setDeliveryFee(deliveryFee);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.category
         *
         * @param category the value for tuanmei_deal_drafts.category
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder category(String category) {
            obj.setCategory(category);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.show_category
         *
         * @param showCategory the value for tuanmei_deal_drafts.show_category
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder showCategory(String showCategory) {
            obj.setShowCategory(showCategory);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.deal_group_label
         *
         * @param dealGroupLabel the value for tuanmei_deal_drafts.deal_group_label
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder dealGroupLabel(String dealGroupLabel) {
            obj.setDealGroupLabel(dealGroupLabel);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.site
         *
         * @param site the value for tuanmei_deal_drafts.site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder site(String site) {
            obj.setSite(site);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.real_buyer_number
         *
         * @param realBuyerNumber the value for tuanmei_deal_drafts.real_buyer_number
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder realBuyerNumber(Integer realBuyerNumber) {
            obj.setRealBuyerNumber(realBuyerNumber);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.sku_no
         *
         * @param skuNo the value for tuanmei_deal_drafts.sku_no
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder skuNo(String skuNo) {
            obj.setSkuNo(skuNo);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.meta_keywords
         *
         * @param metaKeywords the value for tuanmei_deal_drafts.meta_keywords
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder metaKeywords(String metaKeywords) {
            obj.setMetaKeywords(metaKeywords);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.draft_create_time
         *
         * @param draftCreateTime the value for tuanmei_deal_drafts.draft_create_time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder draftCreateTime(Integer draftCreateTime) {
            obj.setDraftCreateTime(draftCreateTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.draft_create_username
         *
         * @param draftCreateUsername the value for tuanmei_deal_drafts.draft_create_username
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder draftCreateUsername(String draftCreateUsername) {
            obj.setDraftCreateUsername(draftCreateUsername);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.draft_update_time
         *
         * @param draftUpdateTime the value for tuanmei_deal_drafts.draft_update_time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder draftUpdateTime(Integer draftUpdateTime) {
            obj.setDraftUpdateTime(draftUpdateTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.draft_update_username
         *
         * @param draftUpdateUsername the value for tuanmei_deal_drafts.draft_update_username
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder draftUpdateUsername(String draftUpdateUsername) {
            obj.setDraftUpdateUsername(draftUpdateUsername);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.draft_content_top_ad_image
         *
         * @param draftContentTopAdImage the value for tuanmei_deal_drafts.draft_content_top_ad_image
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder draftContentTopAdImage(String draftContentTopAdImage) {
            obj.setDraftContentTopAdImage(draftContentTopAdImage);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.draft_content_top_ad_url
         *
         * @param draftContentTopAdUrl the value for tuanmei_deal_drafts.draft_content_top_ad_url
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder draftContentTopAdUrl(String draftContentTopAdUrl) {
            obj.setDraftContentTopAdUrl(draftContentTopAdUrl);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.product_id
         *
         * @param productId the value for tuanmei_deal_drafts.product_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder productId(Integer productId) {
            obj.setProductId(productId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.brand_id
         *
         * @param brandId the value for tuanmei_deal_drafts.brand_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder brandId(Integer brandId) {
            obj.setBrandId(brandId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.brand_label
         *
         * @param brandLabel the value for tuanmei_deal_drafts.brand_label
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder brandLabel(String brandLabel) {
            obj.setBrandLabel(brandLabel);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.redeem_lowest_total_price
         *
         * @param redeemLowestTotalPrice the value for tuanmei_deal_drafts.redeem_lowest_total_price
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder redeemLowestTotalPrice(BigDecimal redeemLowestTotalPrice) {
            obj.setRedeemLowestTotalPrice(redeemLowestTotalPrice);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.user_purchase_limit
         *
         * @param userPurchaseLimit the value for tuanmei_deal_drafts.user_purchase_limit
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder userPurchaseLimit(Integer userPurchaseLimit) {
            obj.setUserPurchaseLimit(userPurchaseLimit);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.second_kill_time
         *
         * @param secondKillTime the value for tuanmei_deal_drafts.second_kill_time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder secondKillTime(Integer secondKillTime) {
            obj.setSecondKillTime(secondKillTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.medium_name
         *
         * @param mediumName the value for tuanmei_deal_drafts.medium_name
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder mediumName(String mediumName) {
            obj.setMediumName(mediumName);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.is_b2c_deal
         *
         * @param isB2cDeal the value for tuanmei_deal_drafts.is_b2c_deal
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder isB2cDeal(Byte isB2cDeal) {
            obj.setIsB2cDeal(isB2cDeal);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.related_deal_group_name
         *
         * @param relatedDealGroupName the value for tuanmei_deal_drafts.related_deal_group_name
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder relatedDealGroupName(String relatedDealGroupName) {
            obj.setRelatedDealGroupName(relatedDealGroupName);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.editor_username
         *
         * @param editorUsername the value for tuanmei_deal_drafts.editor_username
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder editorUsername(String editorUsername) {
            obj.setEditorUsername(editorUsername);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.shipping_system_id
         *
         * @param shippingSystemId the value for tuanmei_deal_drafts.shipping_system_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder shippingSystemId(Integer shippingSystemId) {
            obj.setShippingSystemId(shippingSystemId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.shipping_system_type
         *
         * @param shippingSystemType the value for tuanmei_deal_drafts.shipping_system_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder shippingSystemType(String shippingSystemType) {
            obj.setShippingSystemType(shippingSystemType);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.special_deal_group_name
         *
         * @param specialDealGroupName the value for tuanmei_deal_drafts.special_deal_group_name
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder specialDealGroupName(String specialDealGroupName) {
            obj.setSpecialDealGroupName(specialDealGroupName);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.is_shown_in_home
         *
         * @param isShownInHome the value for tuanmei_deal_drafts.is_shown_in_home
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder isShownInHome(Boolean isShownInHome) {
            obj.setIsShownInHome(isShownInHome);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.update_editor
         *
         * @param updateEditor the value for tuanmei_deal_drafts.update_editor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder updateEditor(String updateEditor) {
            obj.setUpdateEditor(updateEditor);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.refund_policy
         *
         * @param refundPolicy the value for tuanmei_deal_drafts.refund_policy
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder refundPolicy(String refundPolicy) {
            obj.setRefundPolicy(refundPolicy);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.sale_type
         *
         * @param saleType the value for tuanmei_deal_drafts.sale_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder saleType(String saleType) {
            obj.setSaleType(saleType);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.need_sync
         *
         * @param needSync the value for tuanmei_deal_drafts.need_sync
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder needSync(Byte needSync) {
            obj.setNeedSync(needSync);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.ending_buyer_number
         *
         * @param endingBuyerNumber the value for tuanmei_deal_drafts.ending_buyer_number
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder endingBuyerNumber(Integer endingBuyerNumber) {
            obj.setEndingBuyerNumber(endingBuyerNumber);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.ad_copy
         *
         * @param adCopy the value for tuanmei_deal_drafts.ad_copy
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder adCopy(String adCopy) {
            obj.setAdCopy(adCopy);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.gold_member_price
         *
         * @param goldMemberPrice the value for tuanmei_deal_drafts.gold_member_price
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder goldMemberPrice(BigDecimal goldMemberPrice) {
            obj.setGoldMemberPrice(goldMemberPrice);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.platinum_member_price
         *
         * @param platinumMemberPrice the value for tuanmei_deal_drafts.platinum_member_price
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder platinumMemberPrice(BigDecimal platinumMemberPrice) {
            obj.setPlatinumMemberPrice(platinumMemberPrice);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.diamond_member_price
         *
         * @param diamondMemberPrice the value for tuanmei_deal_drafts.diamond_member_price
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder diamondMemberPrice(BigDecimal diamondMemberPrice) {
            obj.setDiamondMemberPrice(diamondMemberPrice);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.company
         *
         * @param company the value for tuanmei_deal_drafts.company
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder company(String company) {
            obj.setCompany(company);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.dx_tag
         *
         * @param dxTag the value for tuanmei_deal_drafts.dx_tag
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder dxTag(Boolean dxTag) {
            obj.setDxTag(dxTag);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.focus_title
         *
         * @param focusTitle the value for tuanmei_deal_drafts.focus_title
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder focusTitle(String focusTitle) {
            obj.setFocusTitle(focusTitle);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.focus_img_count
         *
         * @param focusImgCount the value for tuanmei_deal_drafts.focus_img_count
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder focusImgCount(String focusImgCount) {
            obj.setFocusImgCount(focusImgCount);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.focus_bg_color
         *
         * @param focusBgColor the value for tuanmei_deal_drafts.focus_bg_color
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder focusBgColor(String focusBgColor) {
            obj.setFocusBgColor(focusBgColor);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.platform
         *
         * @param platform the value for tuanmei_deal_drafts.platform
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder platform(String platform) {
            obj.setPlatform(platform);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.sale_short_name
         *
         * @param saleShortName the value for tuanmei_deal_drafts.sale_short_name
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder saleShortName(String saleShortName) {
            obj.setSaleShortName(saleShortName);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.max_discounted_price
         *
         * @param maxDiscountedPrice the value for tuanmei_deal_drafts.max_discounted_price
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder maxDiscountedPrice(BigDecimal maxDiscountedPrice) {
            obj.setMaxDiscountedPrice(maxDiscountedPrice);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.note
         *
         * @param note the value for tuanmei_deal_drafts.note
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder note(String note) {
            obj.setNote(note);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.description
         *
         * @param description the value for tuanmei_deal_drafts.description
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder description(String description) {
            obj.setDescription(description);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.description_usage
         *
         * @param descriptionUsage the value for tuanmei_deal_drafts.description_usage
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder descriptionUsage(String descriptionUsage) {
            obj.setDescriptionUsage(descriptionUsage);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.description_properties
         *
         * @param descriptionProperties the value for tuanmei_deal_drafts.description_properties
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder descriptionProperties(String descriptionProperties) {
            obj.setDescriptionProperties(descriptionProperties);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.description_images
         *
         * @param descriptionImages the value for tuanmei_deal_drafts.description_images
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder descriptionImages(String descriptionImages) {
            obj.setDescriptionImages(descriptionImages);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.meta_description
         *
         * @param metaDescription the value for tuanmei_deal_drafts.meta_description
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder metaDescription(String metaDescription) {
            obj.setMetaDescription(metaDescription);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.draft_guide_comments
         *
         * @param draftGuideComments the value for tuanmei_deal_drafts.draft_guide_comments
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder draftGuideComments(String draftGuideComments) {
            obj.setDraftGuideComments(draftGuideComments);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.draft_our_comments
         *
         * @param draftOurComments the value for tuanmei_deal_drafts.draft_our_comments
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder draftOurComments(String draftOurComments) {
            obj.setDraftOurComments(draftOurComments);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.draft_related_hash_ids
         *
         * @param draftRelatedHashIds the value for tuanmei_deal_drafts.draft_related_hash_ids
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder draftRelatedHashIds(String draftRelatedHashIds) {
            obj.setDraftRelatedHashIds(draftRelatedHashIds);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.draft_mobile_infos
         *
         * @param draftMobileInfos the value for tuanmei_deal_drafts.draft_mobile_infos
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder draftMobileInfos(String draftMobileInfos) {
            obj.setDraftMobileInfos(draftMobileInfos);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.order_promo_card_set
         *
         * @param orderPromoCardSet the value for tuanmei_deal_drafts.order_promo_card_set
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder orderPromoCardSet(String orderPromoCardSet) {
            obj.setOrderPromoCardSet(orderPromoCardSet);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.product_detail_images
         *
         * @param productDetailImages the value for tuanmei_deal_drafts.product_detail_images
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder productDetailImages(String productDetailImages) {
            obj.setProductDetailImages(productDetailImages);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deal_drafts.deal_product_properties
         *
         * @param dealProductProperties the value for tuanmei_deal_drafts.deal_product_properties
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder dealProductProperties(String dealProductProperties) {
            obj.setDealProductProperties(dealProductProperties);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table tuanmei_deal_drafts
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public tuanmei_deal_draftsWithBLOBs build() {
            return this.obj;
        }
    }
}