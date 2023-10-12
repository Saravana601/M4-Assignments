package com.geekster.RestaurantManagement.repository;

import com.geekster.RestaurantManagement.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodRepository extends JpaRepository<Food, Long> {
}
