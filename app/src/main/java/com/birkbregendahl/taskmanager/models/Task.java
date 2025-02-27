package com.birkbregendahl.taskmanager.models;

import jakarta.persistence.*; // provides annotations like @Entity, @Id, and @GeneratedValue, which define how Java objects should be stored in a relational database.

@Entity // This annotation marks the Task class as a database entity.
        // In database terms, this means that Spring Boot (via Hibernate) will create a table for this class automatically.
public class Task {
    @Id // This marks a field as the primary key of the table.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This tells the database to automatically generate a unique ID for each new entry.
    private Long id;

    private String title;
    private String description;

    public Task() {}

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
}