package com.ketul.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ketul.module.Employee;
import com.ketul.module.EmployeeService;

@RestController
public class EmployeeResource {

	@CrossOrigin(origins = "http://localhost:4200")
//	@GetMapping("/users")
//	public EmployeeService show() {
//		
//		Employee e1 = new Employee(1, "Ketul", "Java");
//		Employee e2 = new Employee(2, "Sunny", "JS");
//		
//		EmployeeService employeeService = new EmployeeService();
//		employeeService.setEmployee(Arrays.asList(e1, e2));
//		
//		return employeeService;
//	}
//	
	@GetMapping("/users")
	public List<Employee> show() {
		
		Employee e1 = new Employee(1, "Ketul", "Java");
		Employee e2 = new Employee(2, "Sunny", "JS");
		Employee e3 = new Employee(3, "Pinny", "Android");
		
		return Arrays.asList(e1, e2, e3);
	}
//	
//	@GetMapping("/users")
//	public Employee show() {
//		
//		Employee e1 = new Employee(1, "Ketul", "Java");
//		
//		
//		
//		return e1;
//	}
}
