package com.example.mytest.service;

import com.example.mytest.entity.Role;
import com.example.mytest.entity.User;
import com.example.mytest.repository.RoleRepo;
import com.example.mytest.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    private UserRepo userRepo;
    private RoleRepo roleRepo;
    @Autowired
    UserServiceImpl(UserRepo userRepo, RoleRepo roleRepo){
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
    }

    @Override
    public User findByUserName(String userName) {
        return userRepo.findByUserName(userName);
    }


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepo.findByUserName(userName);
        if(user == null){
            throw new UsernameNotFoundException("Invalid Username o Password ");
        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
    }

    /*
    * Questo metodo converte una collezione di ruoli in una collezione di autorità */
    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getRole_name())).collect(Collectors.toList());
    }


}
