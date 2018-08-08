package com.xttblog.util;

import org.apache.tomcat.util.codec.binary.Base64;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Md5Util
 *
 * @author xtt
 * @date 2018/8/7 上午11:58
 */
public class Md5Util {
    /**利用MD5进行加密
     * @param str  待加密的字符串
     * @return  加密后的字符串
     * @throws NoSuchAlgorithmException  没有这种产生消息摘要的算法
     * @throws UnsupportedEncodingException
     */
    public static String encoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法
        MessageDigest md5= MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        System.out.println(new String(md5.digest(str.getBytes("utf-8"))));
        //加密后的字符串
        String newstr=base64en.encode(md5.digest(str.getBytes("utf-8")));
        return newstr;
    }

    /**
     * 生成32位md5码
     * @param src
     * @return
     */
    public static String md5_32bit(String src) {

        try {
            // 得到一个信息摘要器
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] result = digest.digest(src.getBytes());
            StringBuffer buffer = new StringBuffer();
            // 把每一个byte 做一个与运算 0xff;
            for (byte b : result) {
                // 与运算
                int number = b & 0xff;// 加盐
                String str = Integer.toHexString(number);
                if (str.length() == 1) {
                    buffer.append("0");
                }
                buffer.append(str);
            }

            // 标准的md5加密后的结果
            return buffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }

    }

    /** Commons Codec实现base64编码 */
    public static String commonsCodecBase64(String src) {
        byte[] encode = Base64.encodeBase64(src.getBytes());
        byte[] decode = Base64.decodeBase64(encode);

        System.out.println("Commons Codec实现base64编码：\t" + new String(encode));
        System.out.println("Commons Codec实现base64解码：\t" + new String(decode));
        return new String(encode);
    }

    public static void main(String[] args) {
        String str = "<order></order>123456";
        str = md5_32bit(str);
        System.out.println(str);

        str = commonsCodecBase64(str);
        //"MmUwODUzOTA0OWFjMGY2YjViNDM3N2VjMjAxNDVjMDY="

        try {
            System.out.println(URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //MmUwODUzOTA0OWFjMGY2YjViNDM3N2VjMjAxNDVjMDY%3D
    //java.net.URLDecoder.decode(String s);

    }
}
