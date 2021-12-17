package com.mscourse.hruser.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mscourse.hruser.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserController {
	
	User user = new User(1l, "jhow", "jasjdw", "jahsdw");
	
	
	@GetMapping
	public User teste() {
		return user;
	}

}
