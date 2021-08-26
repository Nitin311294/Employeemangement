package com.jbk.SpringBoot.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.SpringBoot.Entity.Employee;
import com.jbk.SpringBoot.Services.EmployeeServices_I;
import com.jbk.SpringBoot.Services.EmployeeServices_impl;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServices_I services;

	@PostMapping(value="/saveEmployee")
	public boolean saveEmployee(@RequestBody Employee employee ) {
		
		boolean b=services.saveEmployee(employee);
		return b;
		
	}
}
