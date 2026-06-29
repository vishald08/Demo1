package com.tppg.service;

import org.springframework.stereotype.Service;

import com.tppg.entity.User;

import java.util.List;
import java.util.Optional;

// import com.tppg.repo.UserRepository; // ❌ Commented out for now

import java.util.ArrayList;

@Service
public class UserService {

    // private final UserRepository userRepository; // ❌ Commented out

    // Hardcoded list for demo purposes
    private List<User> users = new ArrayList<>();

    public UserService() {
        // Add some dummy users
        users.add(new User("Vishal", "vishal@example.com"));
        users.add(new User("Rahul", "rahul@example.com"));
    }

    // CREATE
    public User createUser(User user) {
        users.add(user);
        return user;
    }

    // READ - All
    public List<User> getAllUsers() {
        return users;
    }

    // READ - By ID (simulate with index)
    public Optional<User> getUserById(Long id) {
        if (id >= 0 && id < users.size()) {
            return Optional.of(users.get(id.intValue()));
        }
        return Optional.empty();
    }

    // UPDATE
    public User updateUser(Long id, User userDetails) {
        if (id >= 0 && id < users.size()) {
            User user = users.get(id.intValue());
            user.setName(userDetails.getName());
            user.setEmail(userDetails.getEmail());
            return user;
        }
        throw new RuntimeException("User not found");
    }

    // DELETE
    public void deleteUser(Long id) {
        if (id >= 0 && id < users.size()) {
            users.remove(id.intValue());
        } else {
            throw new RuntimeException("User not found");
        }
    }
}
