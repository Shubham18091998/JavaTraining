package com.cts.table;

public class TableMain {

	public static void main(String[] args) {
		Table table=new Table();
		TableThread tb1=new TableThread(table,2,"tb1");
		TableThread tb2=new TableThread(table,3,"tb2");
		TableThread tb3=new TableThread(table,4,"tb3");
		tb1.start();
		tb2.start();
		tb3.start();

	}

}
