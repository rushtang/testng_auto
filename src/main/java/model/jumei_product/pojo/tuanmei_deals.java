package model.jumei_product.pojo;

import java.math.BigDecimal;

public class tuanmei_deals {
    private Integer dealId;

    private Double originalPrice;

    private Double discountedPrice;

    private String discount;

    private Integer buyerNumber;

    private Integer purchaseLowerLimit;

    private Integer purchaseUpperLimit;

    private Integer startTime;

    private Integer endTime;

    private String hashId;

    private Byte status;

    private Integer tippedTime;

    private Integer stocks;

    private String shortName;

    private Double deliveryFee;

    private String category;

    private String showCategory;

    private String site;

    private Integer realBuyerNumber;

    private String skuNo;

    private Integer productId;

    private Integer brandId;

    private BigDecimal redeemLowestTotalPrice;

    private Integer userPurchaseLimit;

    private Integer secondKillTime;

    private String mediumName;

    private Byte isB2cDeal;

    private String editorUsername;

    private Integer shippingSystemId;

    private String shippingSystemType;

    private Boolean isShownInHome;

    private String refundPolicy;

    private String saleType;

    private Integer priority;

    private Byte needSync;

    private Integer endingBuyerNumber;

    private Integer dealSort;

    private String showTag;

    private BigDecimal goldMemberPrice;

    private BigDecimal platinumMemberPrice;

    private BigDecimal diamondMemberPrice;

    private Boolean dxTag;

    private Byte focusPosition;

    private String platform;

    private Integer firstSaleTime;

    private BigDecimal maxDiscountedPrice;

    public tuanmei_deals(Integer dealId, Double originalPrice, Double discountedPrice, String discount, Integer buyerNumber, Integer purchaseLowerLimit, Integer purchaseUpperLimit, Integer startTime, Integer endTime, String hashId, Byte status, Integer tippedTime, Integer stocks, String shortName, Double deliveryFee, String category, String showCategory, String site, Integer realBuyerNumber, String skuNo, Integer productId, Integer brandId, BigDecimal redeemLowestTotalPrice, Integer userPurchaseLimit, Integer secondKillTime, String mediumName, Byte isB2cDeal, String editorUsername, Integer shippingSystemId, String shippingSystemType, Boolean isShownInHome, String refundPolicy, String saleType, Integer priority, Byte needSync, Integer endingBuyerNumber, Integer dealSort, String showTag, BigDecimal goldMemberPrice, BigDecimal platinumMemberPrice, BigDecimal diamondMemberPrice, Boolean dxTag, Byte focusPosition, String platform, Integer firstSaleTime, BigDecimal maxDiscountedPrice) {
        this.dealId = dealId;
        this.originalPrice = originalPrice;
        this.discountedPrice = discountedPrice;
        this.discount = discount;
        this.buyerNumber = buyerNumber;
        this.purchaseLowerLimit = purchaseLowerLimit;
        this.purchaseUpperLimit = purchaseUpperLimit;
        this.startTime = startTime;
        this.endTime = endTime;
        this.hashId = hashId;
        this.status = status;
        this.tippedTime = tippedTime;
        this.stocks = stocks;
        this.shortName = shortName;
        this.deliveryFee = deliveryFee;
        this.category = category;
        this.showCategory = showCategory;
        this.site = site;
        this.realBuyerNumber = realBuyerNumber;
        this.skuNo = skuNo;
        this.productId = productId;
        this.brandId = brandId;
        this.redeemLowestTotalPrice = redeemLowestTotalPrice;
        this.userPurchaseLimit = userPurchaseLimit;
        this.secondKillTime = secondKillTime;
        this.mediumName = mediumName;
        this.isB2cDeal = isB2cDeal;
        this.editorUsername = editorUsername;
        this.shippingSystemId = shippingSystemId;
        this.shippingSystemType = shippingSystemType;
        this.isShownInHome = isShownInHome;
        this.refundPolicy = refundPolicy;
        this.saleType = saleType;
        this.priority = priority;
        this.needSync = needSync;
        this.endingBuyerNumber = endingBuyerNumber;
        this.dealSort = dealSort;
        this.showTag = showTag;
        this.goldMemberPrice = goldMemberPrice;
        this.platinumMemberPrice = platinumMemberPrice;
        this.diamondMemberPrice = diamondMemberPrice;
        this.dxTag = dxTag;
        this.focusPosition = focusPosition;
        this.platform = platform;
        this.firstSaleTime = firstSaleTime;
        this.maxDiscountedPrice = maxDiscountedPrice;
    }

