package com.jbk.SpringBoot.Services;

import java.util.List;

import com.jbk.SpringBoot.Entity.Employee;

public interface EmployeeServices_I {
	
	public boolean saveEmployee(Employee employee );
	public boolean deleteEmployee(int id);
	public String updateEmployee(Employee  employee);
	public Employee getProfile(int id);
	public List<Employee> listOfEmployee();
	public Employee loginEmployee(Employee employee);
	


}
