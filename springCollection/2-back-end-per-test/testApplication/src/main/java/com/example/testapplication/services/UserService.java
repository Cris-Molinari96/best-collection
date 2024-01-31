package com.example.testapplication.services;

import com.example.testapplication.exception.UserClassException;
import com.example.testapplication.models.User;
import com.example.testapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private UserClassException userClassException;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(Integer idUser) {
        return userRepository.findById(idUser).orElseThrow(() ->
                new UserClassException("Sorry, User with id:" + idUser + " not found!")
        );
    }

    public List<User> getAllUser() {
        List<User> userList = userRepository.findAll();
        if (userList.size() != 0) {
            return userList;
        } else {
            throw new UserClassException("Array vuoto");
        }
    }
}
