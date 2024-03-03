package com.example.taskmanager.controller;

import com.example.taskmanager.entity.DtoTaskEntity;
import com.example.taskmanager.entity.TaskEntity;
import com.example.taskmanager.entity.UserEntity;
import com.example.taskmanager.repository.UserRepository;
import com.example.taskmanager.service.TaskServiceImpl;
import com.example.taskmanager.service.UserInfoUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;



@RestController
public class TaskController {
    @Autowired
 private final TaskServiceImpl taskService;

 private final UserRepository userRepository;

 @Autowired
 private UserInfoUserDetailsService userService;


    public TaskController(TaskServiceImpl taskService, UserRepository userRepository) {
        this.taskService = taskService;

        this.userRepository = userRepository;
 }

    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value="/tasks")

    public List<TaskEntity> getallTasks(){
       return taskService.getallTasks();
    }



    @DeleteMapping(value="/deletetask{uuid}")
    public String deleteTask(@RequestParam UUID uuid)
    {
        return(taskService.deletebyId(uuid));


    }
    @PutMapping(value="/updatetask")
    public String updateTask(@RequestBody DtoTaskEntity dtoTaskEntity)
    {
        return (taskService.updateTask(dtoTaskEntity)+" "+dtoTaskEntity.getId());
    }

    @PostMapping(value="/posttask")
    public String postTask(@RequestBody DtoTaskEntity dtoTaskEntity)
    {
        return taskService.postTask(dtoTaskEntity);
    }

    @GetMapping(value="/users")
    public List<UserEntity> getallUsers(){
        return userRepository.findAll();
    }


    @PostMapping(value="/addusers")
    public String addUsers(@RequestBody UserEntity user){
        return userService.addUser(user);
    }

}
