package com.sea.sea.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhaoxianhai on 2019/9/23
 */
@Data
public class SeaAuthUser implements Serializable {

    private String username;

    private String password;

    private boolean accountNonExpired = true;

    private boolean accountNonLocked= true;

    private boolean credentialsNonExpired= true;

    private boolean enabled= true;
}
