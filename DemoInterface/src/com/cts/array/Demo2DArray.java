package com.cts.array;

public class Demo2DArray {
	public static void print(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[][]=new int[3][4];
		for(int i=0,ctr=1;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++,ctr+=1) {
				marks[i][j]=ctr;
			}
		}	
		print(marks);

	}

}
