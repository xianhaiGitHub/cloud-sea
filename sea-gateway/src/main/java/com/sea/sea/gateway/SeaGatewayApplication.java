package com.sea.sea.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * EnableZuulProxy开启Zuul服务网关，EnableDiscoveryClient开启服务注册与发现
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class SeaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeaGatewayApplication.class, args);
    }

}
