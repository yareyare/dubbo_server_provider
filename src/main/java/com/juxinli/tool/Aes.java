package com.juxinli.tool;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;


/* 
 * 编码工具类 
 * 1.将byte[]转为各种进制的字符串 
 * 2.base 64 encode 
 * 3.base 64 decode 
 * 4.获取byte[]的md5值 
 * 5.获取字符串md5值 
 * 6.结合base64实现md5加密 
 * 7.AES加密 
 * 8.AES加密为base 64 code 
 * 9.AES解密 
 * 10.将base 64 code AES解密 
 * @author uikoo9 
 * @version 0.0.7.20140601 
 */  
public class Aes {  
      
	public static final Logger logger = LogManager.getLogger(Aes.class.getName());

	
    public static void main(String[] args) throws Exception {
//     	  String aseKey = "1234567";
//          String imgFile = "c://hadoop-2.6.4-src.tar.gz";//待处理的图片  
//          InputStream in = null;  
//          byte[] data = null;  
//          //读取图片字节数组  
//          try   
//          {  
//              in = new FileInputStream(imgFile);          
//              data = new byte[in.available()];  
//              in.read(data);  
//              in.close();  
//          }   
//          catch (IOException e)   
//          {  
//              e.printStackTrace();  
//          }  
//          Date dt= new Date();
//          Long time= dt.getTime();
//          String  result = Base64.getEncoder().encodeToString(data);
//          Date dt1= new Date();
//          Long time1= dt1.getTime();  	  
//    	  System.out.println("加密时间"+(time1-time));
    	  
    	  
    	  //URL解密
//    	  String remark = "NXozSnBQMHdPcEdTSG01UENyQXM2ZyUzRCUzRA%3D%3D";
//    	  remark = URLDecoder.decode(remark, "utf-8");
//    	  logger.info("URL解密：" + remark);  
    	  //转JSON
//    	  JSONObject  json = Tool_Jackson.toObject(info, JSONObject.class); 
//    	  logger.info("json：" + json);
//    	  String remark = (String) json.get("remark");
//    	  remark = URLDecoder.decode(remark, "utf-8");
//    	  logger.info("URL解密：" + remark);
//    	  JSONObject  remarkjon = Tool_Jackson.toObject(remark, JSONObject.class); 
//    	  logger.info("json：" + remarkjon);
//    	  for(Entry<String, Object> entry :remarkjon.entrySet()){
//    		  logger.info(entry.getKey());
//    		  String value = (String) entry.getValue();
//    		  logger.info(value);
//    		  value = new String(Tool_Aes.base64Decode(value),"utf-8");
//    		  logger.info("BASE64转码：" + value);  
//    		  value = Tool_Aes.aesDecrypt(value, aseKey);
//    		  logger.info("AES解密：" + value);
//    		  value = Tool_Aes.base64Encode(value.getBytes("utf-8"));
//    		  logger.info("BASE64转码：" + value);
//    		  entry.setValue(value);
//    	  }
        String content = "18521524225";
        logger.info("加密前：" + content);  
  
        String key = "key";  
        logger.info("加密密钥和解密密钥：" + key);  
          
        String encrypt = aesEncrypt(content, key);  
        logger.info("aes加密后：" + encrypt); 
        
        String reContent = aesDecrypt(encrypt,key);
        logger.info("aes解密后："+reContent);
    }  
      
    /** 
     * 将byte[]转为各种进制的字符串 
     * @param bytes byte[] 
     * @param radix 可以转换进制的范围，从Character.MIN_RADIX到Character.MAX_RADIX，超出范围后变为10进制 
     * @return 转换后的字符串 
     */  
    public static String binary(byte[] bytes, int radix){  
        return new BigInteger(1, bytes).toString(radix);// 这里的1代表正数  
    }  
      
    /** 
     * base 64 encode 
     * @param bytes 待编码的byte[] 
     * @return 编码后的base 64 code 
     */  
    public static String base64Encode(byte[] bytes){  
        return  Base64.getEncoder().encodeToString(bytes);  
    }  
      
