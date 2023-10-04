package com.edu.SpringLr.service;

import com.edu.SpringLr.dto.UserDto;
import com.edu.SpringLr.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}
