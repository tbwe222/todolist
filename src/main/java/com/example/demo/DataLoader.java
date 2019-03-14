package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    TodolistRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Todolist todolist = new Todolist("Work", "Start heading to work");
        repository.save(todolist);

        todolist = new Todolist("Gymnasium", " Go to the Gym");
        repository.save(todolist);

        todolist = new Todolist("Read", "Start Reading");
        repository.save(todolist);
    }
}
