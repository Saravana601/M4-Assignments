package com.geekster.RestaurantManagement.model.dto;

import com.geekster.RestaurantManagement.model.Order;
import lombok.Data;

@Data
public class OrderRequest {
    private Order order;
    private AuthenticationInput authenticationInput;
}
