package com.renansgomes.workshopmongodbnelioalves.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.renansgomes.workshopmongodbnelioalves.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
