package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.UserService;
import com.demo.user.User;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@RestController
@CrossOrigin(origins="*")

public class UserController {
	@Autowired
	private UserService service;
	
	
	@PostMapping("login")
	public User login(User user){
      return 	service.login(user);
	}
	
	
	@PostMapping("add")
	public void add(User user)
	{
			service.add(user);
	}
	
	
	@PostMapping("logout")
	public void logout(String email)
	{
		service.logout(email);
	}
	
	@GetMapping("getAll")
	public List<User> findAll()
	{
	return 	service.findAll();
	}
	
	
}
