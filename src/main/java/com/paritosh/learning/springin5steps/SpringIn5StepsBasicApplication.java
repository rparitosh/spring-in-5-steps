package com.paritosh.learning.springin5steps;

import com.paritosh.learning.springin5steps.basic.BinarySearchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsBasicApplication.class);

	public static void main(String[] args) {

		try( AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)) {
			BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);

			System.out.println(binarySearch);
			LOGGER.info("{}", binarySearch);
		}
	}

}
