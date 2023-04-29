package com.coderscampus.ChatApp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.coderscampus.ChatApp.domain.Channel;
import com.coderscampus.ChatApp.service.ChannelService;
import com.coderscampus.ChatApp.service.UserService;

@Controller
public class ChannelController {
	@Autowired
	private UserService userService;
	@Autowired 
	private ChannelService channelService;

	@GetMapping("/welcome")
	public String channel(ModelMap model) {
		List<Channel> channels = channelService.findAll();
		Channel channel = new Channel();
		model.put("channel", channel);
		model.put("channels", channels);
		return "welcome";
	}
	@PostMapping("/")
	public String newChannel(Channel channel) {
		channelService.save(channel);
		System.out.println(channel);
		return "redirect:/welcome";
	}
	

}
