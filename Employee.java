package com.hibernate;

import org.hibernate.annotations.ValueGenerationType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeeInfo")
public class Employee {
	@Id
	/*
	 * @GeneratedValue(strategy = GenerationType.AUTO, generator =
	 * "empid_generator")
	 * 
	 * @SequenceGenerator(name = "empid_generator", initialValue = 1, allocationSize
	 * = 1)
	 */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	@Column(name = "emp_name")
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	private int empSalary;
	@Override
	public String toString() {
		return "empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary;
	}
	
}
