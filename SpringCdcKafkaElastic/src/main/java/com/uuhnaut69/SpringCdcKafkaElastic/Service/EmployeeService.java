package com.uuhnaut69.SpringCdcKafkaElastic.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uuhnaut69.SpringCdcKafkaElastic.Entity.Employee;
import com.uuhnaut69.SpringCdcKafkaElastic.Repository.EmployeeDAO;

/**
 * @author uuhnaut
 *
 */
@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	public void create(Employee employee) {
		employeeDAO.save(employee);
	}

}
