package com.UserManagement.demo.api;

import com.UserManagement.demo.model.User;
import com.UserManagement.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    // addUser

    @PostMapping("user")
    public String addUser(@RequestBody User user){
        return userService.inputUser(user);
    }

    // addAllUser

    @PostMapping("users")
    public String addAllUser(@RequestBody List<User> user){
        return userService.addAllUser(user);
    }


    // getUser/{userid}

    @GetMapping("user/{userId}")
    public User getUser(@PathVariable Integer userId) {
        return userService.getUser(userId);
    }


    // getAllUser

    @GetMapping("users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }


    // updateUserInfo

    @PutMapping("user/{userId}")
    public String updateUserInfo(@PathVariable Integer userId, @RequestBody User updatedUser) {
        return userService.updateInfo(userId,updatedUser);
    }


    // deleteUser

    @DeleteMapping("user/{userId}")
    public String deleteUserByID(@PathVariable Integer userId) {
        return userService.deleteUser(userId);
    }

}
