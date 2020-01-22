package com.crud.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository

public interface UserRepository<User,Long> extends CrudRepository<User, Long> {
	
	List<User> findByName(String name);
	
	
	

}

