package com.example.tasksapp.repository;

import com.example.tasksapp.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,Integer> {
}
