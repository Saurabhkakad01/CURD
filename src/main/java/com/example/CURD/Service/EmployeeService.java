package com.example.CURD.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CURD.Dao.EmployeeDao;
import com.example.CURD.Entity.Employee;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public Employee registerEmployee(Employee employee) {
		return employeeDao.registerEmployee(employee);
		
	}

	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeeDao.registerEmployee(employee);
	}
	
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
	}

}
