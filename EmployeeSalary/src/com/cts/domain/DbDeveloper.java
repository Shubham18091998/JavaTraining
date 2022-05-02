package com.cts.domain;

public class DbDeveloper extends Employee{
	private String dbType;

	public DbDeveloper() {
		super();
	}

	public DbDeveloper(int empno, String name, int basicSalary, String dbType) {
		super(empno,name,basicSalary);
		this.dbType = dbType;
	};
	
	public String getDbType() {
		return dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	public void display() {
		System.out.println(" Employee Number:"+getEmpno());
		System.out.println(" Employee Name:"+getName());
		System.out.println(" Salary:"+getBasicSalary());
		System.out.println(" Database Type:"+dbType);
	}

}
