package com.coderscampus.ChatApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.coderscampus.ChatApp.domain.Message;
import com.coderscampus.ChatApp.repository.MessageRepository;


public class MessageService {

	@Autowired
	private MessageRepository messageRepo;

//	public List<Message> findByChannelName(String channelName) {
//		
//		return messageRepo.findByChannelName(channelName);
//	}
	

}
