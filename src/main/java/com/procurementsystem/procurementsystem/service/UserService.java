package com.procurementsystem.procurementsystem.service;

import com.procurementsystem.procurementsystem.dto.UserRequest;
import com.procurementsystem.procurementsystem.dto.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse create(UserRequest userRequest);
    UserResponse update(Long id, UserRequest userRequest);
    UserResponse findById(Long id);
    void delete(Long id);
    List<UserResponse> findAll();
}
