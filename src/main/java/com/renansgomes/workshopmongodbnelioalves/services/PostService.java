package com.renansgomes.workshopmongodbnelioalves.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renansgomes.workshopmongodbnelioalves.domain.Post;
import com.renansgomes.workshopmongodbnelioalves.repository.PostRepository;
import com.renansgomes.workshopmongodbnelioalves.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto n�o encontrado"));
	}
}
