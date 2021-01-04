package com.programmingsharing.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.programmingsharing.demo.entities.User;
import com.programmingsharing.demo.services.UserService;

@SpringBootApplication
public class SpringDataPagingAndSortingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDataPagingAndSortingApplication.class, args);
	}

	@Autowired
	private UserService userService;

	@Override
	public void run(String... args) throws Exception {
		userService.findAllUserSortByLastNameDesc().forEach(user -> System.out.println(user.getLastName()));
		
	}

}
