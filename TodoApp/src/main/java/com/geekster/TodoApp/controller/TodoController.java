package com.geekster.TodoApp.controller;


import com.geekster.TodoApp.model.Todo;
import com.geekster.TodoApp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;

    @PostMapping("todo")
    public String addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }

    @GetMapping("todos")
    public ArrayList<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    @GetMapping("allDoneTodos")
    public ArrayList<Todo> getAllDoneTodos(){
        return todoService.getAllDoneTodos();
    }

    @GetMapping("allUndoneTodos")
    public ArrayList<Todo> getAllUndoneTodos(){
        return todoService.getAllUndoneTodos();
    }

    @PutMapping("todo/todoId/{todoId}/todoStatus/{status}")
    public String updateTodoStatus(@PathVariable Integer todoId,@PathVariable boolean status){
        return todoService.updateTodoStatus(todoId,status);
    }

    @DeleteMapping("todo/todoId/{todoId}")
    public String deleteTodo(@PathVariable Integer todoId) {
        return todoService.deleteTodoById(todoId);
    }
}
