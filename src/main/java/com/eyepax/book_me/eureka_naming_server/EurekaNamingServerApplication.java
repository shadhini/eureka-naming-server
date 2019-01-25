package com.eyepax.book_me.eureka_naming_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer // Enable eureka server
@SpringBootApplication
public class EurekaNamingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaNamingServerApplication.class, args);
    }



}

