package com.juxinli.tool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchEmail {
	
	/**
	 * 邮箱正则验证
	 * @param email
	 * @return true 则表示验证通过，false表示验证失败
	 */
	public static boolean match(String email){
		Pattern pattern = Pattern.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");  
        Matcher matcher = pattern.matcher(email);  
        return matcher.matches();
	}
}
