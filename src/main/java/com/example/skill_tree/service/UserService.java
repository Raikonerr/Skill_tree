package com.example.skill_tree.service;



import com.example.skill_tree.DAO.UserDAO;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.HashMap;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;
    public String serviceLogin(String email,String password){
        HashMap<String,String> map = new HashMap<>();
        map.put("email",email);
        map.put("password",password);
        return new Gson().toJson(map);
    }
}
