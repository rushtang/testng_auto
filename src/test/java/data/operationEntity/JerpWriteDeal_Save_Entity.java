package data.operationEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JerpWriteDeal_Save_Entity {

    /**
     * category : product
     * show_category : deal
     * product_id : 222551124
     * start_time : 1546407591
     * end_time : 1550641191
     * is_near_validity : 1
     * editor_username : ceshi20
     * site : bj
     * site_stock_split : 1
     * warehouse : CD06
     * special_deal_group_name : fashion
     * platform : mobile-app
     * is_shown_in_home : 1
     * status : 1
     * wish_plus : true
     * is_published_price : 1
     * sale_type : sale_promotion
     * deal_group_label : rush233
     * virtual_goods_id : 6643344
     * virtual_inventory : CGO1_S1
     * sale_short_name : maimaimai
     * using_title : 0
     * name : 近效期商品名称长标题22
     * medium_name : 近效期标题名称中标题
     * short_name : 商品名商品
     * home_sale_name : title22222
     * payment_start_time : 1546334169
     * payment_end_time : 1547889369
     * user_purchase_limit : 1
     * ending_buyer_number : 1000
     * stocks : 1000
     * need_sync : 0
     * redeem_lowest_total_price : 0
     * delivery_fee : 10
     * refund_policy : 30days_unpack_no_refund
     * relationships : [{"sku_no":"1047280","customers_price":"22.00","market_price":"32.00","deposit":30,"is_enable":1,"virtual_ware_house":"CGO1_S1","min_expire_time":"50","max_expire_time":"60"}]
     */

    private String category;
    private String show_category;
    private String product_id;
    private String start_time;
    private String end_time;
    private int is_near_validity;
    private String editor_username;
    private String site;
    private int site_stock_split;
    private String warehouse;
    private String special_deal_group_name;
    private String platform;
    private int is_shown_in_home;
    private int status;
    private boolean wish_plus;
    private int is_published_price;
    private String sale_type;
    private String deal_group_label;
    private String virtual_goods_id;
    private String virtual_inventory;
    private String sale_short_name;
    private String using_title;
    private String name;
    private String medium_name;
    private String short_name;
    private String home_sale_name;
    private String payment_start_time;
    private String payment_end_time;
    private int user_purchase_limit;
    private int ending_buyer_number;
    private int stocks;
    private int need_sync;
    private String redeem_lowest_total_price;
    private String delivery_fee;
    private String refund_policy;
    private List<RelationshipsBean> relationships;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getShow_category() {
        return show_category;
    }

    public void setShow_category(String show_category) {
        this.show_category = show_category;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public int getIs_near_validity() {
        return is_near_validity;
    }

    public void setIs_near_validity(int is_near_validity) {
        this.is_near_validity = is_near_validity;
    }

    public String getEditor_username() {
        return editor_username;
    }

    public void setEditor_username(String editor_username) {
        this.editor_username = editor_username;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getSite_stock_split() {
        return site_stock_split;
    }

    public void setSite_stock_split(int site_stock_split) {
        this.site_stock_split = site_stock_split;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getSpecial_deal_group_name() {
        return special_deal_group_name;
    }

    public void setSpecial_deal_group_name(String special_deal_group_name) {
        this.special_deal_group_name = special_deal_group_name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getIs_shown_in_home() {
        return is_shown_in_home;
    }

    public void setIs_shown_in_home(int is_shown_in_home) {
        this.is_shown_in_home = is_shown_in_home;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isWish_plus() {
        return wish_plus;
    }

    public void setWish_plus(boolean wish_plus) {
        this.wish_plus = wish_plus;
    }

    public int getIs_published_price() {
        return is_published_price;
    }

    public void setIs_published_price(int is_published_price) {
        this.is_published_price = is_published_price;
    }

    public String getSale_type() {
        return sale_type;
    }

    public void setSale_type(String sale_type) {
        this.sale_type = sale_type;
    }

    public String getDeal_group_label() {
        return deal_group_label;
    }

    public void setDeal_group_label(String deal_group_label) {
        this.deal_group_label = deal_group_label;
    }

    public String getVirtual_goods_id() {
        return virtual_goods_id;
    }

    public void setVirtual_goods_id(String virtual_goods_id) {
        this.virtual_goods_id = virtual_goods_id;
    }

    public String getVirtual_inventory() {
        return virtual_inventory;
    }

    public void setVirtual_inventory(String virtual_inventory) {
        this.virtual_inventory = virtual_inventory;
    }

    public String getSale_short_name() {
        return sale_short_name;
    }

    public void setSale_short_name(String sale_short_name) {
        this.sale_short_name = sale_short_name;
    }

    public String getUsing_title() {
        return using_title;
    }

    public void setUsing_title(String using_title) {
        this.using_title = using_title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedium_name() {
        return medium_name;
    }

    public void setMedium_name(String medium_name) {
        this.medium_name = medium_name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getHome_sale_name() {
        return home_sale_name;
    }

    public void setHome_sale_name(String home_sale_name) {
        this.home_sale_name = home_sale_name;
    }

    public String getPayment_start_time() {
        return payment_start_time;
    }

    public void setPayment_start_time(String payment_start_time) {
        this.payment_start_time = payment_start_time;
    }

    public String getPayment_end_time() {
        return payment_end_time;
    }

    public void setPayment_end_time(String payment_end_time) {
        this.payment_end_time = payment_end_time;
    }

    public int getUser_purchase_limit() {
        return user_purchase_limit;
    }

    public void setUser_purchase_limit(int user_purchase_limit) {
        this.user_purchase_limit = user_purchase_limit;
    }

    public int getEnding_buyer_number() {
        return ending_buyer_number;
    }

    public void setEnding_buyer_number(int ending_buyer_number) {
        this.ending_buyer_number = ending_buyer_number;
    }

    public int getStocks() {
        return stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

    public int getNeed_sync() {
        return need_sync;
    }

    public void setNeed_sync(int need_sync) {
        this.need_sync = need_sync;
    }

    public String getRedeem_lowest_total_price() {
        return redeem_lowest_total_price;
    }

    public void setRedeem_lowest_total_price(String redeem_lowest_total_price) {
        this.redeem_lowest_total_price = redeem_lowest_total_price;
    }

    public String getDelivery_fee() {
        return delivery_fee;
    }

    public void setDelivery_fee(String delivery_fee) {
        this.delivery_fee = delivery_fee;
    }

    public String getRefund_policy() {
        return refund_policy;
    }

    public void setRefund_policy(String refund_policy) {
        this.refund_policy = refund_policy;
    }

    public List<RelationshipsBean> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<RelationshipsBean> relationships) {
        this.relationships = relationships;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RelationshipsBean {
        /**
         * sku_no : 1047280
         * customers_price : 22.00
         * market_price : 32.00
         * deposit : 30
         * is_enable : 1
         * virtual_ware_house : CGO1_S1
         * min_expire_time : 50
         * max_expire_time : 60
         */

        private String sku_no;
        private String customers_price;
        private String market_price;
        private int deposit;
        private int is_enable;
        private String virtual_ware_house;
        private String min_expire_time;
        private String max_expire_time;

        public String getSku_no() {
            return sku_no;
        }

        public void setSku_no(String sku_no) {
            this.sku_no = sku_no;
        }

        public String getCustomers_price() {
            return customers_price;
        }

        public void setCustomers_price(String customers_price) {
            this.customers_price = customers_price;
        }

        public String getMarket_price() {
            return market_price;
        }

        public void setMarket_price(String market_price) {
            this.market_price = market_price;
        }

        public int getDeposit() {
            return deposit;
        }

        public void setDeposit(int deposit) {
            this.deposit = deposit;
        }

        public int getIs_enable() {
            return is_enable;
        }

        public void setIs_enable(int is_enable) {
            this.is_enable = is_enable;
        }

        public String getVirtual_ware_house() {
            return virtual_ware_house;
        }

        public void setVirtual_ware_house(String virtual_ware_house) {
            this.virtual_ware_house = virtual_ware_house;
        }

        public String getMin_expire_time() {
            return min_expire_time;
        }

        public void setMin_expire_time(String min_expire_time) {
            this.min_expire_time = min_expire_time;
        }

        public String getMax_expire_time() {
            return max_expire_time;
        }

        public void setMax_expire_time(String max_expire_time) {
            this.max_expire_time = max_expire_time;
        }
    }
}
