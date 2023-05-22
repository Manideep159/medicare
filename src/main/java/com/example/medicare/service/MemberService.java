package com.example.medicare.service;

import com.example.medicare.UserAthentication.UserAthentication;
import com.example.medicare.entity.Member;
//import com.example.medicare.entity.User;
import com.example.medicare.repository.MemberRepository;
//import com.example.medicare.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    MemberRepository userRepository;

    public Member addUser(Member member){
        return userRepository.save(member);
    }
    public Member AuthenticateUser(UserAthentication member){
        Member m=userRepository.findByEmail(member.getEmail());

        if(m!=null){
            if(m.getPassword().equals(member.getPassword())){
                return m;
            }else {
                return null;
            }
        }
        return null;
    }

    public List<Member> allUsers(){
        return userRepository.findAll();
    }

    public Optional<Member> getUser(int id){
       return userRepository.findById(id);
    }
//    public User updateUser(User user,int id){
//        Optional<User> newUser= userRepository.findById(id);
//        newUser.setName(user.getName());
//        newUser.setEmail(user.getEmail());
//        newUser.setPassword(user.getPassword());
//        newUser.setCountry(user.getCountry());
//        return userRepo.save(newUser);
//    }
}
