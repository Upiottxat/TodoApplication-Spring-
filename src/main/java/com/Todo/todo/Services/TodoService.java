package com.Todo.todo.Services;

import com.Todo.todo.Models.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {


    private List<Todo> list =new ArrayList();

    public Todo create(Todo todo){
        list.add(todo);
        return todo;

    }

    public List<Todo> getList(){

        return list;
    }



}
