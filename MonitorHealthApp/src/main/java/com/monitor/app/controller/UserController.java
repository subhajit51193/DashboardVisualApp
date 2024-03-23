package com.monitor.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monitor.app.dto.UserDTO;
import com.monitor.app.entity.User;
import com.monitor.app.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/user/add")
	public ResponseEntity<UserDTO> createUserHandler(@RequestBody User user){
		UserDTO dto = userService.addUser(user);
		return new ResponseEntity<UserDTO>(dto,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<UserDTO> getUserByIdHandler(@PathVariable String id){
		UserDTO dto = userService.getUserById(id);
		return new ResponseEntity<UserDTO>(dto,HttpStatus.OK);
	}
	
	@GetMapping("/user/all")
	public ResponseEntity<List<UserDTO>> getAllUsers(){
		List<UserDTO> dtoList = userService.getAllUsers();
		return new ResponseEntity<List<UserDTO>>(dtoList,HttpStatus.OK);
	}
}
