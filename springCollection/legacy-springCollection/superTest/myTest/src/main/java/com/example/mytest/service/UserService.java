package com.example.mytest.service;

import com.example.mytest.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {
    public User findByUserName(String userName);

    @Override
    UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException;
}
