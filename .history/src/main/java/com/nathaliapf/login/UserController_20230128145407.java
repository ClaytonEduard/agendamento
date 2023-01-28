package com.nathaliapf.login;

public class UserController{
    
    @Get
    public String showLoginPage(){
        return "index";
    }

}
