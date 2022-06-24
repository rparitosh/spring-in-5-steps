package com.paritosh.learning.springin5steps;

import com.paritosh.learning.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

    public static void main(String[] args){



        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class)) {

            PersonDAO personDAO = context.getBean(PersonDAO.class);

            LOGGER.info("Person DAO : {}", personDAO);
            LOGGER.info("get JDBC conn 1 : {}", personDAO.getJdbcConnection());
            LOGGER.info("get JDBC conn 2 : {}", personDAO.getJdbcConnection());
        }

    }
}
