package com.example.tasksapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.tasksapp.model.Task;
import com.example.tasksapp.repository.TaskRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService
{
    @Autowired
    TaskRepository taskRepository;

    public List<Task> getAllTasks()
    {
        List<Task> tasks = new ArrayList<Task>();
        taskRepository.findAll().forEach(tasks1 -> tasks.add(tasks1));
        return tasks;
    }

    public Task getTaskById(int id)
    {

        return taskRepository.findById(id).get();
    }

    public void saveOrUpdate(Task tasks)
    {
        taskRepository.save(tasks);
    }

    public void delete(int id)
    {
        taskRepository.deleteById(id);
    }

    public void update(Task tasks, int taskid)
    {
        taskRepository.save(tasks);
    }
}