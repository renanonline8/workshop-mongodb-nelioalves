package com.renansgomes.workshopmongodbnelioalves.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.renansgomes.workshopmongodbnelioalves.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
