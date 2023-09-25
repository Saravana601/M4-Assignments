package com.geekster.UserManagementSystem.controller;

import com.geekster.UserManagementSystem.model.User;
import com.geekster.UserManagementSystem.service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("user")
    public String addUser(@Valid @RequestBody User user){
        return userService.addUser(user);
    }

    @PostMapping("users")
    public String addUsers(@Valid @RequestBody List<User> users){
        return userService.addUsers(users);
    }


    @GetMapping("user/id/{userId}")
    public User getUserById(@Valid @PathVariable Integer userId){
        return userService.getUserById(userId);
    }


    @GetMapping("users")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }


    @PutMapping("user/{userId}/email/{userEmail}")
    public String updateUserInformation(@PathVariable Integer userId,
                                        @PathVariable @Email String userEmail) {
        return userService.updateUserInformation(userId, userEmail);
    }

    @DeleteMapping("users/{userId}")
    public String deleteUserById(@PathVariable Integer userId) {
        return userService.removeUserById(userId);
    }

}
