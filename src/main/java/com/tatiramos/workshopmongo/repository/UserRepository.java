package com.tatiramos.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tatiramos.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	

}
