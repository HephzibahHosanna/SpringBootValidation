package com.example.SpringBootValidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootValidation.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{


}
