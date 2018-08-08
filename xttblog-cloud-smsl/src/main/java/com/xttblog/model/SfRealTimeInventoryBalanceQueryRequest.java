package com.xttblog.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * RealTimeInventoryBalanceQueryRequest
 *
 * @author xtt
 * @date 2018/8/7 下午2:40
 */
@XStreamAlias("wmsRealTimeInventoryBalanceQueryRequest")
public class SfRealTimeInventoryBalanceQueryRequest {

    private String checkword;//QHCS-01</checkword>
    private String company;//QHCS-01</company>
    @XStreamAlias("itemlist")
    private List<String> itemlist;//
    private String warehouse;//010VB
    private String inventory_sts;//10

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

    public List<String> getItemlist() {
        return itemlist;
    }

    public void setItemlist(List<String> itemlist) {
        this.itemlist = itemlist;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getInventory_sts() {
        return inventory_sts;
    }

    public void setInventory_sts(String inventory_sts) {
        this.inventory_sts = inventory_sts;
    }
}
