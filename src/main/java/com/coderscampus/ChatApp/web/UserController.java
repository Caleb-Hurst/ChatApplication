package com.coderscampus.ChatApp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderscampus.ChatApp.domain.User;
import com.coderscampus.ChatApp.service.ChannelService;
import com.coderscampus.ChatApp.service.UserService;

@Controller

public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private ChannelService channelService;



	@GetMapping("/user")
	@ResponseBody
	public User findByName(@RequestParam String name) {
		User user = userService.findByName(name);
		if (user == null) {
			user = new User();
			user.setName(name);
			userService.save(user);
			return user;
		}
		return user;
	}

}
