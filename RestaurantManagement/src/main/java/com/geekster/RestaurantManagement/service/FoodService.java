package com.geekster.RestaurantManagement.service;

import com.geekster.RestaurantManagement.model.Food;
import com.geekster.RestaurantManagement.model.User;
import com.geekster.RestaurantManagement.repository.IFoodRepository;
import com.geekster.RestaurantManagement.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.geekster.RestaurantManagement.model.enums.UserRole.*;

@Service
public class FoodService {

    @Autowired
    IFoodRepository iFoodRepository;

    @Autowired
    IUserRepository iUserRepository;

    // Create Food Item
    public String createFoodItem(String email, Food foodItem) {
        User existingUser = iUserRepository.findFirstByEmail(email);

        if(existingUser.getRole().equals(ADMIN_ROLE)){
            iFoodRepository.save(foodItem);
            return "Food Item Created";
        }
        else {
            return "Only Admin can create food!";
        }
    }

    // Delete Food Item By Food I'D
    public String deleteFoodItem(String email, Long foodId) {
        User existingUser = iUserRepository.findFirstByEmail(email);

        if(existingUser.getRole().equals(ADMIN_ROLE)){
            iFoodRepository.deleteById(foodId);
            return "Food Item deleted";
        }
        else {
            return "Only Admin can delete food!";
        }
    }

    // Get all Food
    public List<Food> getAllFoodItems() {
        return iFoodRepository.findAll();
    }
}
