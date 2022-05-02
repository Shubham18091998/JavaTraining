package com.cts.exampleinterface;

public class DemoInterfaceApplication {
	public static void main(String[] args) {
		Sim sim=new Jio();
		Mobile mobile=new Mobile("Samsung",sim);
		mobile.call();
	}

}
