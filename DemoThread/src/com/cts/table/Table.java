package com.cts.table;

public class Table {
	public synchronized void showTable(int n) {
		System.out.println("Table of "+n+" :");
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
		System.out.println("---------------------------");
		
	}

}
