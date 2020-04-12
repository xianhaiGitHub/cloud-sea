package com.sea.sea.server.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by zhaoxianhai on 2019/9/24
 */

@RestController
public class TestController {

    @GetMapping("info")
    public String test() {
        return "sea-server-system";
    }

    @GetMapping("user")
    public Principal currentUser(Principal principal) {
        return principal;
    }
}

