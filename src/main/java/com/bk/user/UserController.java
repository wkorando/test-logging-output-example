package com.bk.user;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	private UserService service;
	
	
	@GetMapping
	public ResponseEntity<List<User>> findAllUsers(){
		return ResponseEntity.ok(service.findAllUsers());
	}
	
	@PostMapping
	public ResponseEntity<User> addNewUser(@RequestBody User user){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.addNewUser(user));
	}
}
