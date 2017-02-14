package com.metrics.mq;

import javax.jms.JMSException;

import org.springframework.jms.JmsException;


public interface MessageSender
{
	public void send(final String context) throws JmsException, JMSException;

}
