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

import com.metrics.bean.OpenRepoBean;
import com.metrics.service.message.OXMService;
import com.metrics.xml.message.tdcc.def.OPENREPO;
import com.metrics.xml.message.tdcc.xml.OPENREPOMessage;

/**
 * @author Ethan Lee
 */
@Controller
@RequestMapping(value = "/message/OpenRepo")
public class OpenRepoController
{
	protected static final Logger logger = LoggerFactory.getLogger( OpenRepoController.class );
	private static final String NAMED_FORM = "/message/OpenRepo";
	@Autowired
	private OXMService oxmService = null;
	
	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new OpenRepoBean() );

		return NAMED_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void submit(@ModelAttribute(AbstractController.NAMED_MODEL) OpenRepoBean model) {
		try {
			OPENREPOMessage message = new OPENREPOMessage( model );

			message.setBody( new OPENREPO( model.getBody() ) );
			
			logger.info( "{}", oxmService.marshall( message ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
