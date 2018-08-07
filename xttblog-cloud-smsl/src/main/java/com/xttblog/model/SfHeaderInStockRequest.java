package com.xttblog.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.Date;

/**
 * SfHeaderRequest
 *
 * @author xtt
 * @date 2018/8/6 下午2:10
 */
public class SfHeaderInStockRequest extends SfReserveField{

    @XStreamAlias("company")
    private String company;//货主,字符:25,Y,货主编号:货主必须使用顺 丰指定的客户编号
    private String warehouse;//仓库,字符:25,Y,仓库
    private String erp_order_num;//采购订单号码,字符:25,Y,订单号码
    private String erp_order_type;//订单类型,字符:25,Y,订单类型:PI:采购入库 RI:退货入库 AI:调拨入库 EI:换货入库 40:赠品入库 60:其它入库
    private Date order_date;//订单日期,日期,Y,订单日期
    private String buyer;//采购员,字符:50,N,采购员
    private String buyer_phone;//采购员联系方式,字符:200,N,采购员联系方式
    private Date scheduled_receipt_date;//预计收货时间,日期,N,预计收货时间
    private String source_id;//供应商代码,字符:25,供应商代码 :当订单类型 为为 AI 的时候，该字段可 选,为空时取货主代码
    private String transfer_warehouse;//调出仓库代码,字符:50,当订单类型为 AI 时，该字 段必须
    private String original_order_no;//原销售订单号 (原顺丰仓储 出库订单号),字符:50,当订单类型为 RI 时，即退 货入库，则该项为必填信息
    private String other_inbound_note;//其它入库说明,字符:600,当入库类型为其它入库时，请在此备注
    private String note_to_receiver;//备注,字符:600,采购订单备注
    private String is_easy;//是否是微仓订,字符:1,Y/N，如果不传则为普通订单

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

    public String getErp_order_num() {
        return erp_order_num;
    }

    public void setErp_order_num(String erp_order_num) {
        this.erp_order_num = erp_order_num;
    }

    public String getErp_order_type() {
        return erp_order_type;
    }

    public void setErp_order_type(String erp_order_type) {
        this.erp_order_type = erp_order_type;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getBuyer_phone() {
        return buyer_phone;
    }

    public void setBuyer_phone(String buyer_phone) {
        this.buyer_phone = buyer_phone;
    }

    public Date getScheduled_receipt_date() {
        return scheduled_receipt_date;
    }

    public void setScheduled_receipt_date(Date scheduled_receipt_date) {
        this.scheduled_receipt_date = scheduled_receipt_date;
    }

    public String getSource_id() {
        return source_id;
    }

    public void setSource_id(String source_id) {
        this.source_id = source_id;
    }

    public String getTransfer_warehouse() {
        return transfer_warehouse;
    }

    public void setTransfer_warehouse(String transfer_warehouse) {
        this.transfer_warehouse = transfer_warehouse;
    }

    public String getOriginal_order_no() {
        return original_order_no;
    }

    public void setOriginal_order_no(String original_order_no) {
        this.original_order_no = original_order_no;
    }

    public String getOther_inbound_note() {
        return other_inbound_note;
    }

    public void setOther_inbound_note(String other_inbound_note) {
        this.other_inbound_note = other_inbound_note;
    }

    public String getNote_to_receiver() {
        return note_to_receiver;
    }

    public void setNote_to_receiver(String note_to_receiver) {
        this.note_to_receiver = note_to_receiver;
    }

    public String getIs_easy() {
        return is_easy;
    }

    public void setIs_easy(String is_easy) {
        this.is_easy = is_easy;
    }

}
