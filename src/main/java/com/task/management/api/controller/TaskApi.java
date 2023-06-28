package com.task.management.api.controller;

import com.task.management.api.dto.CustomerRegistrationDto;
import com.task.management.api.dto.LoginDto;
import com.task.management.api.dto.TaskDto;
import com.task.management.api.models.Customer;
import com.task.management.api.models.Task;
import io.swagger.annotations.*;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Validated
@Api(
        value = "customersApi",
        description = "The Customers API"
)
public interface TaskApi {
    @ApiOperation(
            response = TaskDto.class,
            tags = {"customers"},
            value = "")
    @ApiResponses({@ApiResponse(
            code = 200,
            message = "ОК",
            response = TaskDto.class
    )})
    @RequestMapping(
            value = {"/api/task-management/public/v1/customers/create"},
            produces = {"application/json"},
            consumes = {"application/json"},
            method = {RequestMethod.POST}
    )
    ResponseEntity<TaskDto> signUp(@ApiParam("")
                                   @RequestBody(required = false)
                                   @Valid Task requestModel);


    @ApiOperation(
            response = String.class,
            tags = {"customers"},
            value = "")
    @ApiResponses({@ApiResponse(
            code = 200,
            message = "ОК",
            response = String.class
    )})
    @RequestMapping(
            value = {"/api/task-management/public/v1/customers/login"},
            produces = {"application/json"},
            consumes = {"application/json"},
            method = {RequestMethod.POST}
    )
    ResponseEntity<String> login(@ApiParam("")
                                 @RequestBody(required = false)
                                 @Valid LoginDto requestModel);
}
