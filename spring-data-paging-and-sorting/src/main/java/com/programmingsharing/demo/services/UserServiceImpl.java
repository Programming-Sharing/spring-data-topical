package com.programmingsharing.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
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
		Sort.by(new Sort.Order(Sort.Direction.DESC, "lastName", Sort.NullHandling.NULLS_FIRST));
		return userRepository.findUserByLastName(lastName, Sort.by(Sort.Direction.DESC, "lastName"));
	}
	
	@Override
	public	List<User> findAllUserPageble(){
		PageRequest secondPageWithTenEntries = PageRequest.of(2000, 10, Sort.by(Sort.Direction.DESC, "lastName"));
		return userRepository.findAll(secondPageWithTenEntries).getContent();
	}

}
