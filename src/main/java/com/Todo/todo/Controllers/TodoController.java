package com.Todo.todo.Controllers;

import com.Todo.todo.Models.Todo;
import com.Todo.todo.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;


    // create Todo

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo){
        //create

        return todoService.create(todo);
    }

    @GetMapping
    public List<Todo> getAll(){
        return  todoService.getList();

    }


    //get all todo


}
