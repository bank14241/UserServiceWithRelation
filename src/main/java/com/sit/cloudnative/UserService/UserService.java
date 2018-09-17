package com.sit.cloudnative.UserService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	public User create(User user) {
		return userRepository.save(user);
	}
}