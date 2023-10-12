package com.geekster.RestaurantManagement.repository;

import com.geekster.RestaurantManagement.model.UserAuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserTokenRepository extends JpaRepository<UserAuthenticationToken,Long> {
    UserAuthenticationToken findFirstByTokenValue(String tokenValue);
}
