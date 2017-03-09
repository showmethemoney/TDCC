package com.metrics.mq.ibm;

import java.io.StringReader;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.MapFactoryBean;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import com.metrics.mq.activemq.JMSMessageSender;
import com.metrics.service.HistoryResponseService;
import com.metrics.xml.message.tdcc.BCSSMESSAGE;


@Component("TDCCMessageReceiver")
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
	private static Pattern PATTERN_REMOVE_MAC = Pattern.compile( "</(BCSSMESSAGE|OPCMESSAGE)>(.+)" );

	@Override
	public void onMessage(Message message) {
		try {
			String response = ((TextMessage) message).getText();
			logger.info( "receive from TDCC : {}", response );

			if (StringUtils.isBlank( response )) {
				logger.warn( "message is empty..." );
			} else {
				// 判斷有沒有帶壓碼
				Matcher matcher = PATTERN_REMOVE_MAC.matcher( response );
				if (matcher.find()) {
					String macCode = matcher.group( 2 );
					response = StringUtils.removeEnd( response, macCode );
				}

				// 判斷 是否為 OPCMessage，如果是，丟到 activemq
				// 由於 BCSSMessage 與 OPCMessage 回送同一個 queue。而 OPCMessage 是要取得資訊 for POC

				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				// ignore dtd definition in xml
				factory.setFeature( "http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false );
				factory.setFeature( "http://apache.org/xml/features/nonvalidating/load-external-dtd", false );

				DocumentBuilder builder = factory.newDocumentBuilder();

				Document document = builder.parse( new InputSource( new StringReader( response ) ) );

				// avoid java.lang.ClassCastException: com.sun.org.apache.xerces.internal.dom.DeferredDocumentTypeImpl cannot be cast to org.w3c.dom.Element
				if ("OPCMESSAGE".equalsIgnoreCase( document.getFirstChild().getNodeName() )) {
					// send to active mq
					jMSMessageSender.send( response );
				} else {
					// 抓 txnId
					XPathFactory xPathfactory = XPathFactory.newInstance();
					XPath xpath = xPathfactory.newXPath();
					XPathExpression expression = xpath.compile( "name(/BCSSMESSAGE/*)" );

					// BCSSMessage
					// String txnId = ((Element) document.getFirstChild().getFirstChild()).getTagName();
					String txnId = (String) expression.evaluate( document, XPathConstants.STRING );

					// unmarshall
					Map<Object, Object> messages = tdccMessages.getObject();

					if (messages.containsKey( txnId )) {
						//取得 Request 送過去的 SNDR_REF
						XPathExpression sndrRef = xpath.compile( "/BCSSMESSAGE/*/@SNDR_REF" );
						String requestSNDRREF = (String) sndrRef.evaluate( document, XPathConstants.STRING );
						
						JAXBContext jaxbContext = JAXBContext.newInstance( (Class) messages.get( txnId ) );
						Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
						
						BCSSMESSAGE entity = (BCSSMESSAGE) unmarshaller.unmarshal( new StringReader( response ) );

						historyResponseService.writeLog( entity, requestSNDRREF, response );
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
