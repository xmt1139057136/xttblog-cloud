package com.xttblog.util;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * XmlUtil
 *
 * @author xtt
 * @date 2018/8/6 下午4:11
 */
public class XmlUtil<T>{
    /**
     * 通用List写入xml
     *
     * @param list     要保存的集合数据
     * @param clazz    实体类
     * @param path     存放路径
     * @param fileName 文件名
     */
    public static void writeXml(List list, Class clazz, String path, String fileName) {
        int flag = 1;

        // create dom tree
        Document document = DocumentHelper.createDocument();
        Element root = document.addElement(clazz.getSimpleName() + "s");
        // add element
        for (Object obj : list) {
            Element element = root.addElement(clazz.getSimpleName());
            try {
                Class per = clazz.getSuperclass();
                Field fieldsPerson[] = per.getDeclaredFields();
                for (Field field : fieldsPerson) {
                    field.setAccessible(true);
                    // append child element
                    element.addElement(field.getName()).setText(field.get(obj).toString());
                }
                //get all properties
                Field fields[] = clazz.getDeclaredFields();
                for (Field field : fields) {
                    field.setAccessible(true);
                    // append element child element
                    Element e = element.addElement(field.getName());
                    //deal null and empty
                    if (field.get(obj) != null && !"".equals(field.get(obj).toString())) {
                        if (field.getName().equals("id")) {
                            e.setText(String.valueOf(flag));
                            flag++;
                        } else {
                            e.setText(field.get(obj).toString());
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            //format xml default:ISO8859-1
            OutputFormat format = OutputFormat.createPrettyPrint();
            format.setEncoding("UTF-8");
            XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(path + "/" + fileName), format);
            //cancel format xml
            //XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(path + "/" +fileName));

            xmlWriter.write(document);
            xmlWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
