package com.metrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.metrics.bean.ConsigntInst;
import com.metrics.bean.ConsigntInstBean;
import com.metrics.xml.message.tdcc.def.CONSIGNTINST;
import com.metrics.xml.message.tdcc.xml.CONSIGNTINSTMessage;

/**
 * @author Ethan Lee
 */
@Controller
@RequestMapping(value = "/message/ConsigntInst")
public class ConsigntInstController
{
	protected static final Logger logger = LoggerFactory.getLogger( ConsigntInstController.class );
	private static final String NAMED_FORM = "/message/ConsigntInst";

	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new ConsigntInstBean() );

		return NAMED_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void submit(@ModelAttribute(AbstractController.NAMED_MODEL) ConsigntInstBean model) {
		try {
			CONSIGNTINSTMessage message = new CONSIGNTINSTMessage();

			message.setBody( new CONSIGNTINST( model.getBody() ) ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
