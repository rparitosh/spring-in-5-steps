package com.paritosh.learning.springin5steps;

import com.paritosh.learning.componentscan.ComponentDAO;
import com.paritosh.learning.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.paritosh.learning.componentscan")
public class SpringIn5StepsComponentApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentApplication.class);

    public static void main(String[] args){



        ApplicationContext context = SpringApplication.run(SpringIn5StepsComponentApplication.class, args);

        ComponentDAO componentDAO = context.getBean(ComponentDAO.class);

        LOGGER.info("Comp DAO : {}", componentDAO);

    }
}
