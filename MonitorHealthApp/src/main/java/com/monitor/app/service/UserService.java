package com.monitor.app.service;

import java.util.List;

import com.monitor.app.dto.UserDTO;
import com.monitor.app.entity.User;

public interface UserService {

	UserDTO addUser(User user);
	
	UserDTO getUserById(String userId);
	
	List<UserDTO> getAllUsers();
}
