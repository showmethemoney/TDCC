package test.com.metrics.xml.message.def;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.junit.Test;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestAnnotation
{
	protected static final Logger logger = LoggerFactory.getLogger( TestAnnotation.class );

	@Test
	public void testAnnotation() {
		try {
			Reflections reflections = new Reflections( "com.metrics.xml.message" );

			Set<Class<?>> annotated = reflections.getTypesAnnotatedWith( XmlRootElement.class );

			for (Iterator<Class<?>> iterator = annotated.iterator(); iterator.hasNext();) {
				Class clazz = iterator.next();

				Field field = clazz.getDeclaredField( "body" );

				logger.info( ((XmlElement) field.getAnnotation( XmlElement.class )).name() );
			}
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
