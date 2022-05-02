package com.cts.table;

public class TableThread extends Thread{
	private Table table;
	private int n;
	public TableThread(Table table,int n,String name) {
		super(name);
		this.table=table;
		this.n=n;
	}
	@Override
	public void run() {
		table.showTable(n);
	}

}
