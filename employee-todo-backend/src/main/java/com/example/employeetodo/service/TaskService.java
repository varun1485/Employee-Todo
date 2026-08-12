package com.example.employeetodo.service;

import com.example.employeetodo.entity.Task;
import com.example.employeetodo.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    // Get All Tasks
    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    // Get Task By ID
    public Task getTaskById(Long id) {
        Optional<Task> task = repository.findById(id);
        return task.orElse(null);
    }

    // Save Task
    public Task saveTask(Task task) {
        return repository.save(task);
    }

    // Update Task
    public Task updateTask(Long id, Task task) {

        Optional<Task> existingTask = repository.findById(id);

        if (existingTask.isPresent()) {

            Task oldTask = existingTask.get();

            oldTask.setTitle(task.getTitle());
            oldTask.setDescription(task.getDescription());
            oldTask.setPriority(task.getPriority());
            oldTask.setStatus(task.getStatus());
            oldTask.setStartDate(task.getStartDate());
            oldTask.setDueDate(task.getDueDate());
            oldTask.setAssignedTo(task.getAssignedTo());

            return repository.save(oldTask);
        }

        return null;
    }

    // Delete Task
    public void deleteTask(Long id) {
        repository.deleteById(id);
    }

    // Search By Title
    public List<Task> searchByTitle(String title) {
        return repository.findByTitleContainingIgnoreCase(title);
    }

    // Search By Status
    public List<Task> searchByStatus(String status) {
        return repository.findByStatus(status);
    }

    // Search By Priority
    public List<Task> searchByPriority(String priority) {
        return repository.findByPriority(priority);
    }

    // Search By Assigned User
    public List<Task> searchByAssignedTo(String assignedTo) {
        return repository.findByAssignedToContainingIgnoreCase(assignedTo);
    }
}