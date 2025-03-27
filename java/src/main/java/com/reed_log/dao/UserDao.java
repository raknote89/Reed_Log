package com.reed_log.dao;

import com.reed_log.model.RegisterUserDto;
import com.reed_log.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    User getUserById(int id);

    User getUserByUsername(String username);

    User createUser(RegisterUserDto user);
}
