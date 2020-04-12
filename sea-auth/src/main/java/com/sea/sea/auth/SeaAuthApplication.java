package com.sea.sea.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SeaAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeaAuthApplication.class, args);
    }

}
