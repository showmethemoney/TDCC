package com.metrics.mq.mock;

import javax.jms.Message;
import javax.jms.MessageListener;

@Deprecated
//@Component
public class MockMessageReceiver implements MessageListener
{
//	protected static final Logger logger = LoggerFactory.getLogger( MockMessageReceiver.class );

//	@Qualifier(MockMessageQueueConfig.NAMED_MOCK_TDCC_MESSAGE_SENDER)
//	@Autowired
//	JmsTemplate jmsTemplate;
//
//	@Override
	public void onMessage(final Message message) {
//		try {
//			logger.info( "TDCC Receive : {}", ((TextMessage) message).getText() );
//			
//			
//			jmsTemplate.send( new MessageCreator() {
//				@Override
//				public Message createMessage(Session session) throws JMSException {
//					logger.info( "TDCC Will response : {}", ((TextMessage) message).getText() );
//					return session.createTextMessage( ((TextMessage) message).getText() );
//				}
//			} );
//		} catch (Throwable cause) {
//			logger.error( cause.getMessage(), cause );
//		}
	}
}
