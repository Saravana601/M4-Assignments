package com.geekster.RestaurantManagement.controller;

import com.geekster.RestaurantManagement.model.Order;
import com.geekster.RestaurantManagement.model.User;
import com.geekster.RestaurantManagement.model.Food;
import com.geekster.RestaurantManagement.model.dto.AuthenticationInput;
import com.geekster.RestaurantManagement.model.dto.OrderRequest;
import com.geekster.RestaurantManagement.model.dto.SignInInput;
import com.geekster.RestaurantManagement.service.FoodService;
import com.geekster.RestaurantManagement.service.OrderService;
import com.geekster.RestaurantManagement.service.UserService;
import com.geekster.RestaurantManagement.service.UserTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    FoodService foodService;

    @Autowired
    OrderService orderService;

    @Autowired
    UserTokenService userTokenService;

    @PostMapping("user/signUp")
    public String userSignUp(@RequestBody User user){
        return userService.userSignUp(user);
    }


    @PostMapping("user/signIn")
    public String userSignIn(@RequestBody SignInInput sign){
        return userService.userSignIn(sign);
    }

    @DeleteMapping("user/signOut")
    public String userSignOut(@RequestBody AuthenticationInput authenticationInput) {
        return userService.userSignOut(authenticationInput);
    }

    @PostMapping("user/order")
    public String addOrder(@RequestBody OrderRequest orderRequest){
        if(userTokenService.authenticate(orderRequest.getAuthenticationInput())) {
            return orderService.addOrder(orderRequest.getOrder(),orderRequest.getAuthenticationInput().getEmail());
        }
        else {
            return "You've to sign to order the food!";
        }
    }

    @GetMapping("foods")
    public List<Food> getAllFoodItems()
    {
        return foodService.getAllFoodItems();
    }


}
