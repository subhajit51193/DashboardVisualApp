package com.monitor.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {

	private Integer userId;
	private String name;
	private String about;
	
	public UserDTO(String name, String about) {
		super();
		this.name = name;
		this.about = about;
	}
	
	
}
