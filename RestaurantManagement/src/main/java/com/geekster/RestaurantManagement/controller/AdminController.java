package com.geekster.RestaurantManagement.controller;

import com.geekster.RestaurantManagement.model.Food;
import com.geekster.RestaurantManagement.model.User;
import com.geekster.RestaurantManagement.service.FoodService;
import com.geekster.RestaurantManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    FoodService foodService;

    @Autowired
    UserService userService;

    @PostMapping("foodItem")
    public String createFoodItem(@RequestParam String email, @RequestBody Food foodItem){
        return foodService.createFoodItem(email, foodItem);
    }


    @DeleteMapping("foodItem/{email}/{foodId}")
    public String deleteFoodItem(@PathVariable String email, @PathVariable Long foodId){
        return foodService.deleteFoodItem(email,foodId);
    }

    @GetMapping("users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
