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

import com.metrics.bean.CshAdviceBean;
import com.metrics.service.message.TDCCService;

/**
 * @author Ethan Lee
 */
@Controller
@RequestMapping(value = "/message/CshAdvice")
public class CshAdviceController extends AbstractController
{
	protected static final Logger logger = LoggerFactory.getLogger( CshAdviceController.class );
	private static final String NAMED_FORM = "/message/CshAdvice";
	@Autowired
	private TDCCService tdccService = null;
	
	@ModelAttribute
	public void getMessageTypes(Model model) {
		Map<String, String> messageTypes = new HashMap<String, String>();
		messageTypes.put( "003", "003" );

		model.addAttribute( AbstractController.NAMED_MESSAGE_TYPES, messageTypes );
	}

	@ModelAttribute
	public void getActions(Model model) {
		Map<String, String> actions = new HashMap<String, String>();
		actions.put( "RDM", "兌償入帳通知" );
		actions.put( "BC", "退票通知" );
		actions.put( "CNSG", "代銷費入帳通知" );
		actions.put( "RRM", "退票重提示兌償通知" );
		actions.put( "RBC", "退票重提示退票通知" );
	
		model.addAttribute( AbstractController.NAMED_ACTIONS, actions );
	}
	
	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new CshAdviceBean() );

		return NAMED_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute(AbstractController.NAMED_MODEL) CshAdviceBean model) {
		try {
			tdccService.sendCshAdviceRequest( model );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
		
		return NAMED_RESULT; 
	}
}
