package com.metrics;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.MapFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class OXMConfig
{
	protected static final Logger logger = LoggerFactory.getLogger( OXMConfig.class );
	private static final String NAMED_REFLECTION_TDCC_MESSAGE_PACKAGE = "com.metrics.xml.message.tdcc.xml";
	
	@Bean
	public Jaxb2Marshaller getCastorMarshaller() {
		Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
		jaxb2Marshaller.setPackagesToScan( "com.metrics.xml.message" );
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put( "jaxb.formatted.output", false );
		jaxb2Marshaller.setMarshallerProperties( map );
		
		return jaxb2Marshaller;
	}

	/**
	 * scan com.metrics.xml.message and sub-package for all java classes include @XmlRootElemnt annotation and field name "body" with @XmlElement annotation 
	 * get the XmlElement declared name, Class and put them into HashMap
	 * 
	 * @return
	 */
	@Bean(name = "tdccMessages")
	public MapFactoryBean reflectionMessages() {
		MapFactoryBean result = new MapFactoryBean();

		try {
			Map<String, Class> messages = new HashMap<String, Class>();

			Reflections reflections = new Reflections( NAMED_REFLECTION_TDCC_MESSAGE_PACKAGE );

			Set<Class<?>> annotated = reflections.getTypesAnnotatedWith( XmlRootElement.class );

			for (Iterator<Class<?>> iterator = annotated.iterator(); iterator.hasNext();) {
				Class<?> clazz = iterator.next();

				Field field = clazz.getDeclaredField( "body" );
				if (null != field) {
					messages.put( ((XmlElement) field.getAnnotation( XmlElement.class )).name(), clazz );
				}
			}

			result.setTargetMapClass( HashMap.class );
			result.setSourceMap( messages );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return result;
	}
}
