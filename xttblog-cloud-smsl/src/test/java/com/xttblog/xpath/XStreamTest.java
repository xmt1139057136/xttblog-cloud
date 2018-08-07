package com.xttblog.xpath;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import com.xttblog.model.SfDetailItemOut;
import com.xttblog.model.SfExpressStockRequest;
import com.xttblog.model.SfHeaderStockOutRequest;
import com.xttblog.util.XmlUtil;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * XpathTest
 *
 * @author xtt
 * @date 2018/8/6 下午4:01
 */
public class XStreamTest {
    public static void main(String[] args) throws Exception{

        SfExpressStockRequest<SfHeaderStockOutRequest, SfDetailItemOut> request = new SfExpressStockRequest();
        request.setCheckword("QHCS-01");

        SfHeaderStockOutRequest header = new SfHeaderStockOutRequest();

        header.setCompany("QHCS-01");
        header.setWarehouse("010VB");
        header.setErp_order("20180803160426114605");
        header.setShip_from_name("众安科技");
        header.setShip_from_attention_to("众安");
        header.setShip_from_province("上海");
        header.setShip_from_city("上海");
        header.setShip_from_area("黄浦");
        header.setShip_from_address("真光大楼7楼");
        header.setShip_from_phone_num("");
        header.setShip_from_tel_num("025-12345678");
        header.setShip_to_attention_to("大米");
        header.setShip_to_province("浙江省");
        header.setShip_to_city("杭州市");
        header.setShip_to_area("拱墅区");
        header.setShip_to_address("北北西里436");
        header.setShip_to_phone_num("19915610023");

        request.setHeader(header);

        SfDetailItemOut detail = new SfDetailItemOut();
        detail.setItem("bbj001");
        detail.setQty("1.0");

        List<SfDetailItemOut> list = new ArrayList();
        list.add(detail);

        request.setDetailList(list);

        XStream xStream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
        xStream.processAnnotations(SfExpressStockRequest.class);
        xStream.processAnnotations(SfHeaderStockOutRequest.class);
        xStream.processAnnotations(SfDetailItemOut.class);
        xStream.aliasSystemAttribute(null, "class");

        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + xStream.toXML(request);

        System.out.println(xml);

        String strXml = "";

    }
}
