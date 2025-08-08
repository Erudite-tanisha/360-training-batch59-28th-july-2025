package com.example.Relational.Mapping.repo;

import com.example.Relational.Mapping.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
