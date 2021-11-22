package com.team.ibmwatson.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.team.ibmwatson.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	Optional<User> findByUsername(String username);

	List<User> findAll();

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);

	boolean existsByEmpId(int empId);

	Optional<User> findById(String id);
}