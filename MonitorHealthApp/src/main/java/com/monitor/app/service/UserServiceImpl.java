package com.monitor.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monitor.app.dto.UserDTO;
import com.monitor.app.entity.User;
import com.monitor.app.repository.UserRepository;
import com.monitor.app.util.Helper;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private Helper helper;
	
	@Override
	public UserDTO addUser(User user) {
		User savedUser = userRepository.save(user);
		UserDTO dto = helper.convertToDTO(savedUser);
		return dto;
	}

	@Override
	public UserDTO getUserById(String userId) {
		User user = userRepository.findById(userId).get();
		UserDTO dto = helper.convertToDTO(user);
		return dto;
	}

	@Override
	public List<UserDTO> getAllUsers() {
		
		List<UserDTO> dtoList = new ArrayList<>();
		List<User> users = userRepository.findAll();
		for (User user: users) {
			UserDTO dto = helper.convertToDTO(user);
			dtoList.add(dto);
		}
		return dtoList;
	}

	
}
