package com.example.demojwt.repository;

import com.example.demojwt.model.Role;
import com.example.demojwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRoleRepository extends JpaRepository<Role,Long> {

    List<Role> findByUsers(User user);
}
