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
import com.metrics.xml.message.tdcc.def.MORTGAGERELEX;
import com.metrics.xml.message.tdcc.xml.MORTGAGERELEXMessage;

/**
 * @author Ethan Lee
 */
@Controller
@RequestMapping(value = "/message/MortgageRelex")
public class MortgageRelexController
{
	protected static final Logger logger = LoggerFactory.getLogger( MortgageRelexController.class );
	private static final String NAMED_FORM = "/message/MortgageRelex";

	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new MortgageRelexBean() );

		return NAMED_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void submit(@ModelAttribute(AbstractController.NAMED_MODEL) MortgageRelexBean model) {
		try {
			MORTGAGERELEXMessage message = new MORTGAGERELEXMessage( model );

			message.setBody( new MORTGAGERELEX( model.getBody() ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
