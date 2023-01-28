package com.nathaliapf.user;

import java.util.Optional;

import org.springframework.stereotype.Service;

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
