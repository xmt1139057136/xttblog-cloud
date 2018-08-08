package com.xttblog.xpath;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import com.xttblog.model.SfDetailItemOut;
import com.xttblog.model.SfExpressStockRequest;
import com.xttblog.model.SfHeaderStockOutRequest;
import com.xttblog.model.SfRealTimeInventoryBalanceQueryRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * XStreamImplicitTest
 *
 * @author xtt
 * @date 2018/8/7 下午2:47
 */
public class XStreamImplicitTest {
    public static void main(String[] args) {
        XStream xStream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
        xStream.processAnnotations(SfRealTimeInventoryBalanceQueryRequest.class);
        xStream.alias("item", String.class);
        xStream.aliasSystemAttribute(null, "class");

        SfRealTimeInventoryBalanceQueryRequest request = new SfRealTimeInventoryBalanceQueryRequest();
        request.setCheckword("QHCS-01");
        request.setCompany("QHCS-01");
        request.setWarehouse("010VB");
        request.setInventory_sts("10");

        List<String> list = new ArrayList<>();
        list.add("CS_20180626_07");
        list.add("CS_20180626_08");

        request.setItemlist(list);

        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + xStream.toXML(request);

        System.out.println(xml);

        SfRealTimeInventoryBalanceQueryRequest obj = (SfRealTimeInventoryBalanceQueryRequest)xStream.fromXML(xml);
        System.out.println(obj.getCheckword());
        System.out.println(obj.getWarehouse());
    }
}
