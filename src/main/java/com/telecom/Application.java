package com.telecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by lee on 09/05/2017.
 */

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(value = "com.telecom")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
