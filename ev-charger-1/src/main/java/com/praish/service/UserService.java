package com.praish.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.praish.model.User;
import com.praish.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}