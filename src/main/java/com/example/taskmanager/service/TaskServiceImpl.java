package com.example.taskmanager.service;

import com.example.taskmanager.entity.DtoTaskEntity;
import com.example.taskmanager.entity.TaskEntity;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<TaskEntity> getallTasks() {
        return taskRepository.findAll();
    }

    public String deletebyId(UUID uuid) {
        Optional<TaskEntity> taskEntity = taskRepository.findById(uuid);
        if (taskEntity.isPresent()) {
            taskRepository.delete(taskEntity.get());
            return "Successfully deleted";
        } else
            return "not Found";
    }

    public String updateTask(DtoTaskEntity dtoTaskEntity) {


        Optional<TaskEntity> optionalTaskEntity = taskRepository.findById(dtoTaskEntity.getId());

        if (optionalTaskEntity.isPresent()) {

            TaskEntity taskEntity=optionalTaskEntity.get();
            taskEntity.setTitle(dtoTaskEntity.getTitle());
            taskRepository.save(taskEntity);
            return "Successfully updated";
        } else
            return "Not Found";

    }

    public String postTask(DtoTaskEntity dtoTaskEntity) {

        TaskEntity taskEntity=new TaskEntity(dtoTaskEntity.getTitle(),dtoTaskEntity.getDescription());
        taskRepository.save(taskEntity);
        return "Successfully inserted";
    }
}
