package com.cts.domain;

public class Auto extends Vehicle{
	private String fuelType;

	public Auto() {
		super();
	}

	public Auto(int id, String make, int price, String fuelType) {
		super(id,make,price);
		this.fuelType = fuelType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Auto is starting.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Auto is stoping.");
	}
	
	public void display() {
		System.out.println("Auto details:");
		super.display();
		System.out.println(fuelType);
	}
	

}
