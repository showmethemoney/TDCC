package com.metrics.mq.ibm;

import java.io.StringReader;
import java.util.Map;

import javax.jms.Message;
import javax.jms.MessageListener;
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
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

import com.metrics.mq.activemq.JMSMessageSender;
import com.metrics.service.HistoryResponseService;
import com.metrics.xml.message.tdcc.BCSSMESSAGE;

@Component
public class TDCCMessageReceiver implements MessageListener
{
	protected static final Logger logger = LoggerFactory.getLogger( TDCCMessageReceiver.class );
	@Qualifier("tdccMessages")
	@Autowired
	private MapFactoryBean tdccMessages = null;
	@Autowired
	private JMSMessageSender jMSMessageSender = null;
	@Autowired
	private HistoryResponseService historyResponseService = null;

	@Override
	public void onMessage(Message message) {
		try {
			String response = ((TextMessage) message).getText();
			logger.info( "receive from TDCC : {}", response );

			if (StringUtils.isBlank( response )) {
				logger.warn( "message is empty..." );
			} else {
				// 判斷 是否為 OPCMessage，如果是，丟到 activemq
				// 由於 BCSSMessage 與 OPCMessage 回送同一個 queue。而 OPCMessage 是要取得資訊 for POC

				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();

				Document document = builder.parse( new InputSource( new StringReader( response ) ) );

				if ("OPCMESSAGE".equalsIgnoreCase( ((Element) document.getFirstChild()).getTagName() )) {
					// send to active mq 
					jMSMessageSender.send( response );
				} else {
					// BCSSMessage
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

				// DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				// DocumentBuilder builder = factory.newDocumentBuilder();
				//
				// Document document = builder.parse( new InputSource( new StringReader( response ) ) );
				//
				// String txnId = ((Element) document.getFirstChild().getFirstChild()).getTagName();
				//
				// // unmarshall
				// Map<Object, Object> messages = tdccMessages.getObject();
				//
				// if (messages.containsKey( txnId )) {
				//
				// JAXBContext jaxbContext = JAXBContext.newInstance( (Class) messages.get( txnId ) );
				//
				// Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
				// BCSSMESSAGE entity = (BCSSMESSAGE) unmarshaller.unmarshal( new StringReader( response ) );
				//
				// historyResponseService.writeLog( entity, response );
				// }
			}
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

}
