package com.nayaz.springboot.jpa.jpapractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nayaz.springboot.jpa.jpapractice.entities.User;
import com.nayaz.springboot.jpa.jpapractice.service.UserDAOService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {
	
	private static Logger log  = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	@Autowired
	UserDAOService userDAOService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("Nayaz", "Admin");
		long id = userDAOService.insert(user);
		User user1 = new User("Nayaz JH", "Dev");
		long id1 = userDAOService.insert(user1);
		log.info("New User Id is created: " +user1);
		
	}
	
	

}
