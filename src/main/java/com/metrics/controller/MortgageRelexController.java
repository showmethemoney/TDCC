package com.metrics.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.metrics.bean.MortgageRelexBean;
import com.metrics.service.TDCCService;


/**
 * @author Ethan Lee
 */
@Controller
@RequestMapping(value = "/message/MortgageRelex")
public class MortgageRelexController
{
	protected static final Logger logger = LoggerFactory.getLogger( MortgageRelexController.class );
	private static final String NAMED_FORM = "/message/MortgageRelex";
	@Autowired
	private TDCCService tdccService = null;

	@GetMapping
	public String view(Model model) {
		Map<String, String> messageTypes = new HashMap<String, String>();
		messageTypes.put( "202", "202" );

		Map<String, String> actions = new HashMap<String, String>();
		actions.put( "MR", "MR" );
		actions.put( "MEI", "MEI" );

		model.addAttribute( AbstractController.NAMED_MESSAGE_TYPES, messageTypes );
		model.addAttribute( AbstractController.NAMED_ACTIONS, actions );
		model.addAttribute( AbstractController.NAMED_MODEL, new MortgageRelexBean() );

		return NAMED_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void submit(@ModelAttribute(AbstractController.NAMED_MODEL) MortgageRelexBean model) {
		try {
			tdccService.sendMortgageRelexRequest( model );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
