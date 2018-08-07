package com.xttblog.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * SfCancelSailOrderRequest
 *
 * @author xtt
 * @date 2018/8/6 下午7:13
 */
@XStreamAlias("wmsCancelSailOrderRequest")
public class SfCancelSailOrderRequest {
    private String checkword;//校验字段
    private String company;//货主
    private String orderid;//要取消的出库单号(ERP 单号)

    public String getCheckword() {
        return checkword;
    }

    public void setCheckword(String checkword) {
        this.checkword = checkword;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
}
