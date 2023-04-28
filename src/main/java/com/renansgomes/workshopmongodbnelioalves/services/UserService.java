package com.renansgomes.workshopmongodbnelioalves.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renansgomes.workshopmongodbnelioalves.domain.User;
import com.renansgomes.workshopmongodbnelioalves.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
