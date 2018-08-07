package com.xttblog.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * SfExpressOrder
 *
 * @author xtt
 * @date 2018/8/6 下午2:06
 */

@XStreamAlias("wmsSailOrderRequest")
public class SfExpressStockRequest <H, L>{
    //校验码
    @XStreamAlias("checkword")
    private String checkword;

    @XStreamAlias("header")
    private H header;

    @XStreamAlias("detailList")
    private List<L> detailList;

    public String getCheckword() {
        return checkword;
    }

    public void setCheckword(String checkword) {
        this.checkword = checkword;
    }

    public H getHeader() {
        return header;
    }

    public void setHeader(H header) {
        this.header = header;
    }

    public List<L> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<L> detailList) {
        this.detailList = detailList;
    }
}
