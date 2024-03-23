package com.monitor.app.util;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.monitor.app.dto.UserDTO;
import com.monitor.app.entity.User;

@Component
public class Helper {


	public String createRandomString() {
		return UUID.randomUUID().toString();
	}
	
	public UserDTO convertToDTO(User user) {
		
		UserDTO dto = new UserDTO(user.getUserId(),user.getName(), user.getAbout());
		return dto;
	}
	
	public User convertToUser(UserDTO dto) {
		
		User user = new User(dto.getUserId(), dto.getName(),dto.getAbout());
		return user;
	}
}
