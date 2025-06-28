package com.nontech.SecurityWithJwt.service;

import com.nontech.SecurityWithJwt.dtos.UserDTO;
import com.nontech.SecurityWithJwt.models.User;

import java.util.List;

public interface UserService {

    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);

    User findByUsername(String username);
}