package com.nayaz.springboot.jpa.jpapractice.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nayaz.springboot.jpa.jpapractice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
