package com.cts.domain;

public class Manager extends Employee {
	private int noOfPeople;
	private int perks;
	
	public Manager() {
		super();
	}
	
	public Manager(int empno, String name,int basicSalary, String panNo, int noOfPeople, int perks) {
		super(empno,name,basicSalary,panNo);
		this.noOfPeople = noOfPeople;
		this.perks = perks;
	}

	public int getNoOfPeople() {
		return noOfPeople;
	}
	public void setNoOfPeople(int noOfPeople) {
		this.noOfPeople = noOfPeople;
	}
	public int getPerks() {
		return perks;
	}
	public void setPerks(int perks) {
		this.perks = perks;
	}
	public void displayDetails() {
		System.out.println(" Employee Number:"+getEmpno());
		System.out.println(" Employee Name:"+getName());
		System.out.println(" Salary:"+getBasicSalary());
		System.out.println(" Pan No:"+getPanNo());
		System.out.println(" Number of reporting:"+noOfPeople);
		System.out.println(" Perks:"+perks);
	}

}
