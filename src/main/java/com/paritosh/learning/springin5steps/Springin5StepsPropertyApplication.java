package com.paritosh.learning.springin5steps;

import com.paritosh.learning.springin5steps.properties.ExternalPropertyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@PropertySource("classpath:app.properties")
public class Springin5StepsPropertyApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(Springin5StepsPropertyApplication.class);

    public static void main(String[] args){

        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Springin5StepsPropertyApplication.class)){
            ExternalPropertyService service = context.getBean(ExternalPropertyService.class);
            LOGGER.info("service - {}" ,service);
            LOGGER.info("Service url - {}", service.getServiceURL());
        }

    }
}
