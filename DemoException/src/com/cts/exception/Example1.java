package com.cts.exception;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=0;
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1:");
		num1=sc.nextInt();
		System.out.println("Enter num2:");
		num2=sc.nextInt();
		int arr[]= {10,20,30};
		String s=null;
		try {
			result=num1/num2;
			int value=arr[result];
			System.out.println("Value="+value);
			System.out.println("Length="+s.length());
		}catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("Error: Second number must be non zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Error: Please give value  in range 0-2");
		}catch(Exception e) {                //Remember General exception should be the last catch block
			System.out.println(e);
			System.out.println("OOPS! Something went wrong");
		}finally {
			System.out.println("In finally block");
			//close file or close connect or close socket(Generally we write code which has to be executed whether or not exception occured
		}
		System.out.println("Result="+result);

	}

}
