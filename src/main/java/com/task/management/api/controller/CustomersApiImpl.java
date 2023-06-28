package com.task.management.api.controller;

import com.task.management.api.dto.CustomerDto;
import com.task.management.api.dto.LoginDto;
import com.task.management.api.models.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomersApiImpl implements CustomersApi {
    @Override
    public ResponseEntity<Customer> signUp(CustomerDto requestModel) {
        return ResponseEntity.ok(new Customer());
    }

    @Override
    public ResponseEntity<String> login(LoginDto requestModel) {
        return ResponseEntity.ok("Hello");
    }
}
