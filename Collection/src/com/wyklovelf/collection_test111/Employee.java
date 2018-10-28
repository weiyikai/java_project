package com.wyklovelf.collection_test111;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 员工类
 * @author weiyikai
 *
 */
public class Employee {//javabean，实体类
	private int id;
	
	private String name;
	
	private int salary;
	
	private String department;
	
	private Date hireDate;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee(int id, String name, int salary, String department, String hireDate1){
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			this.hireDate = df.parse(hireDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
