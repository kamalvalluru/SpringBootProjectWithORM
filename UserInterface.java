package com.spring.first.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.first.entities.User;

public interface UserInterface extends CrudRepository<User, Integer>
{

}
