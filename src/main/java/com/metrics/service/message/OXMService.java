package com.metrics.service.message;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Calendar;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.lang.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;

import com.metrics.xml.message.opc.OPCMESSAGE;
import com.metrics.xml.message.tdcc.BCSSMESSAGE;

@Component
public class OXMService
{
	protected static final Logger logger = LoggerFactory.getLogger( OXMService.class );
	private static final String FORMAT_TIMESTAMP = "yyyy-MM-dd'T'hh:mm:ss";
	private static final String FORMAT_BCSS_BUSINESS_DATE = "yyyy-MM-dd";
	
	@Autowired
	private Jaxb2Marshaller marshaller = null;
	
	public String marshallOPCMessage(OPCMESSAGE instance) {
		
		return marshall( instance );
	}
	
	public String marshallBCSSMessage(BCSSMESSAGE instance) {
		Calendar calendar = Calendar.getInstance();
		instance.setTS( DateFormatUtils.format( calendar, FORMAT_TIMESTAMP ) );
		instance.setBCSSBUSDT( DateFormatUtils.format( calendar, FORMAT_BCSS_BUSINESS_DATE ) );
		
		// todo 是否要壓碼 
		// 除交割狀態通知訊息(訊息代號002、012、032及040)不押碼外，其他訊息皆須押碼
		
		return marshall( instance );
	}
	
	public <T extends Object> T unMarshallBCSSMessage(T refenceObj, String xmlString) {
		return unmarshall( refenceObj, xmlString );
	}
	
	protected String marshall(Object instance) {
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
