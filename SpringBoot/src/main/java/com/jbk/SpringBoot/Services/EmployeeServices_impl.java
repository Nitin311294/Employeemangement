package com.jbk.SpringBoot.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jbk.SpringBoot.Dao.EmployeeDao_I;

import com.jbk.SpringBoot.Entity.Employee;

@Service
@Transactional
public class EmployeeServices_impl implements  EmployeeServices_I {
	@Autowired
	private EmployeeDao_I dao;

	@Override
	public boolean saveEmployee(Employee employee) {
		boolean b=dao.saveEmployee(employee);
		return b;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getProfile(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> listOfEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee loginEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
