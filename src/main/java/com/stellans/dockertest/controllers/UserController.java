package com.stellans.dockertest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stellans.dockertest.controllers.entities.User;
import com.stellans.dockertest.controllers.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	UserRepository repository;
	@RequestMapping(value = "/getuser", method = RequestMethod.GET)
	public ResponseEntity<?> getUsers() {
		User user = new User();
		user.setName("asdf");
		user.setAddress("tvm");
		return ResponseEntity.ok().body(user);
	}

	@RequestMapping(value = "/adduser", method = RequestMethod.GET)
	public ResponseEntity<?> addUsers(@RequestParam String name, @RequestParam String address) {
		User user = new User();
		user.setName(name);
		user.setAddress(address);
		repository.save(user);
		return ResponseEntity.ok().body(user);
	}
}
