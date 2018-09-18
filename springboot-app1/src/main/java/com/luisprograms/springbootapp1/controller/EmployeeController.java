package com.luisprograms.springbootapp1.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luisprograms.springbootapp1.model.Employee;

@RestController
public class EmployeeController {
	
	private static Map<String, Employee> mapOfEmployees = new HashMap<String, Employee>();
	
	/*Employee employee1 = new Employee("1", "Luis", "Segura", "Java Developer");*/
	
	public EmployeeController() {
		Employee employee1 = new Employee("1", "Luis", "Segura", "Java Developer");
		mapOfEmployees.put(employee1.getId(), employee1);
	}
	
	
	@RequestMapping(value = "/employees")
	public ResponseEntity<Object> getEmployees() {
		return new ResponseEntity<>(mapOfEmployees.values(), HttpStatus.OK);
		
	}

}
