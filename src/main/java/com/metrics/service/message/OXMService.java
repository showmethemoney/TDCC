package com.metrics.service.message;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;

import com.metrics.xml.message.tdcc.BCSSMESSAGE;
import com.metrics.xml.message.tdcc.xml.DEPMessage;

@Component
public class OXMService
{
	protected static final Logger logger = LoggerFactory.getLogger( OXMService.class );

	@Autowired
	private Jaxb2Marshaller marshaller = null;

	public String marshall(Object instance) {
		String result = null;

		try {
			// JAXBContext jaxbContext = JAXBContext.newInstance( instance.getClass() );
			// Marshaller marshaller = jaxbContext.createMarshaller();
			// output pretty printed
			// marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, false );

			Writer writer = new StringWriter();

			marshaller.marshal( instance, new StreamResult( writer ) );

			result = writer.toString();
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return result;
	}

	protected <T extends Object> T unmarshall(T refenceObj, String xmlString) {
		T result = null;

		try {
			marshaller.setMappedClass( refenceObj.getClass() );
			result = (T) marshaller.unmarshal( new StreamSource( new StringReader( xmlString ) ) );

			// JAXBContext jaxbContext = JAXBContext.newInstance( T );
			//
			// Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			// DEPMessage customer = (DEPMessage) unmarshaller.unmarshal( new StringReader( xmlString ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return result;
	}
}