    public tuanmei_deals() {
        super();
    }

    public Integer getDealId() {
        return dealId;
    }

    public void setDealId(Integer dealId) {
        this.dealId = dealId;
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

    public String getHashId() {
        return hashId;
    }

    public void setHashId(String hashId) {
        this.hashId = hashId == null ? null : hashId.trim();
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

    public Boolean getIsShownInHome() {
        return isShownInHome;
    }

    public void setIsShownInHome(Boolean isShownInHome) {
        this.isShownInHome = isShownInHome;
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

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
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

    public Integer getDealSort() {
        return dealSort;
    }

    public void setDealSort(Integer dealSort) {
        this.dealSort = dealSort;
    }

    public String getShowTag() {
        return showTag;
    }

    public void setShowTag(String showTag) {
        this.showTag = showTag == null ? null : showTag.trim();
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

    public Boolean getDxTag() {
        return dxTag;
    }

    public void setDxTag(Boolean dxTag) {
        this.dxTag = dxTag;
    }

    public Byte getFocusPosition() {
        return focusPosition;
    }

    public void setFocusPosition(Byte focusPosition) {
        this.focusPosition = focusPosition;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public Integer getFirstSaleTime() {
        return firstSaleTime;
    }

    public void setFirstSaleTime(Integer firstSaleTime) {
        this.firstSaleTime = firstSaleTime;
    }

    public BigDecimal getMaxDiscountedPrice() {
        return maxDiscountedPrice;
    }

    public void setMaxDiscountedPrice(BigDecimal maxDiscountedPrice) {
        this.maxDiscountedPrice = maxDiscountedPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuanmei_deals
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static tuanmei_deals.Builder builder() {
        return new tuanmei_deals.Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tuanmei_deals
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table tuanmei_deals
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private tuanmei_deals obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table tuanmei_deals
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder() {
            this.obj = new tuanmei_deals();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deals.deal_id
         *
         * @param dealId the value for tuanmei_deals.deal_id
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
         * This method sets the value of the database column tuanmei_deals.original_price
         *
         * @param originalPrice the value for tuanmei_deals.original_price
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
         * This method sets the value of the database column tuanmei_deals.discount
         *
         * @param discount the value for tuanmei_deals.discount
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
         * This method sets the value of the database column tuanmei_deals.discounted_price
         *
         * @param discountedPrice the value for tuanmei_deals.discounted_price
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
         * This method sets the value of the database column tuanmei_deals.buyer_number
         *
         * @param buyerNumber the value for tuanmei_deals.buyer_number
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
         * This method sets the value of the database column tuanmei_deals.purchase_lower_limit
         *
         * @param purchaseLowerLimit the value for tuanmei_deals.purchase_lower_limit
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
         * This method sets the value of the database column tuanmei_deals.purchase_upper_limit
         *
         * @param purchaseUpperLimit the value for tuanmei_deals.purchase_upper_limit
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
         * This method sets the value of the database column tuanmei_deals.start_time
         *
         * @param startTime the value for tuanmei_deals.start_time
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
         * This method sets the value of the database column tuanmei_deals.end_time
         *
         * @param endTime the value for tuanmei_deals.end_time
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
         * This method sets the value of the database column tuanmei_deals.hash_id
         *
         * @param hashId the value for tuanmei_deals.hash_id
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
         * This method sets the value of the database column tuanmei_deals.status
         *
         * @param status the value for tuanmei_deals.status
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
         * This method sets the value of the database column tuanmei_deals.tipped_time
         *
         * @param tippedTime the value for tuanmei_deals.tipped_time
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
         * This method sets the value of the database column tuanmei_deals.stocks
         *
         * @param stocks the value for tuanmei_deals.stocks
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
         * This method sets the value of the database column tuanmei_deals.short_name
         *
         * @param shortName the value for tuanmei_deals.short_name
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
         * This method sets the value of the database column tuanmei_deals.delivery_fee
         *
         * @param deliveryFee the value for tuanmei_deals.delivery_fee
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
         * This method sets the value of the database column tuanmei_deals.category
         *
         * @param category the value for tuanmei_deals.category
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
         * This method sets the value of the database column tuanmei_deals.show_category
         *
         * @param showCategory the value for tuanmei_deals.show_category
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
         * This method sets the value of the database column tuanmei_deals.site
         *
         * @param site the value for tuanmei_deals.site
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
         * This method sets the value of the database column tuanmei_deals.real_buyer_number
         *
         * @param realBuyerNumber the value for tuanmei_deals.real_buyer_number
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
         * This method sets the value of the database column tuanmei_deals.sku_no
         *
         * @param skuNo the value for tuanmei_deals.sku_no
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
         * This method sets the value of the database column tuanmei_deals.product_id
         *
         * @param productId the value for tuanmei_deals.product_id
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
         * This method sets the value of the database column tuanmei_deals.brand_id
         *
         * @param brandId the value for tuanmei_deals.brand_id
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
         * This method sets the value of the database column tuanmei_deals.redeem_lowest_total_price
         *
         * @param redeemLowestTotalPrice the value for tuanmei_deals.redeem_lowest_total_price
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
         * This method sets the value of the database column tuanmei_deals.user_purchase_limit
         *
         * @param userPurchaseLimit the value for tuanmei_deals.user_purchase_limit
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
         * This method sets the value of the database column tuanmei_deals.second_kill_time
         *
         * @param secondKillTime the value for tuanmei_deals.second_kill_time
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
         * This method sets the value of the database column tuanmei_deals.medium_name
         *
         * @param mediumName the value for tuanmei_deals.medium_name
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
         * This method sets the value of the database column tuanmei_deals.is_b2c_deal
         *
         * @param isB2cDeal the value for tuanmei_deals.is_b2c_deal
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
         * This method sets the value of the database column tuanmei_deals.editor_username
         *
         * @param editorUsername the value for tuanmei_deals.editor_username
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
         * This method sets the value of the database column tuanmei_deals.shipping_system_id
         *
         * @param shippingSystemId the value for tuanmei_deals.shipping_system_id
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
         * This method sets the value of the database column tuanmei_deals.shipping_system_type
         *
         * @param shippingSystemType the value for tuanmei_deals.shipping_system_type
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
         * This method sets the value of the database column tuanmei_deals.is_shown_in_home
         *
         * @param isShownInHome the value for tuanmei_deals.is_shown_in_home
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
         * This method sets the value of the database column tuanmei_deals.refund_policy
         *
         * @param refundPolicy the value for tuanmei_deals.refund_policy
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
         * This method sets the value of the database column tuanmei_deals.sale_type
         *
         * @param saleType the value for tuanmei_deals.sale_type
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
         * This method sets the value of the database column tuanmei_deals.priority
         *
         * @param priority the value for tuanmei_deals.priority
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder priority(Integer priority) {
            obj.setPriority(priority);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deals.need_sync
         *
         * @param needSync the value for tuanmei_deals.need_sync
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
         * This method sets the value of the database column tuanmei_deals.ending_buyer_number
         *
         * @param endingBuyerNumber the value for tuanmei_deals.ending_buyer_number
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
         * This method sets the value of the database column tuanmei_deals.deal_sort
         *
         * @param dealSort the value for tuanmei_deals.deal_sort
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder dealSort(Integer dealSort) {
            obj.setDealSort(dealSort);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deals.show_tag
         *
         * @param showTag the value for tuanmei_deals.show_tag
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder showTag(String showTag) {
            obj.setShowTag(showTag);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deals.gold_member_price
         *
         * @param goldMemberPrice the value for tuanmei_deals.gold_member_price
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
         * This method sets the value of the database column tuanmei_deals.platinum_member_price
         *
         * @param platinumMemberPrice the value for tuanmei_deals.platinum_member_price
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
         * This method sets the value of the database column tuanmei_deals.diamond_member_price
         *
         * @param diamondMemberPrice the value for tuanmei_deals.diamond_member_price
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
         * This method sets the value of the database column tuanmei_deals.dx_tag
         *
         * @param dxTag the value for tuanmei_deals.dx_tag
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
         * This method sets the value of the database column tuanmei_deals.focus_position
         *
         * @param focusPosition the value for tuanmei_deals.focus_position
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder focusPosition(Byte focusPosition) {
            obj.setFocusPosition(focusPosition);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deals.platform
         *
         * @param platform the value for tuanmei_deals.platform
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
         * This method sets the value of the database column tuanmei_deals.first_sale_time
         *
         * @param firstSaleTime the value for tuanmei_deals.first_sale_time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder firstSaleTime(Integer firstSaleTime) {
            obj.setFirstSaleTime(firstSaleTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_deals.max_discounted_price
         *
         * @param maxDiscountedPrice the value for tuanmei_deals.max_discounted_price
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
         * This method corresponds to the database table tuanmei_deals
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public tuanmei_deals build() {
            return this.obj;
        }
    }
}