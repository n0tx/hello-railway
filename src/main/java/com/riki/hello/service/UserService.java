package com.riki.hello.service;

import com.riki.hello.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User saveUser(User user);
}
