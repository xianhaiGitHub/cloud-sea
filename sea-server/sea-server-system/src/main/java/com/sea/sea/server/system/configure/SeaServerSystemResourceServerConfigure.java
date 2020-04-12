package com.sea.sea.server.system.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * Created by zhaoxianhai on 2019/9/24
 * <p>
 * 访问所有sea-server-system的请求都需要认证，只有通过认证服务器发放的令牌才能进行访问
 */
@Configuration
@EnableResourceServer
public class SeaServerSystemResourceServerConfigure extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .requestMatchers().antMatchers("/**")
                .and()
                .authorizeRequests()
                .antMatchers("/**").authenticated();
    }
}
