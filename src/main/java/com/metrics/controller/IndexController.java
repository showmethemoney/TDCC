package com.metrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.metrics.bean.CloseRepoBean;

@Controller
@RequestMapping("/")
public class IndexController
{
	protected static final Logger logger = LoggerFactory.getLogger( IndexController.class );

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		logger.info( "index~" );

		return "index";
	}

//	@RequestMapping(value = "/hello", method = RequestMethod.GET)
//	public String hello(Model model) {
//		logger.info( "index~" );
//
//		model.addAttribute( "model", new CloseRepoBean() );
//
//		return "/message/index";
//	}

//	@RequestMapping(value = "/hello", method = RequestMethod.POST)
//	public String submit(@ModelAttribute(name = "model") CloseRepoBean model) {
//		
//		logger.info( "model.getRef() : {}", model.getBody().getRef() );
//		logger.info( "model.getAcctid() : {}", model.getBody().getPrty().getStlmprty().getAcctid() );
//		logger.info( "model.getAcctnm() : {}", model.getBody().getPrty().getStlmprty().getAcctnm() );
//		logger.info( "model.getInvscshacct() : {}", model.getBody().getPrty().getStlmprty().getInvscshacct() );
//		
//		
//		return "/message/index";
//	}
}
