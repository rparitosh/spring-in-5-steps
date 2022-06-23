package com.paritosh.learning.springin5steps;

import com.paritosh.learning.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.paritosh.learning.componentscan")
public class SpringIn5StepsComponentApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentApplication.class);

    public static void main(String[] args){



        ApplicationContext context = new AnnotationConfigApplicationContext(SpringIn5StepsComponentApplication.class);


        ComponentDAO componentDAO = context.getBean(ComponentDAO.class);

        LOGGER.info("Comp DAO : {}", componentDAO);

    }
}
