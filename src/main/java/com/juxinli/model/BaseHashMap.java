package com.juxinli.model;

import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: BaseHashMap
 * @Description: HashMap基类
 * @author ziqing.chen
 * @date 2016年11月25日 上午11:37:06
 * @param <K>
 * @param <V>
 */
public class BaseHashMap<K, V> extends HashMap<K, V> {

	private static final long serialVersionUID = 8752416765899354759L;

	public BaseHashMap() {
		super();
	}

	public BaseHashMap(Map< K, V > m ) {
		super( m );
	}
	
	public String toUrlParams() {
		StringBuffer _PARAMS = new StringBuffer();
		for ( Entry<K, V> _ENTRY : this.entrySet() ) {
			_PARAMS.append( _ENTRY.getKey() + "=" + _ENTRY.getValue() + "&" );
		}
		return _PARAMS.toString().substring( 0, _PARAMS.length() - 1 );
	}

	public Object toObject( Class<?> beanClass ) throws BaseException {
		try {
			Object obj = beanClass.newInstance();
			Field[] fields = obj.getClass().getDeclaredFields();
			for ( Field field : fields ) {
				int mod = field.getModifiers();
				if ( Modifier.isStatic( mod ) || Modifier.isFinal( mod ) ) {
					continue;
				}
				field.setAccessible( true );
				field.set( obj, this.get( field.getName() ) );
			}
			return obj;
		} catch ( InstantiationException e ) {
			throw new BaseException( e );
		} catch ( IllegalAccessException e ) {
			throw new BaseException( e );
		}
	}

	@Override
	public String toString() {
		StringBuffer _toStr = new StringBuffer();
		for ( Entry<K, V> entry : this.entrySet() ) {
			_toStr.append( entry.getKey() + " : " + entry.getValue() + ", " );
		}
		return _toStr.toString();
	}

	@SuppressWarnings( "unchecked" )
	public JSONObject toJsonObject() {
		return new JSONObject( ( Map<String, Object> ) this );
	}

}
