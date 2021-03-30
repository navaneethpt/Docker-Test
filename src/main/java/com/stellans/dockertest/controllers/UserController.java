package com.stellans.dockertest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
@RequestMapping(value="/getuser",method=RequestMethod.GET)
	public ResponseEntity<?> getUsers(){
		User user=new User();
		user.setName("asdf");
		user.setId("1");
		user.setAddress("tvm");
		return ResponseEntity.ok().body(user);
	}
}
