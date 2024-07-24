package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    // Custom query method to find a User by their email
    Optional<User> findByEmail(String email);
    
    // Custom query method to find a User by their email and password
    Optional<User> findByEmailAndPassword(String email, String password);
}