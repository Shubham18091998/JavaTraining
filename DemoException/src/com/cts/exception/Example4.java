package com.cts.exception;

import java.util.Scanner;

public class Example4 {
	
	static void validateAge(int age) throws AgeException {
		if(age>=22 && age<=60) {
			System.out.println("Valid age");
		}
		else {
			throw new AgeException("Invalid age");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		age=sc.nextInt();
		try {
		validateAge(age);
		}catch(AgeException e) {
			e.printStackTrace();
		}

	}

}
