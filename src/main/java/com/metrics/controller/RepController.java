package com.metrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.metrics.bean.RepBean;
import com.metrics.xml.message.tdcc.def.REP;
import com.metrics.xml.message.tdcc.xml.REPMessage;

/**
 * @author Ethan Lee
 */
@Controller
@RequestMapping(value = "/message/Rep")
public class RepController
{
	protected static final Logger logger = LoggerFactory.getLogger( RepController.class );
	private static final String NAMED_FORM = "/message/Rep";

	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new RepBean() );

		return NAMED_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void submit(@ModelAttribute(AbstractController.NAMED_MODEL) RepBean model) {
		try {
			REPMessage message = new REPMessage( model );

			message.setBody( new REP( model.getBody() ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
