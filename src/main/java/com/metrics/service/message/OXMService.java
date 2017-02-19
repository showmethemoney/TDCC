package com.metrics.service.message;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;

import com.metrics.OXMConfig;
import com.metrics.utils.OpcMacUtil;
import com.metrics.xml.message.opc.OPCMESSAGE;
import com.metrics.xml.message.tdcc.BCSSMESSAGE;

@Component
public class OXMService
{
	protected static final Logger logger = LoggerFactory.getLogger( OXMService.class );
	@Autowired
	private OpcMacUtil opcMacUtil = null;
	@Autowired
	private Jaxb2Marshaller marshaller = null;

	public String marshallOPCMessage(OPCMESSAGE instance) {
		return marshall( instance );
	}

	public String marshallBCSSMessage(BCSSMESSAGE instance) {
		String result = null;

		try {
			result = marshall( instance );
			
			// 除交割狀態通知訊息(訊息代號002、012、032及040)不押碼外，其他訊息皆須押碼。
			if (!"002".equalsIgnoreCase( instance.getMSGTYPE() ) || !"012".equalsIgnoreCase( instance.getMSGTYPE() )
			        || !"040".equalsIgnoreCase( instance.getMSGTYPE() )) {
				result = result + opcMacUtil.generateMAC( result.getBytes( OXMConfig.DEFUALT_ENCODING ) );			}
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

		return result;
	}

	public <T extends Object> T unMarshallOPCMessage(T refenceObj, String xmlString) {
		return unmarshall( refenceObj, xmlString );
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
