package model.tuanmei_operation.pojo;

import java.math.BigDecimal;

public class tuanmei_deal_drafts {
    private String hashId;

    private Integer dealId;

    private String name;

    private Double originalPrice;

    private Double discountedPrice;

    private String discount;

    private Integer buyerNumber;

    private Integer purchaseLowerLimit;

    private Integer purchaseUpperLimit;

    private Integer startTime;

    private Integer endTime;

    private Byte status;

    private Integer tippedTime;

    private Integer stocks;

    private String shortName;

    private String attributes;

    private Double deliveryFee;

    private String category;

    private String showCategory;

    private String dealGroupLabel;

    private String site;

    private Integer realBuyerNumber;

    private String skuNo;

    private String metaKeywords;

    private Integer draftCreateTime;

    private String draftCreateUsername;

    private Integer draftUpdateTime;

    private String draftUpdateUsername;

    private String draftContentTopAdImage;

    private String draftContentTopAdUrl;

    private Integer productId;

    private Integer brandId;

    private String brandLabel;

    private BigDecimal redeemLowestTotalPrice;

    private Integer userPurchaseLimit;

    private Integer secondKillTime;

    private String mediumName;

    private Byte isB2cDeal;

    private String relatedDealGroupName;

    private String editorUsername;

    private Integer shippingSystemId;

    private String shippingSystemType;

    private String specialDealGroupName;

    private Boolean isShownInHome;

    private String updateEditor;

    private String refundPolicy;

    private String saleType;

    private Byte needSync;

    private Integer endingBuyerNumber;

    private String adCopy;

    private BigDecimal goldMemberPrice;

    private BigDecimal platinumMemberPrice;

    private BigDecimal diamondMemberPrice;

    private String company;

    private Boolean dxTag;

    private String focusTitle;

    private String focusImgCount;

    private String focusBgColor;

    private String platform;

    private String saleShortName;

    private BigDecimal maxDiscountedPrice;

