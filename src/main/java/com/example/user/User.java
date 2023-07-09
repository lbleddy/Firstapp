package com.example.user;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "userdata")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
}
