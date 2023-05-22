package com.example.medicare.UserAthentication;

import lombok.Data;

@Data
public class UserAthentication {

    private String email;
    private String password;


    public UserAthentication(){

    }


    public UserAthentication(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserAthentication{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
