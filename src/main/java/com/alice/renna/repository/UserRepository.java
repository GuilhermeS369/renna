package com.alice.renna.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.alice.renna.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
	
}
