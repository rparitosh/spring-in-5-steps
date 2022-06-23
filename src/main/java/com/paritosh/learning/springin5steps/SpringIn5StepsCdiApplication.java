package com.paritosh.learning.springin5steps;

import com.paritosh.learning.springin5steps.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan

public class SpringIn5StepsCdiApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);
	public static void main(String[] args) {


		ApplicationContext context = new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class);

		SomeCdiBusiness someCdiBusiness = context.getBean(SomeCdiBusiness.class);

		LOGGER.info("Biz - {} ; Dao - {} ", someCdiBusiness,someCdiBusiness.getSomeCdiDao() );

	}

}
