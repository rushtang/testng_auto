package model.jumei_product.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class tuanmei_product_inventory {
    private String skuNo;

    private Integer productId;

    private Integer spuId;

    private String attribute;

    private BigDecimal marketPrice;

    private BigDecimal jumeiPrice;

    private BigDecimal weight;

    private String size;

    private String color;

    private String productType;

    private String skuType;

    private BigDecimal cost;

    private Integer inventoryOnhand;

    private Integer inventoryLocked;

    private Integer inventoryOrdered;

    private Integer inventoryReserved;

    private Integer inventoryOnroad;

    private Integer virtualFullfillment;

    private Integer minInventory;

    private Integer displaySellingNum;

    private Byte isAvailable;

    private Byte isEnabled;

    private Boolean isBom;

    private Boolean isHighValue;

    private Boolean isThermostaticStorage;

    private Byte isLuxury;

    private String upcCode;

    private BigDecimal width;

    private BigDecimal height;

    private BigDecimal length;

    private Boolean isHot;

    private String property;

    private Integer createTime;

    private Integer updateTime;

    private String whereToSell;

    private String note;

    private String purchaseChannels;

    private Byte submodelOrder;

    private String skuCategory;

    private String parentSku;

    private String supplierCode;

    private Byte expirDate;

    private Byte seasonProperty;

    private Date dataTimestamp;

    private Integer merchantId;

    private Integer firstTime;

    private Boolean popShippingType;

    private String selfsaleSkuNo;

    private Byte unit;

    public tuanmei_product_inventory(String skuNo, Integer productId, Integer spuId, String attribute, BigDecimal marketPrice, BigDecimal jumeiPrice, BigDecimal weight, String size, String color, String productType, String skuType, BigDecimal cost, Integer inventoryOnhand, Integer inventoryLocked, Integer inventoryOrdered, Integer inventoryReserved, Integer inventoryOnroad, Integer virtualFullfillment, Integer minInventory, Integer displaySellingNum, Byte isAvailable, Byte isEnabled, Boolean isBom, Boolean isHighValue, Boolean isThermostaticStorage, Byte isLuxury, String upcCode, BigDecimal width, BigDecimal height, BigDecimal length, Boolean isHot, String property, Integer createTime, Integer updateTime, String whereToSell, String note, String purchaseChannels, Byte submodelOrder, String skuCategory, String parentSku, String supplierCode, Byte expirDate, Byte seasonProperty, Date dataTimestamp, Integer merchantId, Integer firstTime, Boolean popShippingType, String selfsaleSkuNo, Byte unit) {
        this.skuNo = skuNo;
        this.productId = productId;
        this.spuId = spuId;
        this.attribute = attribute;
        this.marketPrice = marketPrice;
        this.jumeiPrice = jumeiPrice;
        this.weight = weight;
        this.size = size;
        this.color = color;
        this.productType = productType;
        this.skuType = skuType;
        this.cost = cost;
        this.inventoryOnhand = inventoryOnhand;
        this.inventoryLocked = inventoryLocked;
        this.inventoryOrdered = inventoryOrdered;
        this.inventoryReserved = inventoryReserved;
        this.inventoryOnroad = inventoryOnroad;
        this.virtualFullfillment = virtualFullfillment;
        this.minInventory = minInventory;
        this.displaySellingNum = displaySellingNum;
        this.isAvailable = isAvailable;
        this.isEnabled = isEnabled;
        this.isBom = isBom;
        this.isHighValue = isHighValue;
        this.isThermostaticStorage = isThermostaticStorage;
        this.isLuxury = isLuxury;
        this.upcCode = upcCode;
        this.width = width;
        this.height = height;
        this.length = length;
        this.isHot = isHot;
        this.property = property;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.whereToSell = whereToSell;
        this.note = note;
        this.purchaseChannels = purchaseChannels;
        this.submodelOrder = submodelOrder;
        this.skuCategory = skuCategory;
        this.parentSku = parentSku;
        this.supplierCode = supplierCode;
        this.expirDate = expirDate;
        this.seasonProperty = seasonProperty;
        this.dataTimestamp = dataTimestamp;
        this.merchantId = merchantId;
        this.firstTime = firstTime;
        this.popShippingType = popShippingType;
        this.selfsaleSkuNo = selfsaleSkuNo;
        this.unit = unit;
    }

    public tuanmei_product_inventory() {
        super();
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

    public Integer getSpuId() {
        return spuId;
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getJumeiPrice() {
        return jumeiPrice;
    }

    public void setJumeiPrice(BigDecimal jumeiPrice) {
        this.jumeiPrice = jumeiPrice;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getSkuType() {
        return skuType;
    }

    public void setSkuType(String skuType) {
        this.skuType = skuType == null ? null : skuType.trim();
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Integer getInventoryOnhand() {
        return inventoryOnhand;
    }

    public void setInventoryOnhand(Integer inventoryOnhand) {
        this.inventoryOnhand = inventoryOnhand;
    }

    public Integer getInventoryLocked() {
        return inventoryLocked;
    }

    public void setInventoryLocked(Integer inventoryLocked) {
        this.inventoryLocked = inventoryLocked;
    }

    public Integer getInventoryOrdered() {
        return inventoryOrdered;
    }

    public void setInventoryOrdered(Integer inventoryOrdered) {
        this.inventoryOrdered = inventoryOrdered;
    }

    public Integer getInventoryReserved() {
        return inventoryReserved;
    }

    public void setInventoryReserved(Integer inventoryReserved) {
        this.inventoryReserved = inventoryReserved;
    }

    public Integer getInventoryOnroad() {
        return inventoryOnroad;
    }

    public void setInventoryOnroad(Integer inventoryOnroad) {
        this.inventoryOnroad = inventoryOnroad;
    }

    public Integer getVirtualFullfillment() {
        return virtualFullfillment;
    }

    public void setVirtualFullfillment(Integer virtualFullfillment) {
        this.virtualFullfillment = virtualFullfillment;
    }

    public Integer getMinInventory() {
        return minInventory;
    }

    public void setMinInventory(Integer minInventory) {
        this.minInventory = minInventory;
    }

    public Integer getDisplaySellingNum() {
        return displaySellingNum;
    }

    public void setDisplaySellingNum(Integer displaySellingNum) {
        this.displaySellingNum = displaySellingNum;
    }

    public Byte getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Byte isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Byte getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Byte isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getIsBom() {
        return isBom;
    }

    public void setIsBom(Boolean isBom) {
        this.isBom = isBom;
    }

    public Boolean getIsHighValue() {
        return isHighValue;
    }

    public void setIsHighValue(Boolean isHighValue) {
        this.isHighValue = isHighValue;
    }

    public Boolean getIsThermostaticStorage() {
        return isThermostaticStorage;
    }

    public void setIsThermostaticStorage(Boolean isThermostaticStorage) {
        this.isThermostaticStorage = isThermostaticStorage;
    }

    public Byte getIsLuxury() {
        return isLuxury;
    }

    public void setIsLuxury(Byte isLuxury) {
        this.isLuxury = isLuxury;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode == null ? null : upcCode.trim();
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public String getWhereToSell() {
        return whereToSell;
    }

    public void setWhereToSell(String whereToSell) {
        this.whereToSell = whereToSell == null ? null : whereToSell.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getPurchaseChannels() {
        return purchaseChannels;
    }

    public void setPurchaseChannels(String purchaseChannels) {
        this.purchaseChannels = purchaseChannels == null ? null : purchaseChannels.trim();
    }

    public Byte getSubmodelOrder() {
        return submodelOrder;
    }

    public void setSubmodelOrder(Byte submodelOrder) {
        this.submodelOrder = submodelOrder;
    }

    public String getSkuCategory() {
        return skuCategory;
    }

    public void setSkuCategory(String skuCategory) {
        this.skuCategory = skuCategory == null ? null : skuCategory.trim();
    }

    public String getParentSku() {
        return parentSku;
    }

    public void setParentSku(String parentSku) {
        this.parentSku = parentSku == null ? null : parentSku.trim();
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode == null ? null : supplierCode.trim();
    }

    public Byte getExpirDate() {
        return expirDate;
    }

    public void setExpirDate(Byte expirDate) {
        this.expirDate = expirDate;
    }

    public Byte getSeasonProperty() {
        return seasonProperty;
    }

    public void setSeasonProperty(Byte seasonProperty) {
        this.seasonProperty = seasonProperty;
    }

    public Date getDataTimestamp() {
        return dataTimestamp;
    }

    public void setDataTimestamp(Date dataTimestamp) {
        this.dataTimestamp = dataTimestamp;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(Integer firstTime) {
        this.firstTime = firstTime;
    }

    public Boolean getPopShippingType() {
        return popShippingType;
    }

    public void setPopShippingType(Boolean popShippingType) {
        this.popShippingType = popShippingType;
    }

    public String getSelfsaleSkuNo() {
        return selfsaleSkuNo;
    }

    public void setSelfsaleSkuNo(String selfsaleSkuNo) {
        this.selfsaleSkuNo = selfsaleSkuNo == null ? null : selfsaleSkuNo.trim();
    }

    public Byte getUnit() {
        return unit;
    }

    public void setUnit(Byte unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuanmei_product_inventory
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static tuanmei_product_inventory.Builder builder() {
        return new tuanmei_product_inventory.Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tuanmei_product_inventory
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table tuanmei_product_inventory
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private tuanmei_product_inventory obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table tuanmei_product_inventory
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder() {
            this.obj = new tuanmei_product_inventory();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.sku_no
         *
         * @param skuNo the value for tuanmei_product_inventory.sku_no
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
         * This method sets the value of the database column tuanmei_product_inventory.product_id
         *
         * @param productId the value for tuanmei_product_inventory.product_id
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
         * This method sets the value of the database column tuanmei_product_inventory.spu_id
         *
         * @param spuId the value for tuanmei_product_inventory.spu_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder spuId(Integer spuId) {
            obj.setSpuId(spuId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.attribute
         *
         * @param attribute the value for tuanmei_product_inventory.attribute
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder attribute(String attribute) {
            obj.setAttribute(attribute);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.market_price
         *
         * @param marketPrice the value for tuanmei_product_inventory.market_price
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder marketPrice(BigDecimal marketPrice) {
            obj.setMarketPrice(marketPrice);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.jumei_price
         *
         * @param jumeiPrice the value for tuanmei_product_inventory.jumei_price
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder jumeiPrice(BigDecimal jumeiPrice) {
            obj.setJumeiPrice(jumeiPrice);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.weight
         *
         * @param weight the value for tuanmei_product_inventory.weight
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder weight(BigDecimal weight) {
            obj.setWeight(weight);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.size
         *
         * @param size the value for tuanmei_product_inventory.size
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder size(String size) {
            obj.setSize(size);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.color
         *
         * @param color the value for tuanmei_product_inventory.color
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder color(String color) {
            obj.setColor(color);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.product_type
         *
         * @param productType the value for tuanmei_product_inventory.product_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder productType(String productType) {
            obj.setProductType(productType);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.sku_type
         *
         * @param skuType the value for tuanmei_product_inventory.sku_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder skuType(String skuType) {
            obj.setSkuType(skuType);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.cost
         *
         * @param cost the value for tuanmei_product_inventory.cost
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder cost(BigDecimal cost) {
            obj.setCost(cost);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.inventory_onhand
         *
         * @param inventoryOnhand the value for tuanmei_product_inventory.inventory_onhand
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder inventoryOnhand(Integer inventoryOnhand) {
            obj.setInventoryOnhand(inventoryOnhand);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.inventory_locked
         *
         * @param inventoryLocked the value for tuanmei_product_inventory.inventory_locked
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder inventoryLocked(Integer inventoryLocked) {
            obj.setInventoryLocked(inventoryLocked);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.inventory_ordered
         *
         * @param inventoryOrdered the value for tuanmei_product_inventory.inventory_ordered
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder inventoryOrdered(Integer inventoryOrdered) {
            obj.setInventoryOrdered(inventoryOrdered);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.inventory_reserved
         *
         * @param inventoryReserved the value for tuanmei_product_inventory.inventory_reserved
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder inventoryReserved(Integer inventoryReserved) {
            obj.setInventoryReserved(inventoryReserved);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.inventory_onroad
         *
         * @param inventoryOnroad the value for tuanmei_product_inventory.inventory_onroad
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder inventoryOnroad(Integer inventoryOnroad) {
            obj.setInventoryOnroad(inventoryOnroad);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.virtual_fullfillment
         *
         * @param virtualFullfillment the value for tuanmei_product_inventory.virtual_fullfillment
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder virtualFullfillment(Integer virtualFullfillment) {
            obj.setVirtualFullfillment(virtualFullfillment);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.min_inventory
         *
         * @param minInventory the value for tuanmei_product_inventory.min_inventory
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder minInventory(Integer minInventory) {
            obj.setMinInventory(minInventory);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.display_selling_num
         *
         * @param displaySellingNum the value for tuanmei_product_inventory.display_selling_num
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder displaySellingNum(Integer displaySellingNum) {
            obj.setDisplaySellingNum(displaySellingNum);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.is_available
         *
         * @param isAvailable the value for tuanmei_product_inventory.is_available
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder isAvailable(Byte isAvailable) {
            obj.setIsAvailable(isAvailable);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.is_enabled
         *
         * @param isEnabled the value for tuanmei_product_inventory.is_enabled
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder isEnabled(Byte isEnabled) {
            obj.setIsEnabled(isEnabled);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.is_bom
         *
         * @param isBom the value for tuanmei_product_inventory.is_bom
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder isBom(Boolean isBom) {
            obj.setIsBom(isBom);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.is_high_value
         *
         * @param isHighValue the value for tuanmei_product_inventory.is_high_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder isHighValue(Boolean isHighValue) {
            obj.setIsHighValue(isHighValue);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.is_thermostatic_storage
         *
         * @param isThermostaticStorage the value for tuanmei_product_inventory.is_thermostatic_storage
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder isThermostaticStorage(Boolean isThermostaticStorage) {
            obj.setIsThermostaticStorage(isThermostaticStorage);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.is_luxury
         *
         * @param isLuxury the value for tuanmei_product_inventory.is_luxury
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder isLuxury(Byte isLuxury) {
            obj.setIsLuxury(isLuxury);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.upc_code
         *
         * @param upcCode the value for tuanmei_product_inventory.upc_code
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder upcCode(String upcCode) {
            obj.setUpcCode(upcCode);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.width
         *
         * @param width the value for tuanmei_product_inventory.width
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder width(BigDecimal width) {
            obj.setWidth(width);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.height
         *
         * @param height the value for tuanmei_product_inventory.height
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder height(BigDecimal height) {
            obj.setHeight(height);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.length
         *
         * @param length the value for tuanmei_product_inventory.length
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder length(BigDecimal length) {
            obj.setLength(length);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.is_hot
         *
         * @param isHot the value for tuanmei_product_inventory.is_hot
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder isHot(Boolean isHot) {
            obj.setIsHot(isHot);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.property
         *
         * @param property the value for tuanmei_product_inventory.property
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder property(String property) {
            obj.setProperty(property);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.create_time
         *
         * @param createTime the value for tuanmei_product_inventory.create_time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder createTime(Integer createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.update_time
         *
         * @param updateTime the value for tuanmei_product_inventory.update_time
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
         * This method sets the value of the database column tuanmei_product_inventory.where_to_sell
         *
         * @param whereToSell the value for tuanmei_product_inventory.where_to_sell
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder whereToSell(String whereToSell) {
            obj.setWhereToSell(whereToSell);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.note
         *
         * @param note the value for tuanmei_product_inventory.note
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
         * This method sets the value of the database column tuanmei_product_inventory.purchase_channels
         *
         * @param purchaseChannels the value for tuanmei_product_inventory.purchase_channels
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder purchaseChannels(String purchaseChannels) {
            obj.setPurchaseChannels(purchaseChannels);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.submodel_order
         *
         * @param submodelOrder the value for tuanmei_product_inventory.submodel_order
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder submodelOrder(Byte submodelOrder) {
            obj.setSubmodelOrder(submodelOrder);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.sku_category
         *
         * @param skuCategory the value for tuanmei_product_inventory.sku_category
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder skuCategory(String skuCategory) {
            obj.setSkuCategory(skuCategory);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.parent_sku
         *
         * @param parentSku the value for tuanmei_product_inventory.parent_sku
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder parentSku(String parentSku) {
            obj.setParentSku(parentSku);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.supplier_code
         *
         * @param supplierCode the value for tuanmei_product_inventory.supplier_code
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder supplierCode(String supplierCode) {
            obj.setSupplierCode(supplierCode);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.expir_date
         *
         * @param expirDate the value for tuanmei_product_inventory.expir_date
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder expirDate(Byte expirDate) {
            obj.setExpirDate(expirDate);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.season_property
         *
         * @param seasonProperty the value for tuanmei_product_inventory.season_property
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder seasonProperty(Byte seasonProperty) {
            obj.setSeasonProperty(seasonProperty);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.data_timestamp
         *
         * @param dataTimestamp the value for tuanmei_product_inventory.data_timestamp
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder dataTimestamp(Date dataTimestamp) {
            obj.setDataTimestamp(dataTimestamp);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.merchant_id
         *
         * @param merchantId the value for tuanmei_product_inventory.merchant_id
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
         * This method sets the value of the database column tuanmei_product_inventory.first_time
         *
         * @param firstTime the value for tuanmei_product_inventory.first_time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder firstTime(Integer firstTime) {
            obj.setFirstTime(firstTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.pop_shipping_type
         *
         * @param popShippingType the value for tuanmei_product_inventory.pop_shipping_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder popShippingType(Boolean popShippingType) {
            obj.setPopShippingType(popShippingType);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.selfsale_sku_no
         *
         * @param selfsaleSkuNo the value for tuanmei_product_inventory.selfsale_sku_no
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder selfsaleSkuNo(String selfsaleSkuNo) {
            obj.setSelfsaleSkuNo(selfsaleSkuNo);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column tuanmei_product_inventory.unit
         *
         * @param unit the value for tuanmei_product_inventory.unit
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder unit(Byte unit) {
            obj.setUnit(unit);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table tuanmei_product_inventory
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public tuanmei_product_inventory build() {
            return this.obj;
        }
    }
}