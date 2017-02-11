package com.metrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.metrics.bean.DepBean;
import com.metrics.xml.message.tdcc.def.DEP;
import com.metrics.xml.message.tdcc.xml.DEPMessage;

/**
 * @author Ethan Lee 
 */
@Controller
@RequestMapping(value = "/message/Dep")
public class DepController
{
	protected static final Logger logger = LoggerFactory.getLogger( DepController.class );
	private static final String NAMED_FORM = "/message/Dep";

	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new DepBean() );

		return NAMED_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void submit(@ModelAttribute(AbstractController.NAMED_MODEL) DepBean model) {
		try {
			DEPMessage message = new DEPMessage();

			message.setBody( new DEP( model.getBody() ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
