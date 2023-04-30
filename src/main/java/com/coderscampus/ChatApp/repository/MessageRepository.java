package com.coderscampus.ChatApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderscampus.ChatApp.domain.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

//	List<Message> findByChannelName(String channelName);

}
