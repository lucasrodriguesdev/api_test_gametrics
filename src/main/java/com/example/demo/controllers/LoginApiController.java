package com.example.demo.controllers;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class LoginApiController {
    private List<User> users = new ArrayList<>();

    public LoginApiController(){
        users.addAll(List.of(
                new User("001","pamonha","pamonhadoce","p1@gmail.com"),
                new User("002","pamonha2","pamonhadoce2","p2@hotmail.com")
        ));
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    Iterable<User> getUsers(){
        return users;
    }

    @PostMapping
    User postUser(@RequestBody User user){
        users.add(user);
        return user;
    }

}

