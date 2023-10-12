package com.geekster.RestaurantManagement.repository;

import com.geekster.RestaurantManagement.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order,Long> {
}
