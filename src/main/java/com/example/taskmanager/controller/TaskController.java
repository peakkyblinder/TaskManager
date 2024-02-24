package com.example.taskmanager.controller;

import com.example.taskmanager.entity.TaskEntity;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    @GetMapping("/tasks")
    public List<TaskEntity> findAll() {
        return taskRepository.findAll();
    }

}
