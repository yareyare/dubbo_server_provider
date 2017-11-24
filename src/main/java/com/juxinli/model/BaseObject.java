package com.juxinli.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


/**
 * @ClassName: BaseObject 
 * @Description: 对象基类
 * @author ziqing.chen
 * @date 2016年11月25日 上午10:27:53 
 */
public class BaseObject extends Object implements Serializable {

	private static final long serialVersionUID = -4456349771057274767L;
	
	public Object toJson() {
		if ( this == null ) {
			return null;
		}
        return JSON.toJSON( this );
    }

    public JSONObject toJsonObject() {
		if ( this == null ) {
			return null;
		}
        return ( JSONObject ) JSONObject.toJSON( this );
    }

    public String toJsonString() {
		if ( this == null ) {
			return null;
		}
        return JSON.toJSONString( this );
    }
	
	public String toString() {
		if ( this == null ) {
			return null;
		}
		StringBuffer str = new StringBuffer();
		Class<?> cls = this.getClass();
		Method[] methods = cls.getDeclaredMethods();
		Field[] fields = cls.getDeclaredFields();
		for ( Field field : fields ) {
			try {
				String fieldType = field.getType().getSimpleName();
				String fieldGetName = parGetName( field.getName() );
				if ( !checkGetMet( methods, fieldGetName ) ) {
					continue;
				}
				Method fieldGetMet = cls.getMethod( fieldGetName,
						new Class[] {} );
				Object fieldVal = fieldGetMet.invoke( this, new Object[] {} );
				String result = null;
				if ( "Date".equals( fieldType ) ) {
					result = fmtDate( ( Date ) fieldVal );
				} else {
					if ( null != fieldVal ) {
						result = String.valueOf( fieldVal );
					}
				}
				str.append( field.getName() + ":" + result + ", " );
			} catch ( Exception e ) {
				continue;
			}
		}
		return str.toString();
	}

	public BaseHashMap<String, Object> toMap() {
		Class<?> cls = this.getClass();
		BaseHashMap<String, Object> valueMap = new BaseHashMap<String, Object>();
		Method[] methods = cls.getDeclaredMethods();
		Field[] fields = cls.getDeclaredFields();
		for ( Field field : fields ) {
			try {
				String fieldType = field.getType().getSimpleName();
				String fieldGetName = parGetName( field.getName() );
				if ( !checkGetMet( methods, fieldGetName ) ) {
					continue;
				}
				Method fieldGetMet = cls.getMethod( fieldGetName, new Class[] {} );
				Object fieldVal = fieldGetMet.invoke( this, new Object[] {} );
				String result = null;
				if ( "Date".equals( fieldType ) ) {
					result = fmtDate( ( Date ) fieldVal );
				} else {
					if ( null != fieldVal ) {
						result = String.valueOf( fieldVal );
					}
				}
				valueMap.put( field.getName(), result );
			} catch ( Exception e ) {
				continue;
			}
		}
		return valueMap;
	}

	private static String parGetName( String fieldName ) {
		if ( null == fieldName || "".equals( fieldName ) ) {
			return null;
		}
		return "get" + fieldName.substring( 0, 1 ).toUpperCase()
				+ fieldName.substring( 1 );
	}

	private static boolean checkGetMet( Method[] methods, String fieldGetMet ) {
		for ( Method met : methods ) {
			if ( fieldGetMet.equals( met.getName() ) ) {
				return true;
			}
		}
		return false;
	}
	
	private static String fmtDate( Date date ) {
		if ( null == date ) {
			return null;
		}
		try {
			SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss", Locale.US );
			return sdf.format( date );
		} catch ( Exception e ) {
			return null;
		}
	}

}
