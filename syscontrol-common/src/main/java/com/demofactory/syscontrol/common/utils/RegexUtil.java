package com.demofactory.syscontrol.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {
    //手机号正则表达式
    /**
     * REGEX_MOBILE 手机号正则表达式
     * REGEX_EMAIL  邮箱正则表达式
     * REGEX_PASSWORD   密码正则表达式
     */
    public static final String REGEX_MOBILE = "^1[3|4|5|7|8][0-9]{9}$";
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
    public static final String REGEX_PASSWORD = "^(?:(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])).{6,}$";




    public static boolean checkRegex(String regexParam, String checkParam) {
        Pattern pattern = Pattern.compile(regexParam);
        Matcher matcher = pattern.matcher(checkParam);
        return matcher.matches();
    }
}
