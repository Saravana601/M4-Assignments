package com.geekster.RestaurantManagement.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationInput {
    private String email;
    private String tokenValue;
}
