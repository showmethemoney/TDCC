package com.metrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.metrics.bean.MortgageRelexBean;
import com.metrics.bean.OpenRepoBean;
import com.metrics.bean.ReiInstBean;
import com.metrics.xml.message.tdcc.def.OPENREPO;
import com.metrics.xml.message.tdcc.def.REIINST;
import com.metrics.xml.message.tdcc.xml.OPENREPOMessage;
import com.metrics.xml.message.tdcc.xml.REIINSTMessage;

/**
 * @author Ethan Lee 
 */
@Controller
@RequestMapping(value = "/message/ReiInst")
public class ReiInstController
{
	protected static final Logger logger = LoggerFactory.getLogger( ReiInstController.class );
	private static final String NAMED_FORM = "/message/ReiInst";

	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new ReiInstBean() );

		return NAMED_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void submit(@ModelAttribute(AbstractController.NAMED_MODEL) ReiInstBean model) {
		try {
			REIINSTMessage message = new REIINSTMessage();

			message.setBody( new REIINST( model.getBody() ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
