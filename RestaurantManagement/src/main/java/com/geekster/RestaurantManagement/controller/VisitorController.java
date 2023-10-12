package com.geekster.RestaurantManagement.controller;

import com.geekster.RestaurantManagement.model.Food;
import com.geekster.RestaurantManagement.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VisitorController {

    @Autowired
    FoodService foodService;

    @GetMapping("visitor/foods/")
    public List<Food> getAllFoodItem()
    {
        return foodService.getAllFoodItems();
    }
}
