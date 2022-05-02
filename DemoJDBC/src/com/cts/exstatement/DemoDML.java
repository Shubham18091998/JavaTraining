package com.cts.exstatement;

import java.util.ArrayList;

public class DemoDML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao empDao=new EmployeeDaoImplementation();
		Employee emp=new Employee(104,"Huita",5000,"Huita@gmail.com","Mumbai",40);
		//empDao.insert(emp);
		if(empDao.delete(1124)) {
			System.out.println("Record deleted");
		}
		else {
			System.out.println("Record not deleted");
		}
		
		if(empDao.updateSalary(101,5000)) {
			System.out.println("Salary updated");
		}
		else {
			System.out.println("Salary not updated");
		}
		ArrayList<Employee>empRecords=empDao.getAllRecords();
		for(Employee empR:empRecords) {
			empR.display();
		}
		System.out.println("-----------------------------------------------------------------");
		Employee xemp=empDao.getEmployee(102);
		if(xemp!=null) {
			xemp.display();
		}
		else{
			System.out.println("Record not found");
		}

	}

}
