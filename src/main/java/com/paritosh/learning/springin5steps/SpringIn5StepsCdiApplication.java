package com.paritosh.learning.springin5steps;

import com.paritosh.learning.springin5steps.basic.BinarySearchImpl;
import com.paritosh.learning.springin5steps.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsCdiApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);
	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(SpringIn5StepsCdiApplication.class, args);

		SomeCdiBusiness someCdiBusiness = context.getBean(SomeCdiBusiness.class);

		LOGGER.info("Biz - {} ; Dao - {} ", someCdiBusiness,someCdiBusiness.getSomeCdiDao() );

	}

}
