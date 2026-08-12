package com.example.employeetodo.repository;

import com.example.employeetodo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    // Search by title
    List<Task> findByTitleContainingIgnoreCase(String title);

    // Search by status
    List<Task> findByStatus(String status);

    // Search by priority
    List<Task> findByPriority(String priority);

    // Search by assigned user
    List<Task> findByAssignedToContainingIgnoreCase(String assignedTo);
}