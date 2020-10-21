/**
 * 
 */
package com.src.java.EmpProj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest Controller class for Employee
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeController {

	// autowired the EmployeeService class
	@Autowired
	EmployeeService employeeService;

	// creating a get mapping that retrieves all the employees detail from the
	// database
	@GetMapping("/employee")
	private List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	// creating a get mapping that retrieves the detail of a specific Employee
	@GetMapping("/employee/{id}")
	private Employee getEmployee(@PathVariable("id") int id) {
		return employeeService.getEmployeeById(id);
	}

	// creating a delete mapping that deletes a specific Employee
	@DeleteMapping("/delete/{id}")
	private void deleteEmployee(@PathVariable("id") int id) {
		employeeService.delete(id);
	}

	// creating a post mapping that create the Employee in the database
	@PostMapping("/create")
	private int createEmployee(@RequestBody Employee employee) {
		employeeService.saveOrUpdate(employee);
		return employee.getId();
	}

	// creating a put mapping that update the Employee detail in the database
	@PutMapping("/update")
	private int updateEmployee(@RequestBody Employee employee) {
		employeeService.saveOrUpdate(employee);
		return employee.getId();
	}
}
