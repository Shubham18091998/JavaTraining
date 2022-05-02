package com.cts.domain;

public class Car extends Vehicle{
	private boolean airBag;

	public Car() {
		super();
	}

	public Car(int id, String make, int price, boolean airBag) {
		super(id,make,price);
		this.airBag = airBag;
	}

	public boolean isAirBag() {
		return airBag;
	}

	public void setAirBag(boolean airBag) {
		this.airBag = airBag;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car is starting.");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car is stoping.");
	}
	
	public void display() {
		System.out.println("Car details:");
		super.display();
		if(airBag)
			System.out.println("Air bag is available.");
		else
			System.out.println("Air bag is not available.");
	}

}
