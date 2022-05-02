package com.cts.exampleinterface;

public class Mobile {
	private String make;
	private Sim sim;
	public Mobile() {
		super();
	}
	public Mobile(String make, Sim sim) {
		super();
		this.make = make;
		this.sim = sim;
	}
	public void call() {
		sim.makeCall();
	}

}
