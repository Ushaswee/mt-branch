package com.cts.project.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.project.pojo.User;

public interface UserRepository extends CrudRepository<User,String> {
	Iterable<User> findAll();
	 User findByUsernameAndPasswordAndConfirm(String username,String password,String confirm);
	 Optional<User> findByEmail(String email);
}
