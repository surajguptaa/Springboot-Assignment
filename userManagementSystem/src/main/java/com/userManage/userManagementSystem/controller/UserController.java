package com.userManage.userManagementSystem.controller;

import com.userManage.userManagementSystem.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("users")
    List<User> getAllUsers(){
        return userService.getAllUsers();
    }

}
