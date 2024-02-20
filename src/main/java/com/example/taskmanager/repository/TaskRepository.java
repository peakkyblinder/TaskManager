package com.example.taskmanager.repository;

import com.example.taskmanager.entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskRepository extends CrudRepository<TaskEntity, UUID> {

    @Override
    List<TaskEntity> findAll();

    Optional<TaskEntity> findById(UUID id);

}
