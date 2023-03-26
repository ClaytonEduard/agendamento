package com.nathaliapf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nathaliapf.services.UserService;

@Controller
public class UserController{
    
    private UserService service;

    @GetMapping("/")
    public String showLoginPage(){
        return "index.html";
    }

    @PostMapping("/auth")
    public String authentication() {
        this.service.getUserByNickName();
        return "true";
    }

    @PostMapping("/cad")
    public void cadastar(){
        this.service.createOrUpdate(null);
    }

}
