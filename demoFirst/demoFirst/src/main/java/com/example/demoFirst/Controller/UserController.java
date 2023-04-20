package com.example.demoFirst.Controller;
import com.example.demoFirst.entity.UserData;
import com.example.demoFirst.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepo userRepo;

    @PostMapping("/save")
    public UserData saveUser(@RequestBody UserData userData){
        return userRepo.save(userData);

    }
    @GetMapping("/getById/{Id}")
    public Optional<UserData> getUserById(@PathVariable int userId){
        return Optional.of(userRepo.findById(userId).get());
    }
}
