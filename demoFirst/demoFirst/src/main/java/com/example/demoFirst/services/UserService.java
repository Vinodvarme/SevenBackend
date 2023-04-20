package com.example.demoFirst.services;

import com.example.demoFirst.entity.UserData;

import java.util.Optional;

public interface UserService {
    public Optional<UserData> getUser(int userId);
}
