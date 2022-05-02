package com.cts.domain;

public class Employee {
	private int empno;
	private String name;
	private int basicSalary;
	private String panNo;
	
	public Employee() {
		super();
	}
	
	public Employee(int empno, String name, int basicSalary, String panNo) {
		super();
		this.empno = empno;
		this.name = name;
		this.basicSalary = basicSalary;
		this.panNo=panNo;
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
	
	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public void displayDetails() {
		System.out.println(" Employee Number:"+getEmpno());
		System.out.println(" Employee Name:"+getName());
		System.out.println(" Salary:"+getBasicSalary());
		System.out.println(" Pan No:"+getPanNo());
	}
	

}
