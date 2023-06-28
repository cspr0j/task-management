package com.task.management.api.controller;

import com.task.management.api.models.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskApiImpl implements TaskApi {
    @Override
    public ResponseEntity<Task> createTask(Task requestModel) {
        return null;
    }

    @Override
    public ResponseEntity<Task> updateTask(Long taskId, Task requestModel) {
        return null;
    }

    @Override
    public ResponseEntity<Task> updateTaskFields(Long taskId, Task requestModel) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteTask(Long taskId) {
        return null;
    }
}
