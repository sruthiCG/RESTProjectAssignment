package com.src.java.EmpProj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Create a model class for Employee
 */
@Entity
@Table(name = "EMPLOYEES")
public class Employee {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private String dept;

	public Employee() {

	}

	// Generate Constructor Using Fields
	public Employee(int id, String name, int age, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

	// Generate Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
