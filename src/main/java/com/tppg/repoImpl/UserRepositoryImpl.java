package com.tppg.repoImpl;

import com.tppg.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    // Example: Find users by name using JPQL
    public List<User> findUsersByName(String name) {
        return entityManager.createQuery(
                "SELECT u FROM User u WHERE u.name = :name", User.class)
                .setParameter("name", name)
                .getResultList();
    }

    // Example: Find users with email domain using Criteria API
    public List<User> findUsersByEmailDomain(String domain) {
        return entityManager.createQuery(
                "SELECT u FROM User u WHERE u.email LIKE :domain", User.class)
                .setParameter("domain", "%" + domain)
                .getResultList();
    }
}
