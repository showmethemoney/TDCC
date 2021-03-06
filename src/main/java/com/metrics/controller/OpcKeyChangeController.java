package com.metrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.formosoft.ra.taica2.RAFacade2;
import com.metrics.service.message.opc.OpcKeyChangeService;

@Controller
@RequestMapping("/message/OpcKeyChange")
public class OpcKeyChangeController
{
	protected static final Logger logger = LoggerFactory.getLogger( OpcKeyChangeController.class );
	@Autowired
	private OpcKeyChangeService opcKeyChangeService = null;
	
	@GetMapping
	public String view() {
		return "/message/OpcKeyChange";
	}
	
	@PostMapping
	public void submit() {
		opcKeyChangeService.start();
	}
}
