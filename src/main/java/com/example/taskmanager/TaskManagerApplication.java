package com.example.taskmanager;

import com.example.taskmanager.entity.TaskEntity;
import com.example.taskmanager.repository.TaskRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class TaskManagerApplication {

    private static final Logger log = LoggerFactory.getLogger(TaskManagerApplication.class);



    public static void main(String[] args) {
        SpringApplication.run(TaskManagerApplication.class, args);
    }
    @Bean
    public CommandLineRunner demo(TaskRepository repository) {
      return (args) -> {
          log.info("Hello world");
          repository.save(new TaskEntity("Task1", "Task1 Description"));
          repository.save(new TaskEntity("Task2", "Task2 Description"));
          repository.save(new TaskEntity("Task3", "Task3 Description"));

          //fetch all tasks
          List<TaskEntity> tasks = repository.findAll();

//          use logger and print tasks
          tasks.forEach(task -> {
              log.info(task.toString());
          });
      };
    }

}
