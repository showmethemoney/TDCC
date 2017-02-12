package com.metrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.metrics.bean.ErinstBean;
import com.metrics.xml.message.tdcc.def.ERINST;
import com.metrics.xml.message.tdcc.xml.ERINSTMessage;

/**
 * @author Ethan Lee
 */
@Controller
@RequestMapping(value = "/message/Erinst")
public class ErinstController
{
	protected static final Logger logger = LoggerFactory.getLogger( ErinstController.class );
	private static final String NAMED_FORM = "/message/Erinst";

	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new ErinstBean() );

		return NAMED_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void submit(@ModelAttribute(AbstractController.NAMED_MODEL) ErinstBean model) {
		try {
			ERINSTMessage message = new ERINSTMessage( model );

			message.setBody( new ERINST( model.getBody() ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
