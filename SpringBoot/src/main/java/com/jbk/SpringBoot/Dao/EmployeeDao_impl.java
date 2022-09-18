package com.jbk.SpringBoot.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.SpringBoot.Entity.Employee;

@Repository
public class EmployeeDao_impl implements EmployeeDao_I {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveEmployee(Employee employee) {
	
		boolean b=false;
		Session  session=sessionFactory.openSession();
		session.save(employee);
		b=true;
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
