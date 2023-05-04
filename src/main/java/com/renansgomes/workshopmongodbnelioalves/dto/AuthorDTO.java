package com.renansgomes.workshopmongodbnelioalves.dto;

import java.io.Serializable;

import com.renansgomes.workshopmongodbnelioalves.domain.User;

public class AuthorDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public AuthorDTO() {
	}

	public AuthorDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
