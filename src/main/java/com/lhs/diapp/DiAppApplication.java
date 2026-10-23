package com.lhs.diapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiAppApplication.class, args);

        Dev obj = new Dev();
        obj.build();

    }

}
