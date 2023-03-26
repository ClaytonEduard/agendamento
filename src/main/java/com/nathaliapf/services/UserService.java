package com.nathaliapf.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nathaliapf.model.User;
import com.nathaliapf.repository.UserRepository;

@Service
public class UserService {
    
    private UserRepository repository;

    public Optional<User> getUserByNickName(){
        return this.repository.findById(1L);
    }

    public void createOrUpdate(User user){
        this.repository.save(user);
    }

}
