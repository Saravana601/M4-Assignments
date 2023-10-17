package com.geekster.TodoApp.repository;

import com.geekster.TodoApp.model.Todo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BeanManager {

    @Bean
    public ArrayList<Todo> getArrayList(){
        return new ArrayList<>();
    }

}
