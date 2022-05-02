package com.cts.application;
import com.cts.domain.Employee;
import com.cts.domain.DbDeveloper;
import com.cts.domain.Developer;
import com.cts.domain.Manager;
public class EmployeeApplication {
	
	public static void print(Employee emp) {
		System.out.println("-------------------------");
		emp.display();
		System.out.println("-------------------------");		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp;
		emp=new Manager(101,"Akshay",25000,1500);
		print(emp);
		emp.calculateGross();
		emp=new Developer(102,"Devansh",30000,"Python");
		print(emp);
		emp.calculateGross();
		emp=new DbDeveloper(103,"Priyanshu",15000,"MySQL");
		print(emp);
		emp.calculateGross();
		
		

	}

}
