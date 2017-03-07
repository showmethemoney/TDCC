package com.metrics.utils;

import java.lang.reflect.Method;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 判斷 ELEMENT 裡面所有 ATTRIBUTES 是否為 empty, "" or " "，* 如果是則回傳 null
 * @author ethan.lee
 *
 */
public class EmptyObjectUtil
{
	protected static final Logger logger = LoggerFactory.getLogger( EmptyObjectUtil.class );
	
	public static Object isEmptyObject(Object instance) {
		Object result = null;
		
		for (Method method : instance.getClass().getMethods()) {
			String name = method.getName();
			
			if (name.startsWith( "get" ) && !name.equalsIgnoreCase( "getClass" )) {
				String value = "";

				try {
					value = (String) method.invoke( instance );
					
					if (StringUtils.isNotBlank( value )) {
						result = instance;
						break;
					}
				} catch (Throwable cause) {
					logger.error( cause.getMessage(), cause );
				}
			}
		}
		
		return result;
	} 
}
