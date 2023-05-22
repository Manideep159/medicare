package com.example.medicare.repository;

import com.example.medicare.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface AdminRepository extends JpaRepository<Admin,Integer> {
    Admin findByEmailAndPassword(String email, String password);

}
