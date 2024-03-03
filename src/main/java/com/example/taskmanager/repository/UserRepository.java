package com.example.taskmanager.repository;

import com.example.taskmanager.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends CrudRepository<UserEntity, UUID> {

    @Override
    Optional<UserEntity> findById(UUID uuid);

    @Override
    List<UserEntity> findAll();

    Optional<UserEntity> findByUserName(String username);
}
