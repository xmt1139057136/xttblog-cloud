package com.xttblog.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * SfHeaderOutOrder
 *
 * @author xtt
 * @date 2018/8/6 下午4:59
 */

public class SfHeaderStockOutRequest extends SfStockOutReserveField{
    private String company;//货主
    private String warehouse;//仓库
    private String shop_name;//商家店铺名称
    private String erp_order;//订单号码
    private String order_type;//订单类型
    private String order_date;//下单日期
    private String ship_from_name;//寄件公司
    private String ship_from_attention_to;//寄件人
    private String ship_from_country;//寄件国家或地区

    private String ship_from_province;//寄件省
    private String ship_from_city;//寄件市
    private String ship_from_area;//寄件区
    private String ship_from_address;//寄件地址
    private String ship_from_postal_code;//寄件邮编
    private String ship_from_phone_num;//寄件手机
    private String ship_from_tel_num;//寄件固定电话
    private String ship_from_email_address;//寄件邮箱地址
    private String ship_to_name;//收件公司
    private String ship_to_attention_to;//收件人
    private String ship_to_country;//收件国家或地区
    private String ship_to_province;//收件省
    private String ship_to_city;//收件市
    private String ship_to_area;//收件区/县
    private String ship_to_address;//收件地址
    private String ship_to_postal_code;//收件邮编
    private String ship_to_phone_num;//收件手机
    private String ship_to_tel_num;//收件固定电话
    private String ship_to_email_address;//收件邮箱地址
    private String carrier;//承运商
    private String carrier_service;//承运商服务类型
    private String route_numbers;//路线编号
    private String packing_note;//货品包装备注
    private String complete_delivery;//需整单发货
    private String freight;//运费</freight
    private String payment_of_charge;//货主运费付款方式
    private String payment_district;//付款地区:城市名称
    private String cod;//是否货到付款
    private String amount;//代收货款金额
    private String self_pickup;//是否上门自取
    private String value_insured;//是否保价
    private String declared_value;//声明价值
    private String return_receipt_service;//签回单
    private String delivery_date;//发货日期
    private String delivery_requested;//配送要求
    private String invoice;//需要发票
    private String invoice_type;//发票类型
    private String invoice_title;//发票抬头
    private String invoice_content;//发票内容
    private String order_note;//订单备注
    private String company_note;//商家备注
    private String priority;//订单优先级
    private String order_total_amount;//订单总金额
    private String order_discount;//订单优惠金额
    private String balance_amount;//余额支付金额
    private String coupons_amount;//优惠卷金额
    private String gift_card_amount;//礼品卡金额
    private String other_charge;//其它金额
    private String actual_amount;//实际支付金额
    private String customer_payment_method;//客户付款方式
    private String monthly_account;//月结账号
    private String is_appoint_delivery;//是否预约
    private String appoint_delivery_status;//预约状态
    private String appoint_delivery_remark;//预约备注
    private String from_flag;//寄件方标识
    private String is_easy;//是否是微仓订单</is_easy>

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getErp_order() {
        return erp_order;
    }

    public void setErp_order(String erp_order) {
        this.erp_order = erp_order;
    }

    public String getOrder_type() {
        return order_type;
    }

