package com.cts.domain;

public class Developer extends Employee{
	private String skill;

	public Developer() {
		super();
	}

	public Developer(int empno, String name, int basicSalary,String skill) {
		super(empno,name,basicSalary);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public void display() {
		System.out.println(" Employee Number:"+getEmpno());
		System.out.println(" Employee Name:"+getName());
		System.out.println(" Salary:"+getBasicSalary());
		System.out.println(" Skill:"+skill);
	}

}
