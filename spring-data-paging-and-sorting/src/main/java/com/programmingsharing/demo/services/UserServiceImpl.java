package com.programmingsharing.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.programmingsharing.demo.entities.User;
import com.programmingsharing.demo.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public	List<User> findAllUserByLastNameSortByLastNameDesc(String lastName){
		return userRepository.findUserByLastName(lastName, Sort.by(Sort.Direction.DESC, "lastName"));
	}
	
	@Override
	public	List<User> findAllUserSortByLastNameDesc(){
		return userRepository.findAll(Sort.by(Sort.Direction.DESC, "lastName"));
	}

}
