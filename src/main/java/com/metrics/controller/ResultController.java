package com.metrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.metrics.service.ResultService;


@Controller
@RequestMapping(value = "/message/Result")
public class ResultController extends AbstractController
{
	protected static final Logger logger = LoggerFactory.getLogger( ResultController.class );
	private static final String NAMED_FORM = "/message/Result";
	@Autowired
	private ResultService resultService = null;

	@RequestMapping(method = { RequestMethod.GET, RequestMethod.POST })
	public String query(Model model) {

		model.addAttribute( NAMED_MODEL, resultService.selectResult() );

		return NAMED_FORM;
	}
}
