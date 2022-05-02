package com.cts.exampleinterface;

public class Circle implements Shape{
	private int radius;

	public Circle() {
		super();
		this.radius=5;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle is drawn");
	}
	
	

}
