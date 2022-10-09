package com.jwt.repository;

import com.jwt.model.Role;
import com.jwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRoleRepository extends JpaRepository<Role, Long> {

    List<Role> findByUsers(User user);
}
