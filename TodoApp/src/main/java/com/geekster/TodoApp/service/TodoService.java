package com.geekster.TodoApp.service;

import com.geekster.TodoApp.model.Todo;
import com.geekster.TodoApp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    // Add Todo
    public String addTodo(Todo todo) {
        todoRepository.todoList.add(todo);
        return "Todo Added";
    }

    // Get all Todos
    public ArrayList<Todo> getAllTodos() {
        return (ArrayList<Todo>) todoRepository.todoList;
    }

    // Get all done Todos
    public ArrayList<Todo> getAllDoneTodos() {
        ArrayList<Todo> doneList = new ArrayList<>();
        for(Todo todo : todoRepository.todoList){
            if(todo.isTodoDone()){
                doneList.add(todo);
            }
        }
        return doneList;
    }

    // Get all Undone Todos
    public ArrayList<Todo> getAllUndoneTodos() {
        ArrayList<Todo> undoneList = new ArrayList<>();
        for(Todo todo : todoRepository.todoList){
            if(!todo.isTodoDone()){
                undoneList.add(todo);
            }
        }
        return undoneList;
    }

    // update Todo
    public String updateTodoStatus(Integer todoId,boolean status) {
        boolean flag = false;
        for(Todo todo : todoRepository.todoList){
            if(todo.getTodoId().equals(todoId)){
                todo.setTodoDone(status);
                flag = true;
            }
        }
        if(flag) return "Todo updated successfully ";
        else return "Invalid todoId "+ todoId;
    }

    public String deleteTodoById(Integer todoId) {
        List<Todo> allTodo = getAllTodos();
        allTodo.removeIf(todo -> todo.getTodoId().equals(todoId));
        return "todo deleted";
    }

}
