package com.cts.domain;

public class Manager extends Employee{
	private int perks;
	public Manager() {
		super();
	}
	public Manager(int empno, String name, int basicSalary,int perks) {
		super(empno,name,basicSalary);
		this.perks = perks;
	}

	public int getPerks() {
		return perks;
	}
	public void setPerks(int perks) {
		this.perks = perks;
	}
	
	public void display() {
		System.out.println(" Employee Number:"+getEmpno());
		System.out.println(" Employee Name:"+getName());
		System.out.println(" Salary:"+getBasicSalary());
	}
	public void calculateGross() {
		double ta=0.09*getBasicSalary();
		double da=0.11*getBasicSalary();
		double hra=0.06*getBasicSalary();
		double grossSalary=getBasicSalary()+ta+da+hra+perks;
		System.out.println("Gross Salary="+grossSalary);
	}

}
