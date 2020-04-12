package com.sea.sea.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SeaRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeaRegisterApplication.class, args);
    }

}
