package com.sea.sea.auth.service;

import com.sea.sea.common.entity.SeaAuthUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Created by zhaoxianhai on 2019/9/23
 */
@Service
public class SeaUserDetailService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    // User(String username, String password,Collection<? extends GrantedAuthority> authorities)，
    // 由于权限参数不能为空，所以这里先使用AuthorityUtils.commaSeparatedStringToAuthorityList方法模拟一个user:add权限。
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       SeaAuthUser user = new SeaAuthUser();
        user.setUsername(username);
        user.setPassword(this.passwordEncoder.encode("123456"));
       return new User(username,user.getPassword(),user.isEnabled(),user.isAccountNonExpired(),
               user.isCredentialsNonExpired(),user.isAccountNonLocked(),
               AuthorityUtils.commaSeparatedStringToAuthorityList("user:add"));
    }
}
