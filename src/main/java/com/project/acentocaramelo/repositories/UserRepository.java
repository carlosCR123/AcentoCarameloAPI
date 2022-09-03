package com.project.acentocaramelo.repositories;

import com.project.acentocaramelo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}