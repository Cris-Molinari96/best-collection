package com.example.mytest.repository;

import com.example.mytest.entity.User;

public interface UserRepo {
    User findByUserName(String username);
}
