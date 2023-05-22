package com.example.medicare.repository;

import com.example.medicare.entity.Member;
//import com.example.medicare.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface MemberRepository extends JpaRepository<Member,Integer> {

    Member findByEmail(String email);
}
