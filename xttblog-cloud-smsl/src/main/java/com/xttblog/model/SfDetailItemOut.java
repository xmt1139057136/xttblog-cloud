package com.xttblog.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * SfDetailItemOut
 *
 * @author xtt
 * @date 2018/8/6 下午5:22
 */
@XStreamAlias("item")
public class SfDetailItemOut extends SfReserveField{
    private String erp_order_line_num;//行号 数字 19,5 行号
    private String item;//商品编号 字符 25 Y 商品编号
    private String item_name;//商品名称
    private String uom;//单位
    private String lot;//批号字符25 批号
    private String qty;//数量
    private String item_price;//价格
    private String item_discount;//优惠金额
    private String bom_action;//是否为组合商品

    public String getErp_order_line_num() {
        return erp_order_line_num;
    }

    public void setErp_order_line_num(String erp_order_line_num) {
        this.erp_order_line_num = erp_order_line_num;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getItem_price() {
        return item_price;
    }

    public void setItem_price(String item_price) {
        this.item_price = item_price;
    }

    public String getItem_discount() {
        return item_discount;
    }

    public void setItem_discount(String item_discount) {
        this.item_discount = item_discount;
    }

    public String getBom_action() {
        return bom_action;
    }

    public void setBom_action(String bom_action) {
        this.bom_action = bom_action;
    }

}
