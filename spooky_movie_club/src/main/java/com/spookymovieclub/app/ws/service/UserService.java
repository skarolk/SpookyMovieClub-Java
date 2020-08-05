package com.spookymovieclub.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.spookymovieclub.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {

	UserDto createUser(UserDto user);

	UserDto getUser(String email);

	UserDto getUserByUserId(String userId);

	UserDto updateUser(String userId, UserDto user);

}
