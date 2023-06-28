package com.task.management.api.dto;

import lombok.Data;

@Data
public class LoginDto {
    private final String email;
    private final String password;
}
