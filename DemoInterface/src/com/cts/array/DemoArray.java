package com.cts.array;

public class DemoArray {
	static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void print(String arr[]) {
		for(String x:arr) {               //For-each loop
		System.out.print(x+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]=new int[5]; // Reference variable(marks)->Stack | Array->Heap
		print(marks);
		int balls[]= {10,20,30,40};
		print(balls);
		String names[]= {"Anita","Sunita","Kavita"};
		print(names);
		int xArr[];             //Declaration
		xArr=new int[5];        //Initialization 
	}

}
