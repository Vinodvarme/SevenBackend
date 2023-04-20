package com.example.demoFirst.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="userdata")
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutorial_generator")
    @Column(name="id")
    public int id;
    @Column(name="name")
    public String name;

}
