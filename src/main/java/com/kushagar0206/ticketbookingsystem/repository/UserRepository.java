package com.kushagar0206.ticketbookingsystem.repository;

import com.kushagar0206.ticketbookingsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

}

