package com.task;

import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("imdoctor")
public class Doctor implements Employee {

	@Override
	public String getMethod() {
		return "medicine";
	}

}
