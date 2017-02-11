package com.metrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.metrics.bean.SecBlkBean;
import com.metrics.xml.message.tdcc.def.SECBLK;
import com.metrics.xml.message.tdcc.xml.SECBLKMessage;

/**
 * @author Ethan Lee
 */
@Controller
@RequestMapping(value = "/message/SecBlk")
public class SecBlkController
{
	protected static final Logger logger = LoggerFactory.getLogger( SecBlkController.class );
	private static final String NAMED_FORM = "/message/SecBlk";

	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new SecBlkBean() );

		return NAMED_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void submit(@ModelAttribute(AbstractController.NAMED_MODEL) SecBlkBean model) {
		try {
			SECBLKMessage message = new SECBLKMessage();

			message.setBody( new SECBLK( model.getBody() ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
