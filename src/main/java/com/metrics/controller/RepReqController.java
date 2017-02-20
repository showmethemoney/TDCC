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

import com.metrics.bean.RepReqBean;
import com.metrics.service.message.TDCCService;


/**
 * @author Ethan Lee
 */
@Controller
@RequestMapping(value = "/message/RepReq")
public class RepReqController extends AbstractController
{
	protected static final Logger logger = LoggerFactory.getLogger( RepReqController.class );
	private static final String NAMED_FORM = "/message/RepReq";
	@Autowired
	private TDCCService tdccService = null;

	@ModelAttribute
	public void getMessageTypes(Model model) {
		Map<String, String> messageTypes = new HashMap<String, String>();
		messageTypes.put( "005", "005" );
	
		model.addAttribute( AbstractController.NAMED_MESSAGE_TYPES, messageTypes );
	}

	@ModelAttribute
	public void getActions(Model model) {
		Map<String, String> actions = new HashMap<String, String>();
		actions.put( "RPRQ", "報表查詢指令" );
		
		model.addAttribute( AbstractController.NAMED_ACTIONS, actions );
	}
	
	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new RepReqBean() );

		return NAMED_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute(AbstractController.NAMED_MODEL) RepReqBean model) {
		try {
			tdccService.sendRepReqRequest( model );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
		
		return NAMED_RESULT; 
	}
}
