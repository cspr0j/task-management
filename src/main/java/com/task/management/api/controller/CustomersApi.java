package com.task.management.api.controller;

import com.task.management.api.dto.CustomerRegistrationDto;
import com.task.management.api.dto.LoginDto;
import com.task.management.api.models.Customer;
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
public interface CustomersApi {
    @ApiOperation(
            response = CustomerRegistrationDto.class,
            tags = {"customers"},
            value = "")
    @ApiResponses({@ApiResponse(
            code = 200,
            message = "ОК",
            response = CustomerRegistrationDto.class
    )})
    @RequestMapping(
            value = {"/api/task-management/public/v1/customers/sign-up"},
            produces = {"application/json"},
            consumes = {"application/json"},
            method = {RequestMethod.POST}
    )
    ResponseEntity<CustomerRegistrationDto> signUp(@ApiParam("")
                                                   @RequestBody(required = false)
                                                   @Valid Customer requestModel);


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
