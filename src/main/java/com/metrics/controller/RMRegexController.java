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
import com.metrics.bean.RMRegexBean;
import com.metrics.service.message.TDCCService;

@Controller
@RequestMapping(value = "/message/RMRegex")
public class RMRegexController extends AbstractController
{
	protected static final Logger logger = LoggerFactory.getLogger( RMRegexController.class );
	private static final String NAMED_FORM = "/message/RMRegex";
	@Autowired
	private TDCCService tdccService = null;

	@ModelAttribute
	public void getMessageTypes(Model model) {
		Map<String, String> messageTypes = new HashMap<String, String>();
		messageTypes.put( "205", "205" );
		
		model.addAttribute( AbstractController.NAMED_MESSAGE_TYPES, messageTypes );
	}

	@ModelAttribute
	public void getActions(Model model) {
		Map<String, String> actions = new HashMap<String, String>();
		actions.put( "RMRI", "附條件質權設定指令" );
		
		model.addAttribute( AbstractController.NAMED_ACTIONS, actions );
	}

	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new RMRegexBean() );

		return NAMED_FORM;
	}

	@PostMapping
	public String submit(@ModelAttribute(AbstractController.NAMED_MODEL) RMRegexBean model) {
		try {
			tdccService.sendRMRegexRequest( model );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
		
		return NAMED_FORWARD_RESULT;
	}
}
