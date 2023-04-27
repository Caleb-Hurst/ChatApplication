package com.coderscampus.ChatApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.ChatApp.domain.Channel;
import com.coderscampus.ChatApp.repository.ChannelRepository;
@Service
public class ChannelService {
	@Autowired
	ChannelRepository channelRepo;

	public Channel save(Channel channel) {		
		return channelRepo.save(channel);
	}

	public List<Channel> findAll() {
		
		return channelRepo.findAll();
	}

	public Channel findById(Long id) {
		return channelRepo.findById(id).get();
	}

	public Channel createNewChannel() {
		Channel channel = new Channel();
		channel.setName("stuff");
		
		return channelRepo.save(channel);
	}

}