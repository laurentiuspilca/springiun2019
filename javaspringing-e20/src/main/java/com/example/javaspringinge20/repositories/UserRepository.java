package com.example.javaspringinge20.repositories;

import com.example.javaspringinge20.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findUserByUsername(String username);
}