    public tuanmei_deal_drafts(String hashId, Integer dealId, String name, Double originalPrice, Double discountedPrice, String discount, Integer buyerNumber, Integer purchaseLowerLimit, Integer purchaseUpperLimit, Integer startTime, Integer endTime, Byte status, Integer tippedTime, Integer stocks, String shortName, String attributes, Double deliveryFee, String category, String showCategory, String dealGroupLabel, String site, Integer realBuyerNumber, String skuNo, String metaKeywords, Integer draftCreateTime, String draftCreateUsername, Integer draftUpdateTime, String draftUpdateUsername, String draftContentTopAdImage, String draftContentTopAdUrl, Integer productId, Integer brandId, String brandLabel, BigDecimal redeemLowestTotalPrice, Integer userPurchaseLimit, Integer secondKillTime, String mediumName, Byte isB2cDeal, String relatedDealGroupName, String editorUsername, Integer shippingSystemId, String shippingSystemType, String specialDealGroupName, Boolean isShownInHome, String updateEditor, String refundPolicy, String saleType, Byte needSync, Integer endingBuyerNumber, String adCopy, BigDecimal goldMemberPrice, BigDecimal platinumMemberPrice, BigDecimal diamondMemberPrice, String company, Boolean dxTag, String focusTitle, String focusImgCount, String focusBgColor, String platform, String saleShortName, BigDecimal maxDiscountedPrice) {
        this.hashId = hashId;
        this.dealId = dealId;
        this.name = name;
        this.originalPrice = originalPrice;
        this.discountedPrice = discountedPrice;
        this.discount = discount;
        this.buyerNumber = buyerNumber;
        this.purchaseLowerLimit = purchaseLowerLimit;
        this.purchaseUpperLimit = purchaseUpperLimit;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.tippedTime = tippedTime;
        this.stocks = stocks;
        this.shortName = shortName;
        this.attributes = attributes;
        this.deliveryFee = deliveryFee;
        this.category = category;
        this.showCategory = showCategory;
        this.dealGroupLabel = dealGroupLabel;
        this.site = site;
        this.realBuyerNumber = realBuyerNumber;
        this.skuNo = skuNo;
        this.metaKeywords = metaKeywords;
        this.draftCreateTime = draftCreateTime;
        this.draftCreateUsername = draftCreateUsername;
        this.draftUpdateTime = draftUpdateTime;
        this.draftUpdateUsername = draftUpdateUsername;
        this.draftContentTopAdImage = draftContentTopAdImage;
        this.draftContentTopAdUrl = draftContentTopAdUrl;
        this.productId = productId;
        this.brandId = brandId;
        this.brandLabel = brandLabel;
        this.redeemLowestTotalPrice = redeemLowestTotalPrice;
        this.userPurchaseLimit = userPurchaseLimit;
        this.secondKillTime = secondKillTime;
        this.mediumName = mediumName;
        this.isB2cDeal = isB2cDeal;
        this.relatedDealGroupName = relatedDealGroupName;
        this.editorUsername = editorUsername;
        this.shippingSystemId = shippingSystemId;
        this.shippingSystemType = shippingSystemType;
        this.specialDealGroupName = specialDealGroupName;
        this.isShownInHome = isShownInHome;
        this.updateEditor = updateEditor;
        this.refundPolicy = refundPolicy;
        this.saleType = saleType;
        this.needSync = needSync;
        this.endingBuyerNumber = endingBuyerNumber;
        this.adCopy = adCopy;
        this.goldMemberPrice = goldMemberPrice;
        this.platinumMemberPrice = platinumMemberPrice;
        this.diamondMemberPrice = diamondMemberPrice;
        this.company = company;
        this.dxTag = dxTag;
        this.focusTitle = focusTitle;
        this.focusImgCount = focusImgCount;
        this.focusBgColor = focusBgColor;
        this.platform = platform;
        this.saleShortName = saleShortName;
        this.maxDiscountedPrice = maxDiscountedPrice;
    }

    public tuanmei_deal_drafts() {
        super();
    }

    public String getHashId() {
        return hashId;
    }

    public void setHashId(String hashId) {
        this.hashId = hashId == null ? null : hashId.trim();
    }

    public Integer getDealId() {
        return dealId;
    }

    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(Double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }

    public Integer getBuyerNumber() {
        return buyerNumber;
    }

    public void setBuyerNumber(Integer buyerNumber) {
        this.buyerNumber = buyerNumber;
    }

    public Integer getPurchaseLowerLimit() {
        return purchaseLowerLimit;
    }

    public void setPurchaseLowerLimit(Integer purchaseLowerLimit) {
        this.purchaseLowerLimit = purchaseLowerLimit;
    }

    public Integer getPurchaseUpperLimit() {
        return purchaseUpperLimit;
    }

