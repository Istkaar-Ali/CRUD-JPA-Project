package com.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

//  public List<User> findByName(String name);
//	public List<User> findByNameAndCity(String name, String city);
	
}
