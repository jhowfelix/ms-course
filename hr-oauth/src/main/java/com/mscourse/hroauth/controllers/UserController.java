package com.mscourse.hroauth.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mscourse.hroauth.entities.User;
import com.mscourse.hroauth.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserService service;

	@GetMapping("/{email}")
	public ResponseEntity<User> findByEmail(@PathVariable String email){
		return ResponseEntity.ok(service.findByEmail(email));
	}
}
