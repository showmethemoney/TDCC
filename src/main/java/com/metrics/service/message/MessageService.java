package com.metrics.service.message;

import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageService<T>
{
	protected static final Logger logger = LoggerFactory.getLogger( MessageService.class );

	protected String marshall(T instance) {
		String result = null;

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance( instance.getClass() );
			Marshaller marshaller = jaxbContext.createMarshaller();
			// output pretty printed
			marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, false );

			Writer writer = new StringWriter();

			marshaller.marshal( instance, writer );

			result = writer.toString();
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
		
		return result;
	}

//	protected T unmarshall(String xmlString) {
//		try {
//			JAXBContext jaxbContext = JAXBContext.newInstance( T );
//
//			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//			DEPMessage customer = (DEPMessage) unmarshaller.unmarshal( new StringReader( xmlString ) );
//		} catch (Throwable cause) {}
//	}
}
