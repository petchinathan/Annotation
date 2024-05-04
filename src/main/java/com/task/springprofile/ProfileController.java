package com.task.springprofile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
	@Autowired
	Demo e;
	
	@GetMapping("/getValue") 
	public String get() {
		return e.value;
	}
}
