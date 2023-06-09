package com.coderscampus.ChatApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderscampus.ChatApp.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

	User findByName(String name);
	

}
