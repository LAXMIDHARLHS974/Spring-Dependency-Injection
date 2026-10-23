package com.lhs.diapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiAppApplication {

    public static void main(String[] args) {

        ApplicationContext context =SpringApplication.run(DiAppApplication.class, args);

        Dev obj = context.getBean(Dev.class);
        obj.build();

    }

}
