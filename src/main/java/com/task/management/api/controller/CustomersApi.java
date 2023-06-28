package com.task.management.api.controller;

import com.task.management.api.dto.CustomerDto;
import com.task.management.api.dto.LoginDto;
import com.task.management.api.models.Customer;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Validated
@Tag(name = "Customers API")
@RequestMapping("/api/task-management/public/v1/customers")
public interface CustomersApi {
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the book",
                    content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Customer.class))
            })})
    @RequestMapping(
            value = {"/sign-up"},
            produces = {"application/json"},
            consumes = {"application/json"},
            method = {RequestMethod.POST}
    )
    ResponseEntity<Customer> signUp(@Valid CustomerDto requestModel);


    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully logged in",
                    content = {
                            @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = String.class))
                    })})
    @RequestMapping(
            value = {"/login"},
            produces = {"application/json"},
            consumes = {"application/json"},
            method = {RequestMethod.POST}
    )
    ResponseEntity<String> login(@Valid LoginDto requestModel);
}
