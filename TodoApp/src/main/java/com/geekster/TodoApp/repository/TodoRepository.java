package com.geekster.TodoApp.repository;

import com.geekster.TodoApp.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepository {

    @Autowired
    public List<Todo> todoList;

}
