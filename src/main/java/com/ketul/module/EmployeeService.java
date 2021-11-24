package com.ketul.module;

import java.util.List;

public class EmployeeService {

	private List<Employee> employee;

	public EmployeeService() {
		super();
	}

	public EmployeeService(List<Employee> employee) {
		super();
		this.employee = employee;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeService [employee=" + employee + "]";
	}
}
