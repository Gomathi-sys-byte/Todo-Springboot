package com.freshkite.todo.service;

import com.freshkite.todo.DAL.DbRepository;
import com.freshkite.todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class TodoService {
    @Autowired
    private DbRepository dbRepository;

    public List<Todo>getTodoService()
    {
        System.out.println("Get All todo Service");
        return dbRepository.getAllTodo();
    }
    public Todo createTodoService(Todo todoEntry)
    {
        return dbRepository.createTodo(todoEntry);
    }
    public Todo updateTodoService(Todo todoEntry, String id)
    {
        return dbRepository.updateTodo(todoEntry,id);
    }
    public String deleteTodoService(String id)
    {
        return dbRepository.deleteTodo(id);
    }
}
