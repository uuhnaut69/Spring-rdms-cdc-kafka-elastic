package com.uuhnaut69.SpringCdcKafkaElastic.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author uuhnaut
 *
 */
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private String job;
	private String companyName;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int age, String job, String companyName) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.job = job;
		this.companyName = companyName;
	}

	public int getId() {
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", job=" + job + ", companyName="
				+ companyName + "]";
	}

}
