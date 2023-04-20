package com.example.demoFirst.repo;

import com.example.demoFirst.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepo extends JpaRepository<UserData,Integer> {
}
