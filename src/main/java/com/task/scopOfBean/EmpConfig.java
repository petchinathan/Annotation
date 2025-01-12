package com.task.scopOfBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig implements CommandLineRunner{
	@Autowired
	ApplicationContext ac;
	
	@Override
	public void run(String... args) throws Exception {
		Employee e1 = ac.getBean(Employee.class);
		System.out.println(e1);
		Employee e2 = ac.getBean(Employee.class);
		e2.setName("nathan");
		System.out.println(e2);
		Employee e3 = ac.getBean(Employee.class);
		System.out.println(e3);
	}
}
