package com.freshkite.todo.controller;

import com.freshkite.todo.model.Todo;
import com.freshkite.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<Todo>getTodoController() {
        return todoService.getTodoService();
    }

    @PostMapping("/todo")
    public Todo createTodoController(@RequestBody Todo todoEntry) {
        return todoService.createTodoService(todoEntry);
    }

    @PutMapping("/todo/{id}")
    public Todo updateTodoController(@PathVariable String id, @RequestBody Todo todoEntry) {
        return todoService.updateTodoService(todoEntry,id);
    }

    @DeleteMapping("/todo/{id}")
    public String deleteTodoController(@PathVariable String id) {
        return todoService.deleteTodoService(id);
    }
}