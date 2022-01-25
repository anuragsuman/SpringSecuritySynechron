package com.spring.security.jwt.example.repository;

import com.spring.security.jwt.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {


    User findByUsername(String username);

}
