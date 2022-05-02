package com.cts.domain;

abstract public class Vehicle {
	private int id;
	private String make;
	private int price;
	
	public Vehicle() {
		super();
	}

	public Vehicle(int id, String make, int price) {
		super();
		this.id = id;
		this.make = make;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	abstract public void start();
	abstract public void stop();
	
	
	public void display() {
		System.out.println(id+" "+make+" "+price);
	}

}
