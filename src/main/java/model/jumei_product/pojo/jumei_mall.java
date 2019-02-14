package model.jumei_product.pojo;

import java.math.BigDecimal;

public class jumei_mall {
    private Integer mallId;

    private Integer productId;

    private Integer saleTypeId;

    private Integer shippingSystemId;

    private Boolean status;

    private BigDecimal skuMinPrice;

    private BigDecimal skuMaxPrice;

    private BigDecimal minDiscount;

    private BigDecimal skuMaxMarketPrice;

    private String productShortName;

    private String productMediumName;

    private String productLongName;

    private Integer updateTime;

    private String updateUser;

    private Integer firstOnlineTime;

    private Integer fake30dayBuyerNumber;

    private Integer real30dayBuyerNumber;

    private BigDecimal singlePackagePrice;

    private Integer real7dayBuyerNumber;

    private BigDecimal i_7day_sales;

    private BigDecimal i_30day_sales;

    private String category;

    private Integer merchantId;

    private BigDecimal minTax;

    private BigDecimal minValueOfGoods;

    private Integer firstSaleTime;

    private Boolean mallSaleMode;

    private Boolean stockSellable;

    public jumei_mall(Integer mallId, Integer productId, Integer saleTypeId, Integer shippingSystemId, Boolean status, BigDecimal skuMinPrice, BigDecimal skuMaxPrice, BigDecimal minDiscount, BigDecimal skuMaxMarketPrice, String productShortName, String productMediumName, String productLongName, Integer updateTime, String updateUser, Integer firstOnlineTime, Integer fake30dayBuyerNumber, Integer real30dayBuyerNumber, BigDecimal singlePackagePrice, Integer real7dayBuyerNumber, BigDecimal i_7day_sales, BigDecimal i_30day_sales, String category, Integer merchantId, BigDecimal minTax, BigDecimal minValueOfGoods, Integer firstSaleTime, Boolean mallSaleMode, Boolean stockSellable) {
        this.mallId = mallId;
        this.productId = productId;
        this.saleTypeId = saleTypeId;
        this.shippingSystemId = shippingSystemId;
        this.status = status;
        this.skuMinPrice = skuMinPrice;
        this.skuMaxPrice = skuMaxPrice;
        this.minDiscount = minDiscount;
        this.skuMaxMarketPrice = skuMaxMarketPrice;
        this.productShortName = productShortName;
        this.productMediumName = productMediumName;
        this.productLongName = productLongName;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
        this.firstOnlineTime = firstOnlineTime;
        this.fake30dayBuyerNumber = fake30dayBuyerNumber;
        this.real30dayBuyerNumber = real30dayBuyerNumber;
        this.singlePackagePrice = singlePackagePrice;
        this.real7dayBuyerNumber = real7dayBuyerNumber;
        this.i_7day_sales = i_7day_sales;
        this.i_30day_sales = i_30day_sales;
        this.category = category;
        this.merchantId = merchantId;
        this.minTax = minTax;
        this.minValueOfGoods = minValueOfGoods;
        this.firstSaleTime = firstSaleTime;
        this.mallSaleMode = mallSaleMode;
        this.stockSellable = stockSellable;
    }

    public jumei_mall() {
        super();
    }

    public Integer getMallId() {
        return mallId;
    }

