package com.imooc.utils;

import org.apache.commons.codec.binary.Base64;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class MD5Utils {


    public static String getMD5Str(String strValue) throws Exception{
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        String newStr = Base64.encodeBase64String(md5.digest(strValue.getBytes()));
        return newStr;
    }

    public static void main(String[] args) {
        try {
            String md5 = getMD5Str("123456");
            System.out.println(md5);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
