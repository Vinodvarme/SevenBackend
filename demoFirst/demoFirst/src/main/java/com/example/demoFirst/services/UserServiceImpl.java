package com.example.demoFirst.services;

import com.example.demoFirst.entity.UserData;
import com.example.demoFirst.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    public UserRepo userRepo;
    @Override
    public Optional<UserData> getUser(int userId) {
        Optional<UserData> userData=this.userRepo.findById(userId);
        return userData;
    }

}
