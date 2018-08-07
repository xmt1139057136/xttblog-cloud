package com.xttblog.model;

/**
 * SfDetailItem
 *
 * @author xtt
 * @date 2018/8/6 下午2:41
 */
public class SfDetailItemIn extends SfReserveField{
    private String erp_order_line_num;//行号 数字 19,5 行号
    private String item;//商品编号 字符 25 Y 商品编号
    private String total_qty;//数量 数字 28,5 Y 数量
    private String lot;//批号字符25 批号
    private String note;//备注字符600 备注

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

    public String getTotal_qty() {
        return total_qty;
    }

    public void setTotal_qty(String total_qty) {
        this.total_qty = total_qty;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
