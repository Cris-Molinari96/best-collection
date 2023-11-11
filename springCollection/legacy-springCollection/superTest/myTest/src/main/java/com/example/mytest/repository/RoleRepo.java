package com.example.mytest.repository;

import com.example.mytest.entity.Role;

public interface RoleRepo {
    Role findRoleByName(String roleName);
}
