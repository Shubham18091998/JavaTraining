package com.cts.client;

import com.cts.exampleinterface.Circle;
import com.cts.exampleinterface.Rectangle;
import com.cts.exampleinterface.Shape;

public class DrawingApplication {
	
	public static void main(String[] args) {
		Shape shape=new Rectangle();
		shape.draw(); 
		shape=new Circle();
		shape.draw();
	}

}
