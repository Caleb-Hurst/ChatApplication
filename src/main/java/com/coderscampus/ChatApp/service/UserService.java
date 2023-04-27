package com.coderscampus.ChatApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.ChatApp.domain.User;
import com.coderscampus.ChatApp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	public User save(User user) {
		return userRepo.save(user);
	}
	
	public List<User> findAll(){
		return userRepo.findAll();
	}
	
	public User findById(Long id) {
		return userRepo.findById(id).get();
	}

}
