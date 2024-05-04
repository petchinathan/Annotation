package com.task;

import org.springframework.stereotype.Component;

@Component("imteacher")
public class Teacher implements Employee{

	@Override
	public String getMethod() {
		return "study";
	}

}
