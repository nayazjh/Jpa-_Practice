package com.nayaz.springboot.jpa.jpapractice;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nayaz.springboot.jpa.jpapractice.entities.User;
import com.nayaz.springboot.jpa.jpapractice.service.UserRepository;

public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static Logger log  = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("Nayaz J H", "Devops");
		userRepository.save(user);
		User user1 = new User("Nayaz JH", "Java Full Stack");
		userRepository.save(user1);
		log.info("New User Id is created: " +user1);
		
		Optional<User> userWIthId= userRepository.findById(1L);
		log.info("User Retrived by Id : " +userWIthId);
		
		List<User> allUsers = userRepository.findAll();
		log.info("All User Retrived  : " +allUsers);


		
	}
	
}
