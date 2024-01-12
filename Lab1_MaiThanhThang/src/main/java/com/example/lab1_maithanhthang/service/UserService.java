package com.example.lab1_maithanhthang.service;

import com.example.lab1_maithanhthang.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService extends JpaRepository<User, Long> {
}
