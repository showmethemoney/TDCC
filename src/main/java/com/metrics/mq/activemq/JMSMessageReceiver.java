package com.metrics.mq.activemq;

import java.io.StringReader;
import java.util.Map;

import javax.jms.Message;
import javax.jms.TextMessage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.MapFactoryBean;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

import com.metrics.mq.MessageReceiver;
import com.metrics.service.HistoryResponseService;
import com.metrics.xml.message.tdcc.BCSSMESSAGE;


/**
 * receive message from tdcc
 * 
 * @author ethan
 *
 */
//@Component("JMSMessageReceiver")
public class JMSMessageReceiver implements MessageReceiver
{
	protected static final Logger logger = LoggerFactory.getLogger( JMSMessageReceiver.class );

	// final static String PATTERN_OPC = "</BCSSMESSAGE>(.+)";
	@Autowired
	HistoryResponseService historyResponseService = null;
	@Qualifier("tdccMessages")
	@Autowired
	MapFactoryBean tdccMessages = null;

	@Override
	public void onMessage(Message message) {
		try {
			String response = ((TextMessage) message).getText();
			logger.info( "receive from TDCC : {}", response );

			if (StringUtils.isBlank( response )) {
				// todo
			} else {
//				String opcCode = null;
				// Matcher opcMatcher = Pattern.compile( PATTERN_OPC ).matcher( response );
				// if (opcMatcher.find()) {
				// opcCode = opcMatcher.group( 1 );
				// }
				// if (StringUtils.isNotBlank( opcCode )) {
				// response = StringUtils.removeEnd( response, opcCode );
				// }

				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();

				Document document = builder.parse( new InputSource( new StringReader( response ) ) );

				String txnId = ((Element) document.getFirstChild().getFirstChild()).getTagName();

				// unmarshall
				Map<Object, Object> messages = tdccMessages.getObject();

				if (messages.containsKey( txnId )) {

					JAXBContext jaxbContext = JAXBContext.newInstance( (Class) messages.get( txnId ) );

					Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
					BCSSMESSAGE entity = (BCSSMESSAGE) unmarshaller.unmarshal( new StringReader( response ) );

					historyResponseService.writeLog( entity, response );
				}
			}
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

}
