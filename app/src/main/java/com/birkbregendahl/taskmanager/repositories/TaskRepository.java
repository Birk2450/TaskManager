package com.birkbregendahl.taskmanager.repositories;

import com.birkbregendahl.taskmanager.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

// Allows you to interact with the Task table without writing SQL.

// 	By extending JpaRepository<Task, Long>, it automatically provides methods like:
//  •	save(Task task) → Save a new task
//  •	findAll() → Get all tasks
//  •	findById(Long id) → Find a task by ID
//  •	deleteById(Long id) → Delete a task by ID