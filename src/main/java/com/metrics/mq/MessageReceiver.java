package com.metrics.mq;

import java.io.StringReader;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.MapFactoryBean;
import org.springframework.stereotype.Component;

import com.metrics.xml.message.tdcc.BCSSMESSAGE;
import com.metrics.xml.message.tdcc.xml.DEPMessage;

/**
 * receive message from tdcc
 * 
 * @author ethan
 *
 */
@Component
public class MessageReceiver implements MessageListener
{
	protected static final Logger logger = LoggerFactory.getLogger( MessageReceiver.class );

	final static String PATTERN_OPC = "</BCSSMESSAGE>(.+)";
	final static String PATTERN_TOTA_TXN_ID = "<BCSSMESSAGE .*><(\\w+) ";

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
				String opcCode = null;
				String txnId = null;
				
				// 判斷有無壓碼
				Matcher opcMatcher = Pattern.compile( PATTERN_OPC ).matcher( response );
				if (opcMatcher.find()) {
					opcCode = opcMatcher.group( 1 );
				}
				
				// 取得電文代號
				Matcher totaTxnIdMatcher = Pattern.compile( PATTERN_TOTA_TXN_ID ).matcher( response );
				if (!opcMatcher.find()) {
					logger.error( "NOT Found TOTA Definition : {}", response );
				} else {
					txnId = totaTxnIdMatcher.group( 1 );
				}

				// unmarshall
				if (StringUtils.isNotBlank( opcCode )) {
					Map<Object, Object> messages = tdccMessages.getObject();

					if (messages.containsKey( txnId )) {

						JAXBContext jaxbContext = JAXBContext.newInstance( (Class) messages.get( txnId ) );

						Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
						BCSSMESSAGE entity = (BCSSMESSAGE) unmarshaller.unmarshal( new StringReader( StringUtils.removeEnd( response, opcCode ) ) );
						
						//save
					}

				}
			}
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}

}
