package com.metrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.metrics.bean.SecStlmBean;
import com.metrics.service.message.OXMService;
import com.metrics.xml.message.tdcc.def.SECSTLM;
import com.metrics.xml.message.tdcc.xml.SECSTLMMessage;

/**
 * @author Ethan Lee
 */
@Controller
@RequestMapping(value = "/message/SecStlm")
public class SecStlmController
{
	protected static final Logger logger = LoggerFactory.getLogger( SecStlmController.class );
	private static final String NAMED_FORM = "/message/SecStlm";
	@Autowired
	private OXMService oxmService = null;
	
	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new SecStlmBean() );

		return NAMED_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void submit(@ModelAttribute(AbstractController.NAMED_MODEL) SecStlmBean model) {
		try {
			SECSTLMMessage message = new SECSTLMMessage( model );

			message.setBody( new SECSTLM( model.getBody() ) );
			
			logger.info( "{}", oxmService.marshall( message ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
