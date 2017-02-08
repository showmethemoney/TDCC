package com.metrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		logger.info( "index~" );

		return "index";
	}
}
