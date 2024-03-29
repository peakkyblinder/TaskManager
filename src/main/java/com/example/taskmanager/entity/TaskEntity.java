package com.example.taskmanager.entity;

import jakarta.persistence.*;

import java.util.UUID;
@Entity
@Table(name="tasks")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String Title;
    private String Description;

    public TaskEntity() {

    }
    public TaskEntity(String title, String description) {
        this.Title = title;
        this.Description = description;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "TaskEntity{" +
                "Title='" + Title + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }

    public UUID getId() {
        return id;
    }
}

