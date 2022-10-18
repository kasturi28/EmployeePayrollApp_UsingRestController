package com.bridgelabz.Employeepayroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class TestApplication {

    public static void main(String[] args){
        ApplicationContext context = SpringApplication.run(TestApplication.class, args);
        log.info("Application is running");
        log.debug("Debug message");
        log.error("Error message");
        log.warn("Warn message");
        log.info("Employee payroll application started in {} environment" ,
                context.getEnvironment().getProperty("environment"));



    }


}
