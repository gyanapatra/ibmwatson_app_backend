package com.team.ibmwatson.repository;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.team.ibmwatson.model.ERole;
import com.team.ibmwatson.model.Role;




public interface RoleRepository extends MongoRepository<Role, String> {
	  Optional<Role> findByName(ERole name);
	}