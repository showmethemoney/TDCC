package com.metrics.controller;

import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

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
import com.metrics.service.message.OXMService;
import com.metrics.xml.message.tdcc.def.CLOSEREPO;
import com.metrics.xml.message.tdcc.def.PRTY;
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
	@Autowired
	private OXMService oxmService = null;
	
	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new CloseRepoBean() );

		return NAMED_FORM;
	}

	@PostMapping
	public void submit(@ModelAttribute(AbstractController.NAMED_MODEL) CloseRepoBean model) {
		try {
			CLOSEREPOMessage message = new CLOSEREPOMessage( model );
				
			logger.info( "model.getBody().getPrty().getStlmprty().getAcctid() : {}", model.getBody().getPrty().getStlmprty().getAcctid() );
			logger.info( "model.getBody().getPrty().getStlmprty().getAcctnm() : {}", model.getBody().getPrty().getStlmprty().getAcctnm() );
			logger.info( "model.getBody().getPrty().getStlmprty().getInvscshacct() : {}", model.getBody().getPrty().getStlmprty().getInvscshacct() );
			logger.info( "model.getBody().getPrty().getStlmprty().getPrtyid() : {}", model.getBody().getPrty().getStlmprty().getPrtyid() );
			
			CLOSEREPO closeRepo = new CLOSEREPO( model.getBody() );
			
			logger.info( "closeRepo.getItems().size() : ", closeRepo.getItems().size() );
			
			for(Object obj : closeRepo.getItems()){
				if (obj instanceof PRTY) {
					PRTY prty = (PRTY) obj;
					
					logger.info( "prty.getSTLMPRTY().size() : {}", prty.getSTLMPRTY().size() );
					logger.info( "prty.getSTLMPRTY().get( 0 ).getACCTID() : {}", prty.getSTLMPRTY().get( 0 ).getACCTID() );
					logger.info( "prty.getSTLMPRTY().get( 0 ).getACCTNM() : {}", prty.getSTLMPRTY().get( 0 ).getACCTNM() );
					logger.info( "prty.getSTLMPRTY().get( 0 ).getINVSCSHACCT() : {}", prty.getSTLMPRTY().get( 0 ).getINVSCSHACCT() );
					logger.info( "prty.getSTLMPRTY().get( 0 ).getPRTYID() : {}", prty.getSTLMPRTY().get( 0 ).getPRTYID() );
				}
			}
			
			message.setBody( closeRepo );
			
			logger.info( "{}", oxmService.marshall( message ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