    public void setPurchaseUpperLimit(Integer purchaseUpperLimit) {
        this.purchaseUpperLimit = purchaseUpperLimit;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getTippedTime() {
        return tippedTime;
    }

    public void setTippedTime(Integer tippedTime) {
        this.tippedTime = tippedTime;
    }

    public Integer getStocks() {
        return stocks;
    }

    public void setStocks(Integer stocks) {
        this.stocks = stocks;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes == null ? null : attributes.trim();
    }

    public Double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(Double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getShowCategory() {
        return showCategory;
    }

    public void setShowCategory(String showCategory) {
        this.showCategory = showCategory == null ? null : showCategory.trim();
    }

    public String getDealGroupLabel() {
        return dealGroupLabel;
    }

    public void setDealGroupLabel(String dealGroupLabel) {
        this.dealGroupLabel = dealGroupLabel == null ? null : dealGroupLabel.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public Integer getRealBuyerNumber() {
        return realBuyerNumber;
    }

    public void setRealBuyerNumber(Integer realBuyerNumber) {
        this.realBuyerNumber = realBuyerNumber;
    }

    public String getSkuNo() {
        return skuNo;
    }

    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo == null ? null : skuNo.trim();
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords == null ? null : metaKeywords.trim();
    }

    public Integer getDraftCreateTime() {
        return draftCreateTime;
    }

    public void setDraftCreateTime(Integer draftCreateTime) {
        this.draftCreateTime = draftCreateTime;
    }

    public String getDraftCreateUsername() {
        return draftCreateUsername;
    }

    public void setDraftCreateUsername(String draftCreateUsername) {
        this.draftCreateUsername = draftCreateUsername == null ? null : draftCreateUsername.trim();
    }

    public Integer getDraftUpdateTime() {
        return draftUpdateTime;
    }

    public void setDraftUpdateTime(Integer draftUpdateTime) {
        this.draftUpdateTime = draftUpdateTime;
    }

    public String getDraftUpdateUsername() {
        return draftUpdateUsername;
    }

    public void setDraftUpdateUsername(String draftUpdateUsername) {
        this.draftUpdateUsername = draftUpdateUsername == null ? null : draftUpdateUsername.trim();
    }

    public String getDraftContentTopAdImage() {
        return draftContentTopAdImage;
    }

    public void setDraftContentTopAdImage(String draftContentTopAdImage) {
        this.draftContentTopAdImage = draftContentTopAdImage == null ? null : draftContentTopAdImage.trim();
    }

    public String getDraftContentTopAdUrl() {
        return draftContentTopAdUrl;
    }

    public void setDraftContentTopAdUrl(String draftContentTopAdUrl) {
        this.draftContentTopAdUrl = draftContentTopAdUrl == null ? null : draftContentTopAdUrl.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandLabel() {
        return brandLabel;
    }

    public void setBrandLabel(String brandLabel) {
        this.brandLabel = brandLabel == null ? null : brandLabel.trim();
    }

    public BigDecimal getRedeemLowestTotalPrice() {
        return redeemLowestTotalPrice;
    }

    public void setRedeemLowestTotalPrice(BigDecimal redeemLowestTotalPrice) {
        this.redeemLowestTotalPrice = redeemLowestTotalPrice;
    }

    public Integer getUserPurchaseLimit() {
        return userPurchaseLimit;
    }

    public void setUserPurchaseLimit(Integer userPurchaseLimit) {
        this.userPurchaseLimit = userPurchaseLimit;
    }

    public Integer getSecondKillTime() {
        return secondKillTime;
    }

    public void setSecondKillTime(Integer secondKillTime) {
        this.secondKillTime = secondKillTime;
    }

    public String getMediumName() {
        return mediumName;
    }

    public void setMediumName(String mediumName) {
        this.mediumName = mediumName == null ? null : mediumName.trim();
    }

    public Byte getIsB2cDeal() {
        return isB2cDeal;
    }

    public void setIsB2cDeal(Byte isB2cDeal) {
        this.isB2cDeal = isB2cDeal;
    }

    public String getRelatedDealGroupName() {
        return relatedDealGroupName;
    }

    public void setRelatedDealGroupName(String relatedDealGroupName) {
        this.relatedDealGroupName = relatedDealGroupName == null ? null : relatedDealGroupName.trim();
    }

    public String getEditorUsername() {
        return editorUsername;
    }

    public void setEditorUsername(String editorUsername) {
        this.editorUsername = editorUsername == null ? null : editorUsername.trim();
    }

    public Integer getShippingSystemId() {
        return shippingSystemId;
    }

    public void setShippingSystemId(Integer shippingSystemId) {
        this.shippingSystemId = shippingSystemId;
    }

    public String getShippingSystemType() {
        return shippingSystemType;
    }

    public void setShippingSystemType(String shippingSystemType) {
        this.shippingSystemType = shippingSystemType == null ? null : shippingSystemType.trim();
    }

    public String getSpecialDealGroupName() {
        return specialDealGroupName;
    }

    public void setSpecialDealGroupName(String specialDealGroupName) {
        this.specialDealGroupName = specialDealGroupName == null ? null : specialDealGroupName.trim();
    }

    public Boolean getIsShownInHome() {
        return isShownInHome;
    }

    public void setIsShownInHome(Boolean isShownInHome) {
        this.isShownInHome = isShownInHome;
    }

    public String getUpdateEditor() {
        return updateEditor;
    }

    public void setUpdateEditor(String updateEditor) {
        this.updateEditor = updateEditor == null ? null : updateEditor.trim();
    }

    public String getRefundPolicy() {
        return refundPolicy;
    }

    public void setRefundPolicy(String refundPolicy) {
        this.refundPolicy = refundPolicy == null ? null : refundPolicy.trim();
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType == null ? null : saleType.trim();
    }

    public Byte getNeedSync() {
        return needSync;
    }

    public void setNeedSync(Byte needSync) {
        this.needSync = needSync;
    }

    public Integer getEndingBuyerNumber() {
        return endingBuyerNumber;
    }

    public void setEndingBuyerNumber(Integer endingBuyerNumber) {
        this.endingBuyerNumber = endingBuyerNumber;
    }

    public String getAdCopy() {
        return adCopy;
    }

    public void setAdCopy(String adCopy) {
        this.adCopy = adCopy == null ? null : adCopy.trim();
    }

    public BigDecimal getGoldMemberPrice() {
        return goldMemberPrice;
    }

    public void setGoldMemberPrice(BigDecimal goldMemberPrice) {
        this.goldMemberPrice = goldMemberPrice;
    }

    public BigDecimal getPlatinumMemberPrice() {
        return platinumMemberPrice;
    }

    public void setPlatinumMemberPrice(BigDecimal platinumMemberPrice) {
        this.platinumMemberPrice = platinumMemberPrice;
    }

    public BigDecimal getDiamondMemberPrice() {
        return diamondMemberPrice;
    }

    public void setDiamondMemberPrice(BigDecimal diamondMemberPrice) {
        this.diamondMemberPrice = diamondMemberPrice;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public Boolean getDxTag() {
        return dxTag;
    }

    public void setDxTag(Boolean dxTag) {
        this.dxTag = dxTag;
    }

    public String getFocusTitle() {
        return focusTitle;
    }

    public void setFocusTitle(String focusTitle) {
        this.focusTitle = focusTitle == null ? null : focusTitle.trim();
    }

    public String getFocusImgCount() {
        return focusImgCount;
    }

    public void setFocusImgCount(String focusImgCount) {
        this.focusImgCount = focusImgCount == null ? null : focusImgCount.trim();
    }

    public String getFocusBgColor() {
        return focusBgColor;
    }

    public void setFocusBgColor(String focusBgColor) {
        this.focusBgColor = focusBgColor == null ? null : focusBgColor.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getSaleShortName() {
        return saleShortName;
    }

    public void setSaleShortName(String saleShortName) {
        this.saleShortName = saleShortName == null ? null : saleShortName.trim();
    }

    public BigDecimal getMaxDiscountedPrice() {
        return maxDiscountedPrice;
    }

    public void setMaxDiscountedPrice(BigDecimal maxDiscountedPrice) {
        this.maxDiscountedPrice = maxDiscountedPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuanmei_deal_drafts
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static tuanmei_deal_drafts.Builder builder() {
        return new tuanmei_deal_drafts.Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tuanmei_deal_drafts
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table tuanmei_deal_drafts
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private tuanmei_deal_drafts obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table tuanmei_deal_drafts
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder() {
            this.obj = new tuanmei_deal_drafts();
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
         * This method corresponds to the database table tuanmei_deal_drafts
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public tuanmei_deal_drafts build() {
            return this.obj;
        }
    }
}