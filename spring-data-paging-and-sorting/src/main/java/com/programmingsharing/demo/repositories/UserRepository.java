package com.programmingsharing.demo.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.programmingsharing.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	List<User> findUserByLastName(String lastname, Sort sort);
	
	List<User> findUserByLastName(String lastname, Pageable pagingInfo);

}