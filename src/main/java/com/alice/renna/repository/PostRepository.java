package com.alice.renna.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.alice.renna.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	
}
