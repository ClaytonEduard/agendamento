package com.nathaliapf.repository;

import org.springframework.data.repository.CrudRepository;

import com.nathaliapf.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
    
}
