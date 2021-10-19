package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	public UserRepository userRepo;
	
	@PostMapping(value = "/login")
	public ResponseEntity<?> findByUsernameAndPassword(@RequestBody final User u){
		User user = (User) userRepo.findByUsernameAndPassword(u.getUsername(), u.getPassword());
		
		if(user != null) {
			return ResponseEntity
					.status(HttpStatus.OK)
					.body("login successfull");
		}
		else {
			return ResponseEntity
					.status(HttpStatus.BAD_REQUEST)
					.body("login failed");
		}
	}
	
//	@PostMapping(value = "/verify{id_token})
//	public ResponseEntity<?> verifier(){
//		
//	}
}
