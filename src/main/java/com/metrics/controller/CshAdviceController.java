package com.metrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.metrics.bean.CshAdviceBean;
import com.metrics.xml.message.tdcc.def.CSHADVICE;
import com.metrics.xml.message.tdcc.xml.CSHADVICEMessage;

/**
 * @author Ethan Lee
 */
@Controller
@RequestMapping(value = "/message/CshAdvice")
public class CshAdviceController
{
	protected static final Logger logger = LoggerFactory.getLogger( CshAdviceController.class );
	private static final String NAMED_FORM = "/message/CshAdvice";

	@GetMapping
	public String view(Model model) {
		model.addAttribute( AbstractController.NAMED_MODEL, new CshAdviceController() );

		return NAMED_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void submit(@ModelAttribute(AbstractController.NAMED_MODEL) CshAdviceBean model) {
		try {
			CSHADVICEMessage message = new CSHADVICEMessage( model );

			message.setBody( new CSHADVICE( model.getBody() ) );
		} catch (Throwable cause) {
			logger.error( cause.getMessage(), cause );
		}
	}
}
