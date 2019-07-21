package com.uuhnaut69.SpringCdcKafkaElastic.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uuhnaut69.SpringCdcKafkaElastic.Entity.Employee;
import com.uuhnaut69.SpringCdcKafkaElastic.Repository.EmployeeDAO;
import com.uuhnaut69.SpringCdcKafkaElastic.Service.EmployeeService;

/**
 * @author uuhnaut
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public void create(Employee employee) {
		// TODO Auto-generated method stub
		employeeDAO.save(employee);
	}

}
