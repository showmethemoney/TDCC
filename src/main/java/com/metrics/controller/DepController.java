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

import com.metrics.bean.DepBean;
import com.metrics.service.message.TDCCService;


/**
 * @author Ethan Lee
 */
@Controller
@RequestMapping(value = "/message/Dep")
public class DepController extends AbstractController
{
	protected static final Logger logger = LoggerFactory.getLogger( DepController.class );
	private static final String NAMED_FORM = "/message/Dep";
	@Autowired
	private TDCCService tdccService = null;
	
	@ModelAttribute
	public void getMessageTypes(Model model) {
		Map<String, String> messageTypes = new HashMap<String, String>();
		messageTypes.put( "101", "101" );

		model.addAttribute( AbstractController.NAMED_MESSAGE_TYPES, messageTypes );
	}

	@ModelAttribute
	public void getActions(Model model) {
		Map<String, String> actions = new HashMap<String, String>();
		actions.put( "DI", "送存指令" );
		actions.put( "AI", "保證/承兌/發行指令" );
		actions.put( "ADI", "無實體ABCP登錄指令" );
		actions.put( "NDI", "無實體NCD/市庫券登錄指令" );
	
		model.addAttribute( AbstractController.NAMED_ACTIONS, actions );
	}
	
	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new DepBean() );

		return NAMED_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute(AbstractController.NAMED_MODEL) DepBean model) {
		try {
			tdccService.sendDepRequest( model );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
		
		return NAMED_RESULT; 
	}
}
