package com.uuhnaut69.SpringCdcKafkaElastic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uuhnaut69.SpringCdcKafkaElastic.Entity.Employee;
import com.uuhnaut69.SpringCdcKafkaElastic.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/add")
	public void create(@RequestBody Employee employee) {
		employeeService.create(employee);
	}
}
