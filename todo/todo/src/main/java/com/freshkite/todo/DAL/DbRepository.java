package com.freshkite.todo.DAL;

import com.freshkite.todo.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DbRepository
{
    public List<Todo>getAllTodo();
    public Todo createTodo(Todo todo_entry);
    public Todo updateTodo(Todo todo_entry, String id);
    public String deleteTodo(String id);
}



