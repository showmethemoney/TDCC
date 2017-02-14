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

import com.metrics.bean.ModRepoBean;
import com.metrics.service.TDCCService;


/**
 * @author Ethan Lee
 */
@Controller
@RequestMapping(value = "/message/ModRepo")
public class ModRepoController
{
	protected static final Logger logger = LoggerFactory.getLogger( ModRepoController.class );
	private static final String NAMED_FORM = "/message/ModRepo";
	@Autowired
	private TDCCService tdccService = null;

	@GetMapping
	public String view(Model model) {
		Map<String, String> messageTypes = new HashMap<String, String>();
		messageTypes.put( "303", "303" );

		Map<String, String> actions = new HashMap<String, String>();
		actions.put( "RCMI ", "RCMI" );

		model.addAttribute( AbstractController.NAMED_MESSAGE_TYPES, messageTypes );
		model.addAttribute( AbstractController.NAMED_ACTIONS, actions );
		model.addAttribute( AbstractController.NAMED_MODEL, new ModRepoBean() );

		return NAMED_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void submit(@ModelAttribute(AbstractController.NAMED_MODEL) ModRepoBean model) {
		try {
			tdccService.sendModRepoRequest( model );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
