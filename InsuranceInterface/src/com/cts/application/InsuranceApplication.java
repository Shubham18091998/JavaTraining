package com.cts.application;
import java.util.*;

import com.cts.domain.Vehicle;
public class InsuranceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of insurances:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter vehicle number:");
			sc.next();
			String vehicleNumber=sc.nextLine();
			System.out.println("Enter model name:");
			String modelName=sc.nextLine();
			System.out.println("Enter vehicle type:");
			String vehicleType=sc.nextLine();
			System.out.println("Enter price:");
			double price=sc.nextDouble();
			
			Vehicle vehicle=new Vehicle(vehicleNumber,modelName,vehicleType,price);
			System.out.println("Eligible loan amount="+vehicle.issueLoan());
			System.out.println("Eligible insurnace amount="+vehicle.takeInsurance());
		}
	}

}
