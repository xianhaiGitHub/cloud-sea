package com.sea.sea.auth.controller;

import com.sea.sea.common.entity.SeaResponse;
import com.sea.sea.common.exception.SeaAuthException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * Created by zhaoxianhai on 2019/9/23
 */
@RestController
public class SecurityController {
    @Autowired
    private ConsumerTokenServices consumerTokenServices;

    // /oauth/开头的请求由SeaSecurityConfigure定义的过滤器链处理,所以它不受资源服务器配置管理，所以使用令牌并不能成功获取到资源
    @GetMapping("oauth/test")
    public String testOauth() {
        return "oauth";
    }
    //将使用令牌获取/user资源
    @GetMapping("user")
    public Principal currentUser(Principal principal) {
        return principal;
    }


    @DeleteMapping("signout")
    public SeaResponse signout(HttpServletRequest request) throws SeaAuthException {
        String authorization = request.getHeader("Authorization");
        String token = StringUtils.replace(authorization, "bearer ", "");
        SeaResponse seaResponse = new SeaResponse();
        if (!consumerTokenServices.revokeToken(token)) {
            throw new SeaAuthException("退出登录失败");
        }
        return seaResponse.message("退出登录成功");
    }
}
