package com.example.skill_tree.controller;


import com.example.skill_tree.entities.User;
import com.example.skill_tree.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody User user){
        return userService.serviceLogin(user.getEmail(),user.getPassword());
    }

}
