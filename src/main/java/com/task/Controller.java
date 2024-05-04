package com.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Qualifier("imteacher")
	@Autowired Employee emp;
	@Autowired Entity e;
	
	@GetMapping("/get")
	public String get() {
		return emp.getMethod();
	}
	@GetMapping("/getName")
	public String getName() {
		return e.name;
	}
}
