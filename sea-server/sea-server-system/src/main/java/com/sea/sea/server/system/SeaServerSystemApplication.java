
package com.sea.sea.server.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 * Created by zhaoxianhai on 2019/9/24
 * <p>
 * 资源服务器启动类
 *
 * @EnableGlobalMethodSecurity(prePostEnabled = true)表示开启Spring Cloud Security权限注解
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SeaServerSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeaServerSystemApplication.class, args);
    }

}
