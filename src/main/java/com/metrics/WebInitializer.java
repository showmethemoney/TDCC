package com.metrics;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


/**
 * @author Ethan Lee
 */
public class WebInitializer implements WebApplicationInitializer
{

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register( AppConfig.class, WebConfig.class );
		context.setServletContext( container );

		ServletRegistration.Dynamic registration = container.addServlet( "dispatcher", new DispatcherServlet( context ) );
		registration.setLoadOnStartup( 1 );
		registration.addMapping( "/" );
	}

}
