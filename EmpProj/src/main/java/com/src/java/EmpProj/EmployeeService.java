package com.src.java.EmpProj;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	// getting all employee records
	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employee -> employees.add(employee));
		return employees;
	}

	// getting a specific record
	public Employee getEmployeeById(int id) {
		return employeeRepository.findOne(id);
	}

	// create or update the Employee
	public void saveOrUpdate(Employee employee) {
		employeeRepository.save(employee);
	}

	// deleting a specific record
	public void delete(int id) {
		employeeRepository.delete(id);
	}
}
