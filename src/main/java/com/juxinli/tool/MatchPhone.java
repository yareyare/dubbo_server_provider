package com.juxinli.tool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhone {
	/**
	 * 手机号正则验证
	 * @param phone
	 * @return true 则验证通过，false则验证不通过
	 */
	public static boolean match(String phone) { 
        Pattern pattern = Pattern.compile("^1[3|4|5|7|8]\\d{9}$");  
        Matcher matcher = pattern.matcher(phone);  
        return matcher.matches();  
    }   
}
