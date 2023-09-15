package com.UserManagement.demo.repository;

import com.UserManagement.demo.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataSource {

    @Bean
    public List<User> returnList(){
        return new ArrayList<>();
    }

}
