package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Register a new user.
     * @param user the user to register
     * @return the registered user
     */
    public User save(User user) {
        // Additional business logic can be added here (e.g., password encryption)
        return userRepository.save(user);
    }

    /**
     * Find a user by email.
     * @param email the email to search for
     * @return an Optional containing the found user, or empty if not found
     */
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    /**
     * Authenticate a user by email and password.
     * @param email the user's email
     * @param password the user's password
     * @return an Optional containing the authenticated user, or empty if authentication fails
     */
    public Optional<User> findByEmailAndPassword(String email, String password) {
        // Here, you would typically compare the provided password with a stored hashed password
        return userRepository.findByEmailAndPassword(email, password);
    }

    /**
     * Retrieve a user by their ID.
     * @param id the user ID
     * @return an Optional containing the found user, or empty if not found
     */
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }
}