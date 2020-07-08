package com.devi.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devi.db.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

	  	List<Users> findByFirstname(String name);

	
	  
	}
