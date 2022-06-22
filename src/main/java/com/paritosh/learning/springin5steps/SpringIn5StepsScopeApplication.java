package com.paritosh.learning.springin5steps;

import com.paritosh.learning.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

    public static void main(String[] args){



        ApplicationContext context = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);

        PersonDAO personDAO = context.getBean(PersonDAO.class);

        LOGGER.info("Person DAO : {}", personDAO);
        LOGGER.info("get JDBC conn 1 : {}", personDAO.getJdbcConnection());
        LOGGER.info("get JDBC conn 2 : {}", personDAO.getJdbcConnection());

    }
}
