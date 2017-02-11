package com.metrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.metrics.bean.UndwBean;
import com.metrics.xml.message.tdcc.def.UNDW;
import com.metrics.xml.message.tdcc.xml.UNDWMessage;

/**
 * @author Ethan Lee
 */
@Controller
@RequestMapping(value = "/message/Undw")
public class UndwController
{
	protected static final Logger logger = LoggerFactory.getLogger( UndwController.class );
	private static final String NAMED_FORM = "/message/Undw";

	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new UndwBean() );

		return NAMED_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void submit(@ModelAttribute(AbstractController.NAMED_MODEL) UndwBean model) {
		try {
			UNDWMessage message = new UNDWMessage();

			message.setBody( new UNDW( model.getBody() ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
