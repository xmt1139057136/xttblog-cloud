package com.xttblog.model;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * SfExpressStockResponse
 *
 * @author xtt
 * @date 2018/8/6 下午7:03
 */
@XStreamAlias("wmsPurchaseOrderResponse")
public class SfExpressStockResponse {
    private String orderid;//ERP 订单号(erp_order_num)
    private String result;//处理结果:1-成功，2-失败
    private String remark;//备注，如处理失败，此处可备注原因

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
