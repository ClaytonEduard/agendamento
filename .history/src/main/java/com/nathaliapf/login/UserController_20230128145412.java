package com.nathaliapf.login;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController{
    
    @GetMapping("")
    public String showLoginPage(){
        return "index";
    }

}
