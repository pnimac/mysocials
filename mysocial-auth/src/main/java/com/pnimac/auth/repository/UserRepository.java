package com.pnimac.auth.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pnimac.auth.model.User;

public interface UserRepository extends MongoRepository<User,String> {

	Optional<User> findByUsername(String userName);
	List<User> findByUserNameIN(List<String> userNames);
	Boolean existByUserName(String userName);
	Boolean existByEmail(String email);
}
