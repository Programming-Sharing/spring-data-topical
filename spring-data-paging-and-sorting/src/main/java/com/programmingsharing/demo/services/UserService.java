package com.programmingsharing.demo.services;

import java.util.List;

import com.programmingsharing.demo.entities.User;

public interface UserService {

	List<User> findAllUserByLastNameSortByLastNameDesc(String lastName);

	List<User> findAllUserPageble();

}
