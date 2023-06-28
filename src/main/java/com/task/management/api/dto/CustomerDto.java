package com.task.management.api.dto;

import lombok.Data;

@Data
public class CustomerDto {
    private final String name;
    private final String surname;
    private final Integer age;
    private final String email;
}
