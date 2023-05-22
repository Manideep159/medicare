package com.example.medicare.service;

import com.example.medicare.entity.Admin;
import com.example.medicare.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;

    public Admin addAdmin(Admin admin){
        return adminRepository.save(admin);
    }
    public Admin getAdmin(Admin admin){
        return adminRepository.findByEmailAndPassword(admin.getEmail(),admin.getPassword());
    }

}
