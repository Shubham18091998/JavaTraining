package com.cts.domain;

public class Developer  extends Employee {
	private String skill;

	public Developer() {
		super();
	}

	public Developer(int empno, String name, int basicSalary, String panNo,String skill) {
		super(empno,name,basicSalary,panNo);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public void  displayDetails() {
		System.out.println(" Employee Number:"+getEmpno());
		System.out.println(" Employee Name:"+getName());
		System.out.println(" Salary:"+getBasicSalary());
		System.out.println(" Pan No:"+getPanNo());
		System.out.println(" Skill:"+skill);
	}
	

}
