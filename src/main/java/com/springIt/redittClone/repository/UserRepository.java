package com.springIt.redittClone.repository;

import com.springIt.redittClone.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndActivationCode(String email, String activationCode);
}
