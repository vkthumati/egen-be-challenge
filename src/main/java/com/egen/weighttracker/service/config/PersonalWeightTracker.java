package com.egen.weighttracker.service.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@ComponentScan(basePackages={"com.egen.weighttracker.service"})
public class PersonalWeightTracker {

	public static void main(String[] args) {
		SpringApplication.run(PersonalWeightTracker.class, args);
	}

	/**
	 * This is the base URL which will be exposed for REST Service.
	 *
	 * @param applicationContext
	 * @return
	 */
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		DispatcherServlet servlet = new DispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		return new ServletRegistrationBean(servlet, "/PersonalWeightTracker/*");
	}

}
