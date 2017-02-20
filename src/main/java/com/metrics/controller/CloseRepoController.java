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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.metrics.bean.CloseRepoBean;
import com.metrics.service.message.TDCCService;

/**
 * @author Ethan Lee
 * 
 */
@Controller
@RequestMapping(value = "/message/CloseRepo")
public class CloseRepoController extends AbstractController
{
	protected static final Logger logger = LoggerFactory.getLogger( CloseRepoController.class );
	private static final String NAMED_FORM = "/message/CloseRepo";
	@Autowired
	private TDCCService tdccService = null;

	@ModelAttribute
	public void getMessageTypes(Model model) {
		Map<String, String> messageTypes = new HashMap<String, String>();
		messageTypes.put( "302", "302" );
		
		model.addAttribute( AbstractController.NAMED_MESSAGE_TYPES, messageTypes );
	}

	@ModelAttribute
	public void getActions(Model model) {
		Map<String, String> actions = new HashMap<String, String>();
		actions.put( "RCI", "附條件交易到期履約指令" );
		
		model.addAttribute( AbstractController.NAMED_ACTIONS, actions );
	}

	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new CloseRepoBean() );

		return NAMED_FORM;
	}

	@PostMapping
	public String submit(@ModelAttribute(AbstractController.NAMED_MODEL) CloseRepoBean model) {
		try {
			tdccService.sendCloseRepoRequest( model );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
		
		return NAMED_REDIRECT_RESULT;
	}
}
