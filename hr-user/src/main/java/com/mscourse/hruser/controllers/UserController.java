package com.mscourse.hruser.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mscourse.hruser.entities.User;

import com.mscourse.hruser.repositories.userRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private userRepository repo;

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		return ResponseEntity.ok(repo.findById(id).get());
	}

	@GetMapping
	public List<User> findAll() {
		return repo.findAll();
	}

	@GetMapping(value = "/search/{email}")
	public ResponseEntity<User> findByEmail(@PathVariable String email) {
		return ResponseEntity.ok(repo.findByEmail(email));
	}

}
