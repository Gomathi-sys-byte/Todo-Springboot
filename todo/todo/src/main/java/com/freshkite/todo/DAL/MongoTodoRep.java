package com.freshkite.todo.DAL;

import com.freshkite.todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MongoTodoRep implements DbRepository
{
    @Autowired
    private MongoRep mongoRep;
    @Override
    public List<Todo>getAllTodo()
    {
        System.out.println("Get repo: ");
        return mongoRep.findAll();
    }
    public Todo createTodo(Todo todo_entry)
    {
        return mongoRep.save(todo_entry);
    }
    public Todo updateTodo(Todo todo_entry, String id)
    {
        Todo oldEntry = mongoRep.findById(id).get();
        oldEntry.setTitle(todo_entry.getTitle());
        oldEntry.setDescription(todo_entry.getDescription());
        return mongoRep.save(oldEntry);
    }
    public String deleteTodo(String id)
    {
        mongoRep.deleteById(id);
        return "Deleted Successfully";
    }
}


