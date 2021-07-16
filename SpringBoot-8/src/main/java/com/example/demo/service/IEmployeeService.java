package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.Employee;

public interface IEmployeeService {
	public List<Employee> getAllEmployees();
	public Employee getEmployeeWithId(int empId);
	public Employee addEmployee(Employee emp);

	public Employee updateEmployee(int empId, Employee emp);
	public void deleteEmployee(int empId);
	
	List<Employee> getEmployeeByName(String name);
	List<Employee> getEmployeeBySalary(float lower, float higher);

}
