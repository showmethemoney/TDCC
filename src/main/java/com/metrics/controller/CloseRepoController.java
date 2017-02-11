package com.metrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.metrics.bean.CloseRepo;
import com.metrics.bean.CloseRepoBean;
import com.metrics.xml.message.tdcc.def.CLOSEREPO;
import com.metrics.xml.message.tdcc.xml.CLOSEREPOMessage;

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

	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new CloseRepoBean() );

		return NAMED_FORM;
	}

	@PostMapping
	public void submit(@ModelAttribute(AbstractController.NAMED_MODEL) CloseRepoBean model) {
		try {
			CLOSEREPOMessage message = new CLOSEREPOMessage();
			
			message.setBody(  new CLOSEREPO( model.getBody() ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}

//		CLOSEREPO body = new CLOSEREPO();
//
//		logger.info( "model.getBody().getRef : {}", model.getBody().getRef() );
//		logger.info( "model.getBody().getCntrid : {}", model.getBody().getCntrid() );
//		logger.info( "model.getBody().getPrty().getStlmprty().getPrtyid : {}", model.getBody().getPrty().getStlmprty().getPrtyid() );
	}
}
