package com.cts.application;
import com.cts.domain.Employee;
import com.cts.domain.Manager;
import com.cts.domain.Developer;
public class EmployeeApplication {
	
	public static void print(Employee employee) {
		System.out.println("Cognizant");
		System.out.println("--------------------------");
		employee.displayDetails();
		System.out.println("--------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp;
		emp=new Manager(102,"Purnima",25000,"CNQWE3345Z",5,1500);
		print(emp);
		
		Manager manager=new Manager();
		manager.setEmpno(101);
		manager.setName("Devansh");
		manager.setBasicSalary(15000);
		manager.setPanNo("ADZDC1744G");
		manager.setNoOfPeople(10);
		manager.setPerks(1000);
		manager.displayDetails();
		
		emp=new Developer(143,"Shivam",20000,"ABCDE0001Z","Java");
		print(emp);
		

	}

}
