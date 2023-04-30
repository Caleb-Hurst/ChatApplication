package com.coderscampus.ChatApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderscampus.ChatApp.domain.Channel;

public interface ChannelRepository extends JpaRepository <Channel, Long>{



}
