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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * XpathTest
 *
 * @author xtt
 * @date 2018/8/6 下午4:01
 */
public class XStreamTest {

    @Autowired
    private RestTemplate restTemplate;

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

        XStreamTest test = new XStreamTest();
//        test.restTemplate.postForObject("http://scs-drp-core-out.sit.sf-express.com:3580/BspToOms", );
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
//
//        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
//        map.add("email", "first.last@example.com");
//
//        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

        String url = "http://scs-drp-core-out.sit.sf-express.com:3580/BspToOms";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_XML);

        HttpEntity<String> entity = new HttpEntity<>(xml, headers);

        ResponseEntity<String> response = test.restTemplate.postForEntity( url, entity , String.class );

        System.out.println(response.getBody());

        String strXml = "";



    }
}
