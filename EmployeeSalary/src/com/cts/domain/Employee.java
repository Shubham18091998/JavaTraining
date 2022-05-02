package com.cts.domain;

public class Employee {
	private int empno;
	private String name;
	private int basicSalary;
	public Employee() {
		super();
	}
	public Employee(int empno, String name, int basicSalary){
		super();
		this.empno = empno;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public void display() {
		System.out.println(" Employee Number:"+getEmpno());
		System.out.println(" Employee Name:"+getName());
		System.out.println(" Salary:"+getBasicSalary());
	}
	public void calculateGross() {
		double ta=0.08*basicSalary;
		double da=0.1*basicSalary;
		double hra=0.05*basicSalary;
		double grossSalary=basicSalary+ta+da+hra;
		System.out.println("Gross Salary="+grossSalary);
	}
	
}
