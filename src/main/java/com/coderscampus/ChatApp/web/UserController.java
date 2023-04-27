package com.coderscampus.ChatApp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coderscampus.ChatApp.domain.Channel;
import com.coderscampus.ChatApp.domain.User;
import com.coderscampus.ChatApp.service.ChannelService;
import com.coderscampus.ChatApp.service.UserService;

@Controller

public class UserController {
	@Autowired
	private UserService userService;
	@Autowired 
	private ChannelService channelService;
	


}