    public void setMallId(Integer mallId) {
        this.mallId = mallId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSaleTypeId() {
        return saleTypeId;
    }

    public void setSaleTypeId(Integer saleTypeId) {
        this.saleTypeId = saleTypeId;
    }

    public Integer getShippingSystemId() {
        return shippingSystemId;
    }

    public void setShippingSystemId(Integer shippingSystemId) {
        this.shippingSystemId = shippingSystemId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public BigDecimal getSkuMinPrice() {
        return skuMinPrice;
    }

    public void setSkuMinPrice(BigDecimal skuMinPrice) {
        this.skuMinPrice = skuMinPrice;
    }

    public BigDecimal getSkuMaxPrice() {
        return skuMaxPrice;
    }

    public void setSkuMaxPrice(BigDecimal skuMaxPrice) {
        this.skuMaxPrice = skuMaxPrice;
    }

    public BigDecimal getMinDiscount() {
        return minDiscount;
    }

    public void setMinDiscount(BigDecimal minDiscount) {
        this.minDiscount = minDiscount;
    }

    public BigDecimal getSkuMaxMarketPrice() {
        return skuMaxMarketPrice;
    }

    public void setSkuMaxMarketPrice(BigDecimal skuMaxMarketPrice) {
        this.skuMaxMarketPrice = skuMaxMarketPrice;
    }

    public String getProductShortName() {
        return productShortName;
    }

    public void setProductShortName(String productShortName) {
        this.productShortName = productShortName == null ? null : productShortName.trim();
    }

    public String getProductMediumName() {
        return productMediumName;
    }

    public void setProductMediumName(String productMediumName) {
        this.productMediumName = productMediumName == null ? null : productMediumName.trim();
    }

    public String getProductLongName() {
        return productLongName;
    }

    public void setProductLongName(String productLongName) {
        this.productLongName = productLongName == null ? null : productLongName.trim();
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Integer getFirstOnlineTime() {
        return firstOnlineTime;
    }

    public void setFirstOnlineTime(Integer firstOnlineTime) {
        this.firstOnlineTime = firstOnlineTime;
    }

    public Integer getFake30dayBuyerNumber() {
        return fake30dayBuyerNumber;
    }

    public void setFake30dayBuyerNumber(Integer fake30dayBuyerNumber) {
        this.fake30dayBuyerNumber = fake30dayBuyerNumber;
    }

    public Integer getReal30dayBuyerNumber() {
        return real30dayBuyerNumber;
    }

    public void setReal30dayBuyerNumber(Integer real30dayBuyerNumber) {
        this.real30dayBuyerNumber = real30dayBuyerNumber;
    }

    public BigDecimal getSinglePackagePrice() {
        return singlePackagePrice;
    }

    public void setSinglePackagePrice(BigDecimal singlePackagePrice) {
        this.singlePackagePrice = singlePackagePrice;
    }

    public Integer getReal7dayBuyerNumber() {
        return real7dayBuyerNumber;
    }

    public void setReal7dayBuyerNumber(Integer real7dayBuyerNumber) {
        this.real7dayBuyerNumber = real7dayBuyerNumber;
    }

    public BigDecimal getI_7day_sales() {
        return i_7day_sales;
    }

    public void setI_7day_sales(BigDecimal i_7day_sales) {
        this.i_7day_sales = i_7day_sales;
    }

    public BigDecimal getI_30day_sales() {
        return i_30day_sales;
    }

    public void setI_30day_sales(BigDecimal i_30day_sales) {
        this.i_30day_sales = i_30day_sales;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public BigDecimal getMinTax() {
        return minTax;
    }

    public void setMinTax(BigDecimal minTax) {
        this.minTax = minTax;
    }

    public BigDecimal getMinValueOfGoods() {
        return minValueOfGoods;
    }

    public void setMinValueOfGoods(BigDecimal minValueOfGoods) {
        this.minValueOfGoods = minValueOfGoods;
    }

    public Integer getFirstSaleTime() {
        return firstSaleTime;
    }

    public void setFirstSaleTime(Integer firstSaleTime) {
        this.firstSaleTime = firstSaleTime;
    }

    public Boolean getMallSaleMode() {
        return mallSaleMode;
    }

    public void setMallSaleMode(Boolean mallSaleMode) {
        this.mallSaleMode = mallSaleMode;
    }

    public Boolean getStockSellable() {
        return stockSellable;
    }

    public void setStockSellable(Boolean stockSellable) {
        this.stockSellable = stockSellable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jumei_mall
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static jumei_mall.Builder builder() {
        return new jumei_mall.Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jumei_mall
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table jumei_mall
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private jumei_mall obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jumei_mall
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder() {
            this.obj = new jumei_mall();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.mall_id
         *
         * @param mallId the value for jumei_mall.mall_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder mallId(Integer mallId) {
            obj.setMallId(mallId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.product_id
         *
         * @param productId the value for jumei_mall.product_id
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
         * This method sets the value of the database column jumei_mall.sale_type_id
         *
         * @param saleTypeId the value for jumei_mall.sale_type_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder saleTypeId(Integer saleTypeId) {
            obj.setSaleTypeId(saleTypeId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.shipping_system_id
         *
         * @param shippingSystemId the value for jumei_mall.shipping_system_id
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
         * This method sets the value of the database column jumei_mall.status
         *
         * @param status the value for jumei_mall.status
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder status(Boolean status) {
            obj.setStatus(status);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.sku_min_price
         *
         * @param skuMinPrice the value for jumei_mall.sku_min_price
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder skuMinPrice(BigDecimal skuMinPrice) {
            obj.setSkuMinPrice(skuMinPrice);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.sku_max_price
         *
         * @param skuMaxPrice the value for jumei_mall.sku_max_price
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder skuMaxPrice(BigDecimal skuMaxPrice) {
            obj.setSkuMaxPrice(skuMaxPrice);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.min_discount
         *
         * @param minDiscount the value for jumei_mall.min_discount
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder minDiscount(BigDecimal minDiscount) {
            obj.setMinDiscount(minDiscount);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.sku_max_market_price
         *
         * @param skuMaxMarketPrice the value for jumei_mall.sku_max_market_price
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder skuMaxMarketPrice(BigDecimal skuMaxMarketPrice) {
            obj.setSkuMaxMarketPrice(skuMaxMarketPrice);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.product_short_name
         *
         * @param productShortName the value for jumei_mall.product_short_name
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder productShortName(String productShortName) {
            obj.setProductShortName(productShortName);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.product_medium_name
         *
         * @param productMediumName the value for jumei_mall.product_medium_name
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder productMediumName(String productMediumName) {
            obj.setProductMediumName(productMediumName);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.product_long_name
         *
         * @param productLongName the value for jumei_mall.product_long_name
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder productLongName(String productLongName) {
            obj.setProductLongName(productLongName);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.update_time
         *
         * @param updateTime the value for jumei_mall.update_time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder updateTime(Integer updateTime) {
            obj.setUpdateTime(updateTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.update_user
         *
         * @param updateUser the value for jumei_mall.update_user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder updateUser(String updateUser) {
            obj.setUpdateUser(updateUser);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.first_online_time
         *
         * @param firstOnlineTime the value for jumei_mall.first_online_time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder firstOnlineTime(Integer firstOnlineTime) {
            obj.setFirstOnlineTime(firstOnlineTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.fake_30day_buyer_number
         *
         * @param fake30dayBuyerNumber the value for jumei_mall.fake_30day_buyer_number
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder fake30dayBuyerNumber(Integer fake30dayBuyerNumber) {
            obj.setFake30dayBuyerNumber(fake30dayBuyerNumber);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.real_30day_buyer_number
         *
         * @param real30dayBuyerNumber the value for jumei_mall.real_30day_buyer_number
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder real30dayBuyerNumber(Integer real30dayBuyerNumber) {
            obj.setReal30dayBuyerNumber(real30dayBuyerNumber);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.single_package_price
         *
         * @param singlePackagePrice the value for jumei_mall.single_package_price
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder singlePackagePrice(BigDecimal singlePackagePrice) {
            obj.setSinglePackagePrice(singlePackagePrice);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.real_7day_buyer_number
         *
         * @param real7dayBuyerNumber the value for jumei_mall.real_7day_buyer_number
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder real7dayBuyerNumber(Integer real7dayBuyerNumber) {
            obj.setReal7dayBuyerNumber(real7dayBuyerNumber);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.7day_sales
         *
         * @param i_7day_sales the value for jumei_mall.7day_sales
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder i_7day_sales(BigDecimal i_7day_sales) {
            obj.setI_7day_sales(i_7day_sales);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.30day_sales
         *
         * @param i_30day_sales the value for jumei_mall.30day_sales
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder i_30day_sales(BigDecimal i_30day_sales) {
            obj.setI_30day_sales(i_30day_sales);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.category
         *
         * @param category the value for jumei_mall.category
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
         * This method sets the value of the database column jumei_mall.merchant_id
         *
         * @param merchantId the value for jumei_mall.merchant_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder merchantId(Integer merchantId) {
            obj.setMerchantId(merchantId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.min_tax
         *
         * @param minTax the value for jumei_mall.min_tax
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder minTax(BigDecimal minTax) {
            obj.setMinTax(minTax);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.min_value_of_goods
         *
         * @param minValueOfGoods the value for jumei_mall.min_value_of_goods
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder minValueOfGoods(BigDecimal minValueOfGoods) {
            obj.setMinValueOfGoods(minValueOfGoods);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.first_sale_time
         *
         * @param firstSaleTime the value for jumei_mall.first_sale_time
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
         * This method sets the value of the database column jumei_mall.mall_sale_mode
         *
         * @param mallSaleMode the value for jumei_mall.mall_sale_mode
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder mallSaleMode(Boolean mallSaleMode) {
            obj.setMallSaleMode(mallSaleMode);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column jumei_mall.stock_sellable
         *
         * @param stockSellable the value for jumei_mall.stock_sellable
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder stockSellable(Boolean stockSellable) {
            obj.setStockSellable(stockSellable);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jumei_mall
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public jumei_mall build() {
            return this.obj;
        }
    }
}