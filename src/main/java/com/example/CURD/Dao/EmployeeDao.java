package com.example.CURD.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.CURD.Entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class EmployeeDao {
	
	@Autowired
	@PersistenceContext
	private EntityManager em;

	public Employee registerEmployee(Employee employee) {
		return em.merge(employee);
	}

	public List<Employee> getAllEmployee() {
		return em.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
	}
	
	public Employee updateEmployee(Employee employee) {
		return em.merge(employee);
	}
	
	public void deleteEmployee(int id) {
		Employee emp = em.find(Employee.class, id);
		if (emp != null) {
			em.remove(emp);
		}
	}

}

