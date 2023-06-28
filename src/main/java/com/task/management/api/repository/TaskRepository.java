package com.task.management.api.repository;

import com.task.management.api.models.Customer;
import com.task.management.api.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
