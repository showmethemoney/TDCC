package com.metrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Ethan Lee 
 */
@Controller
@RequestMapping(value = "/message/MortgageRegex")
public class MortgageRegexController
{
	protected static final Logger logger = LoggerFactory.getLogger( MortgageRegexController.class );

	@RequestMapping(method = RequestMethod.GET)
	public void view() {}

	@RequestMapping(method = RequestMethod.POST)
	public void submit() {}
}
