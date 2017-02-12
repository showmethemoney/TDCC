package com.metrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.metrics.bean.ModRepoBean;
import com.metrics.xml.message.tdcc.def.MODREPO;
import com.metrics.xml.message.tdcc.xml.MODREPOMessage;

/**
 * @author Ethan Lee 
 */
@Controller
@RequestMapping(value = "/message/ModRepo")
public class ModRepoController
{
	protected static final Logger logger = LoggerFactory.getLogger( ModRepoController.class );
	private static final String NAMED_FORM = "/message/ModRepo";

	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new ModRepoBean() );

		return NAMED_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void submit(@ModelAttribute(AbstractController.NAMED_MODEL) ModRepoBean model) {
		try {
			MODREPOMessage message = new MODREPOMessage( model );

			message.setBody( new MODREPO( model.getBody() ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
