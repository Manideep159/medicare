package com.example.medicare.controller;

import com.example.medicare.entity.Admin;
import com.example.medicare.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/addAdmin")
    public ResponseEntity<?> addAdmin(@RequestBody Admin admin) {
        return new ResponseEntity<>(adminService.addAdmin(admin), HttpStatus.CREATED);
    }

    @PostMapping("/checkAdmin")
    public ResponseEntity<?> getAdmin(@RequestBody Admin admin) {
        System.out.println("checkAdmin api hitted");
        return new ResponseEntity<>(adminService.getAdmin(admin),HttpStatus.OK);
    }
    }
