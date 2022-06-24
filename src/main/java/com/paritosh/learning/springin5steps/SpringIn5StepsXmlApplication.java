package com.paritosh.learning.springin5steps;

import com.paritosh.learning.springin5steps.basic.BinarySearchImpl;
import com.paritosh.learning.springin5steps.xml.XmlPersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringIn5StepsXmlApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlApplication.class);

	public static void main(String[] args) {

		try( ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			XmlPersonDao xmlPersonDao = context.getBean(XmlPersonDao.class);

			LOGGER.info("Dao :{}", xmlPersonDao);
			LOGGER.info("JDBC Connection {}", xmlPersonDao.getConnection());
		}
	}

}
