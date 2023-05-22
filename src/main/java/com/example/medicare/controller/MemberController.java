package com.example.medicare.controller;

import com.example.medicare.UserAthentication.UserAthentication;
import com.example.medicare.entity.Member;
//import com.example.medicare.entity.User;
import com.example.medicare.service.MemberService;
//import com.example.medicare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/user")
public class MemberController {

    @Autowired
    MemberService userService;

    @PostMapping("/adduser")
    public Member save(Member member){
        return userService.addUser(member);
    }
    @PostMapping("/checkUser")
    public Member AuthenticateUser(@RequestBody UserAthentication member) {
        System.out.println("API hitting");
        System.out.println(member);

        System.out.println("Authenticate user API calling");

      Member m = userService.AuthenticateUser(member);
        System.out.println(m);

        return m;
    }
    @GetMapping("/allUsers")
    public List<Member> allUsers(){
        return userService.allUsers();
    }
    @GetMapping("/getUser/{id}")
    public Optional<Member> getUser(@PathVariable("id")int id)
    {
        System.out.println("getUser api hitting...");
        return userService.getUser(id);
    }


}
