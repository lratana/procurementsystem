package com.procurementsystem.procurementsystem.controller;

import com.procurementsystem.procurementsystem.dto.UserRequest;
import com.procurementsystem.procurementsystem.dto.UserResponse;
import com.procurementsystem.procurementsystem.model.Device;
import com.procurementsystem.procurementsystem.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
public class UserRestController {
    private final UserService userService;


    @PostMapping(value = "v1/users", consumes = "application/json",produces = "application/json")
    private ResponseEntity<UserResponse>create(@RequestBody UserRequest userRequest) {
        log.info("Intercept request create new user v1 with request: {}", userRequest);
        userService.create(userRequest);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "v1/users/{id}", consumes = "application/json",produces = "application/json")
    private ResponseEntity<UserResponse>update(@RequestBody UserRequest userRequest, @PathVariable Long id) {
        log.info("Intercept request update user v1 with request: {}", userRequest);
        userService.update(id, userRequest);
        return ResponseEntity.ok().build();
    }
}

