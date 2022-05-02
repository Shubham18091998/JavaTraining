package com.cts.exampleinterface;

public class Rectangle implements Shape{
	private int width;
	private int breadth;
	public Rectangle() {
		super();
	}
	public Rectangle(int width, int breadth) {
		super();
		this.width = 3;
		this.breadth = 5;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle is drawn");
		
	}
	

}
