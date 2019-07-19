package com.uuhnaut69.SpringCdcKafkaElastic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uuhnaut69.SpringCdcKafkaElastic.Entity.Employee;

/**
 * @author uuhnaut
 *
 */
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

}
