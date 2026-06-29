package com.tppg.repo;

import com.tppg.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Example of a custom finder method
    User findByEmail(String email);
}