    public void setOrder_type(String order_type) {
        this.order_type = order_type;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getShip_from_name() {
        return ship_from_name;
    }

    public void setShip_from_name(String ship_from_name) {
        this.ship_from_name = ship_from_name;
    }

    public String getShip_from_attention_to() {
        return ship_from_attention_to;
    }

    public void setShip_from_attention_to(String ship_from_attention_to) {
        this.ship_from_attention_to = ship_from_attention_to;
    }

    public String getShip_from_country() {
        return ship_from_country;
    }

    public void setShip_from_country(String ship_from_country) {
        this.ship_from_country = ship_from_country;
    }

    public String getShip_from_province() {
        return ship_from_province;
    }

    public void setShip_from_province(String ship_from_province) {
        this.ship_from_province = ship_from_province;
    }

    public String getShip_from_city() {
        return ship_from_city;
    }

    public void setShip_from_city(String ship_from_city) {
        this.ship_from_city = ship_from_city;
    }

    public String getShip_from_area() {
        return ship_from_area;
    }

    public void setShip_from_area(String ship_from_area) {
        this.ship_from_area = ship_from_area;
    }

    public String getShip_from_address() {
        return ship_from_address;
    }

    public void setShip_from_address(String ship_from_address) {
        this.ship_from_address = ship_from_address;
    }

    public String getShip_from_postal_code() {
        return ship_from_postal_code;
    }

    public void setShip_from_postal_code(String ship_from_postal_code) {
        this.ship_from_postal_code = ship_from_postal_code;
    }

    public String getShip_from_phone_num() {
        return ship_from_phone_num;
    }

    public void setShip_from_phone_num(String ship_from_phone_num) {
        this.ship_from_phone_num = ship_from_phone_num;
    }

    public String getShip_from_tel_num() {
        return ship_from_tel_num;
    }

    public void setShip_from_tel_num(String ship_from_tel_num) {
        this.ship_from_tel_num = ship_from_tel_num;
    }

    public String getShip_from_email_address() {
        return ship_from_email_address;
    }

    public void setShip_from_email_address(String ship_from_email_address) {
        this.ship_from_email_address = ship_from_email_address;
    }

    public String getShip_to_name() {
        return ship_to_name;
    }

    public void setShip_to_name(String ship_to_name) {
        this.ship_to_name = ship_to_name;
    }

    public String getShip_to_attention_to() {
        return ship_to_attention_to;
    }

    public void setShip_to_attention_to(String ship_to_attention_to) {
        this.ship_to_attention_to = ship_to_attention_to;
    }

    public String getShip_to_country() {
        return ship_to_country;
    }

    public void setShip_to_country(String ship_to_country) {
        this.ship_to_country = ship_to_country;
    }

    public String getShip_to_province() {
        return ship_to_province;
    }

    public void setShip_to_province(String ship_to_province) {
        this.ship_to_province = ship_to_province;
    }

    public String getShip_to_city() {
        return ship_to_city;
    }

    public void setShip_to_city(String ship_to_city) {
        this.ship_to_city = ship_to_city;
    }

    public String getShip_to_area() {
        return ship_to_area;
    }

    public void setShip_to_area(String ship_to_area) {
        this.ship_to_area = ship_to_area;
    }

    public String getShip_to_address() {
        return ship_to_address;
    }

    public void setShip_to_address(String ship_to_address) {
        this.ship_to_address = ship_to_address;
    }

    public String getShip_to_postal_code() {
        return ship_to_postal_code;
    }

    public void setShip_to_postal_code(String ship_to_postal_code) {
        this.ship_to_postal_code = ship_to_postal_code;
    }

    public String getShip_to_phone_num() {
        return ship_to_phone_num;
    }

    public void setShip_to_phone_num(String ship_to_phone_num) {
        this.ship_to_phone_num = ship_to_phone_num;
    }

    public String getShip_to_tel_num() {
        return ship_to_tel_num;
    }

    public void setShip_to_tel_num(String ship_to_tel_num) {
        this.ship_to_tel_num = ship_to_tel_num;
    }

    public String getShip_to_email_address() {
        return ship_to_email_address;
    }

    public void setShip_to_email_address(String ship_to_email_address) {
        this.ship_to_email_address = ship_to_email_address;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCarrier_service() {
        return carrier_service;
    }

    public void setCarrier_service(String carrier_service) {
        this.carrier_service = carrier_service;
    }

    public String getRoute_numbers() {
        return route_numbers;
    }

    public void setRoute_numbers(String route_numbers) {
        this.route_numbers = route_numbers;
    }

    public String getPacking_note() {
        return packing_note;
    }

    public void setPacking_note(String packing_note) {
        this.packing_note = packing_note;
    }

    public String getComplete_delivery() {
        return complete_delivery;
    }

    public void setComplete_delivery(String complete_delivery) {
        this.complete_delivery = complete_delivery;
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    public String getPayment_of_charge() {
        return payment_of_charge;
    }

    public void setPayment_of_charge(String payment_of_charge) {
        this.payment_of_charge = payment_of_charge;
    }

    public String getPayment_district() {
        return payment_district;
    }

    public void setPayment_district(String payment_district) {
        this.payment_district = payment_district;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getSelf_pickup() {
        return self_pickup;
    }

    public void setSelf_pickup(String self_pickup) {
        this.self_pickup = self_pickup;
    }

    public String getValue_insured() {
        return value_insured;
    }

    public void setValue_insured(String value_insured) {
        this.value_insured = value_insured;
    }

    public String getDeclared_value() {
        return declared_value;
    }

    public void setDeclared_value(String declared_value) {
        this.declared_value = declared_value;
    }

    public String getReturn_receipt_service() {
        return return_receipt_service;
    }

    public void setReturn_receipt_service(String return_receipt_service) {
        this.return_receipt_service = return_receipt_service;
    }

    public String getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }

    public String getDelivery_requested() {
        return delivery_requested;
    }

    public void setDelivery_requested(String delivery_requested) {
        this.delivery_requested = delivery_requested;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getInvoice_type() {
        return invoice_type;
    }

    public void setInvoice_type(String invoice_type) {
        this.invoice_type = invoice_type;
    }

    public String getInvoice_title() {
        return invoice_title;
    }

    public void setInvoice_title(String invoice_title) {
        this.invoice_title = invoice_title;
    }

    public String getInvoice_content() {
        return invoice_content;
    }

    public void setInvoice_content(String invoice_content) {
        this.invoice_content = invoice_content;
    }

    public String getOrder_note() {
        return order_note;
    }

    public void setOrder_note(String order_note) {
        this.order_note = order_note;
    }

    public String getCompany_note() {
        return company_note;
    }

    public void setCompany_note(String company_note) {
        this.company_note = company_note;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getOrder_total_amount() {
        return order_total_amount;
    }

    public void setOrder_total_amount(String order_total_amount) {
        this.order_total_amount = order_total_amount;
    }

    public String getOrder_discount() {
        return order_discount;
    }

    public void setOrder_discount(String order_discount) {
        this.order_discount = order_discount;
    }

    public String getBalance_amount() {
        return balance_amount;
    }

    public void setBalance_amount(String balance_amount) {
        this.balance_amount = balance_amount;
    }

    public String getCoupons_amount() {
        return coupons_amount;
    }

    public void setCoupons_amount(String coupons_amount) {
        this.coupons_amount = coupons_amount;
    }

    public String getGift_card_amount() {
        return gift_card_amount;
    }

    public void setGift_card_amount(String gift_card_amount) {
        this.gift_card_amount = gift_card_amount;
    }

    public String getOther_charge() {
        return other_charge;
    }

    public void setOther_charge(String other_charge) {
        this.other_charge = other_charge;
    }

    public String getActual_amount() {
        return actual_amount;
    }

    public void setActual_amount(String actual_amount) {
        this.actual_amount = actual_amount;
    }

    public String getCustomer_payment_method() {
        return customer_payment_method;
    }

    public void setCustomer_payment_method(String customer_payment_method) {
        this.customer_payment_method = customer_payment_method;
    }

    public String getMonthly_account() {
        return monthly_account;
    }

    public void setMonthly_account(String monthly_account) {
        this.monthly_account = monthly_account;
    }

    public String getIs_appoint_delivery() {
        return is_appoint_delivery;
    }

    public void setIs_appoint_delivery(String is_appoint_delivery) {
        this.is_appoint_delivery = is_appoint_delivery;
    }

    public String getAppoint_delivery_status() {
        return appoint_delivery_status;
    }

    public void setAppoint_delivery_status(String appoint_delivery_status) {
        this.appoint_delivery_status = appoint_delivery_status;
    }

    public String getAppoint_delivery_remark() {
        return appoint_delivery_remark;
    }

    public void setAppoint_delivery_remark(String appoint_delivery_remark) {
        this.appoint_delivery_remark = appoint_delivery_remark;
    }

    public String getFrom_flag() {
        return from_flag;
    }

    public void setFrom_flag(String from_flag) {
        this.from_flag = from_flag;
    }

    public String getIs_easy() {
        return is_easy;
    }

    public void setIs_easy(String is_easy) {
        this.is_easy = is_easy;
    }

}
