package com.cts.exception;

public class Example5 {
	
	static void method1() throws RuntimeException{
		System.out.println("In method one");
		throw new RuntimeException();
	}

	static void method2() throws RuntimeException {
		System.out.println("In method two");
		try {
		method1();
		}catch(RuntimeException e) {
			throw e;
		}
	}
	
	static void method3() throws RuntimeException{
		System.out.println("In method three");
		try {
		method2();
		}catch(RuntimeException e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method3();
		}catch(RuntimeException e) {
			System.out.println("Error: in task");
		}

	}

}
