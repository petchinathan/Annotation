package com.task.scopOfBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component
public class Employee {
	private String name;
	public Employee() {
		System.out.println("bean is created");
	}
	public String getName() {
		return name;
	}
	@Value("petchi")
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
}
