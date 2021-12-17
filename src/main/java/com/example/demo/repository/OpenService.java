package com.example.demo.repository;

import com.example.demo.model.User;
import com.example.demo.registration.UserRegister;

public interface OpenService {

    boolean registerUser(UserRegister userRegister);
    public void makeUserVerified(User user,int code);
}
