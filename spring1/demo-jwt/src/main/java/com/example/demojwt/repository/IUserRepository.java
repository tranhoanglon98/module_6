package com.example.demojwt.repository;

import com.example.demojwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
    User findByUserName(String username);
}
