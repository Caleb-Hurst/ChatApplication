package com.coderscampus.ChatApp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coderscampus.ChatApp.domain.Channel;
import com.coderscampus.ChatApp.domain.Message;
import com.coderscampus.ChatApp.domain.User;
import com.coderscampus.ChatApp.service.ChannelService;
import com.coderscampus.ChatApp.service.UserService;

@Controller
public class ChannelController {
	@Autowired
	private UserService userService;
	@Autowired
	private ChannelService channelService;
//	@Autowired
//	private MessageService messageService;

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

	@GetMapping("/channel/{channelId}")
	public String getChannelData(@PathVariable Long channelId, Model model) {
	    Channel channel = channelService.findById(channelId);
	    model.addAttribute("channel", channel);
	    model.addAttribute("channelId", channel.getChannelId());
	    model.addAttribute("newMessage", new Message());
	    // add code to retrieve messages by channelId and add to model
	    return "channel";
	}
	
}
