package com.gl.Lab5Assignment.service;

import java.util.List;

import com.gl.Lab5Assignment.model.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee e2);

	List<Employee> getAllEmployees();

	Employee getEmployee(int empid);

	Employee updateEmployee(int empid, Employee e3);

	void deleteEmployee(int id);

}