    /** 
     * base 64 decode 
     * @param base64Code 待解码的base 64 code 
     * @return 解码后的byte[] 
     * @throws Exception 
     */  
    public static byte[] base64Decode(String base64Code) throws Exception{  
        return  Base64.getDecoder().decode(base64Code);  
    }  

      
 
      
    /** 
     * AES加密 
     * @param content 待加密的内容 
     * @param encryptKey 加密密钥 
     * @return 加密后的byte[] 
     * @throws Exception 
     */  
    public static byte[] aesEncryptToBytes(String content, String encryptKey) throws Exception {  
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        SecureRandom random=SecureRandom.getInstance("SHA1PRNG");
        random.setSeed(encryptKey.getBytes("utf-8"));        
        kgen.init(128, random);  
  
        Cipher cipher = Cipher.getInstance("AES");  
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(kgen.generateKey().getEncoded(), "AES"));  
          
        return cipher.doFinal(content.getBytes("utf-8"));  
    }  
      
    /** 
     * AES加密为base 64 code 
     * @param content 待加密的内容 
     * @param encryptKey 加密密钥 
     * @return 加密后的base 64 code 
     * @throws Exception 
     */  
    public static String aesEncrypt(String content, String encryptKey) throws Exception {  
        return base64Encode(aesEncryptToBytes(content, encryptKey));  
    }  
      
    /** 
     * AES解密后加密为MD5
     * @param encryptBytes 待解密的byte[] 
     * @param decryptKey 解密密钥 
     * @return 解密后加密为MD5的String 
     * @throws Exception 
     */  
    public static String aesDecryptToMd5ByBytes(String encryptStr, String decryptKey) throws Exception {  
    	
    	byte[] encryptBytes = base64Decode(encryptStr);
    	 
    	KeyGenerator kgen = KeyGenerator.getInstance("AES");  
        SecureRandom random=SecureRandom.getInstance("SHA1PRNG");
        random.setSeed(decryptKey.getBytes("utf-8"));
        kgen.init(128, random);   
          
        Cipher cipher = Cipher.getInstance("AES");  
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(kgen.generateKey().getEncoded(), "AES"));  
        byte[] decryptBytes = cipher.doFinal(encryptBytes); 
        MessageDigest md = MessageDigest.getInstance("MD5");  
        md.update(decryptBytes);  
        return base64Encode(md.digest());  
    }  
    /** 
     * AES解密
     * @param encryptBytes 待解密的byte[] 
     * @param decryptKey 解密密钥 
     * @return 解密后加密为MD5的String 
     * @throws Exception 
     */  
    public static String aesDecryptByBytes(String encryptStr, String decryptKey) throws Exception {  
    	byte[] encryptBytes = base64Decode(encryptStr);

    	KeyGenerator kgen = KeyGenerator.getInstance("AES");  
        SecureRandom random=SecureRandom.getInstance("SHA1PRNG");
        random.setSeed(decryptKey.getBytes("utf-8"));

        kgen.init(128, random); 
          
        Cipher cipher = Cipher.getInstance("AES");  
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(kgen.generateKey().getEncoded(), "AES"));  
        byte[] decryptBytes = cipher.doFinal(encryptBytes);
        String result = new String(decryptBytes);
        return result;  
    } 
    /** 
     * 将base 64 code AES解密 
     * @param encryptStr 待解密的base 64 code 
     * @param decryptKey 解密密钥 
     * @return 解密后的string 
     * @throws Exception 
     */  
    public static String aesDecrypt(String encryptStr, String decryptKey) throws Exception {  
    	return  aesDecryptByBytes(encryptStr, decryptKey);  
    } 
    
    /** 
     * 将base 64 code AES解密 
     * @param encryptStr 待解密的base 64 code 
     * @param decryptKey 解密密钥 
     * @return 解密后的string 
     * @throws Exception 
     */  
    public static String aesDecryptToMd5(String encryptStr, String decryptKey) throws Exception {  
        return  aesDecryptToMd5ByBytes(encryptStr, decryptKey);  
    }  
    
    /** 
     * md5加密 
     * @param bytes byte[] 
     * @return md5 
     * @throws Exception 
     */  
    public static String md5(byte[] bytes) throws Exception {  
        MessageDigest md = MessageDigest.getInstance("MD5");  
        md.update(bytes);  
          
        return base64Encode(md.digest());  
    }  
    
}  