package com.metrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/message/result")
public class ResultController
{
	protected static final Logger logger = LoggerFactory.getLogger( ResultController.class );
	private static final String NAMED_FORM = "/message/Result";

	@RequestMapping(method = { RequestMethod.GET, RequestMethod.POST })
	public String query(Model model) {
		
		
		
		return NAMED_FORM;
	}
}
