package com.example.testapplication.controller;

import com.example.testapplication.exception.UserClassException;
import com.example.testapplication.models.User;
import com.example.testapplication.response.ResponseHttp;
import com.example.testapplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("get-data-user/{idUser}")
    public ResponseEntity<ResponseHttp<User>> getUser(@PathVariable Integer idUser) {
        ResponseHttp<User> responseHttp = new ResponseHttp<User>();

        try {
            responseHttp.setObjectSource(userService.getUser(idUser));
            return new ResponseEntity<>(responseHttp, HttpStatus.OK);
        } catch (UserClassException e) {
            responseHttp.setMessageException(e.getMessage());
            return new ResponseEntity<>(responseHttp, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("get-data-user-request")
    public ResponseEntity<ResponseHttp<User>> getUserWithRequestParam(@RequestParam Integer idUser) {
        ResponseHttp<User> responseHttp = new ResponseHttp<User>();

        try {
            responseHttp.setObjectSource(userService.getUser(idUser));
            System.out.println(responseHttp);
            return new ResponseEntity<>(responseHttp, HttpStatus.OK);
        } catch (UserClassException e) {
            responseHttp.setMessageException("Si è verificato un errore nella richiesta" + "\n" + e.getMessage());
            System.out.println(responseHttp);
            return new ResponseEntity<>(responseHttp, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("get-all-data")
    public ResponseEntity<ResponseHttp> getAllUser(){
        ResponseHttp<List<User>> responseHttp = new ResponseHttp<List<User>>();
        responseHttp.setObjectSource(userService.getAllUser());
        return new ResponseEntity<>(responseHttp,HttpStatus.OK);
    }
}
