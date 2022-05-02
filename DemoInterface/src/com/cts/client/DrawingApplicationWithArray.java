package com.cts.client;

import java.util.Random;

import com.cts.exampleinterface.Circle;
import com.cts.exampleinterface.Rectangle;
import com.cts.exampleinterface.Shape;

public class DrawingApplicationWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shapes[]=new Shape[2];

		Random random=new Random();
		for(int i=0;i<2;i++) {
			int value=random.nextInt(2);
			switch (value) {
			case 0:
				shapes[i]=new Rectangle();				
				break;
			case 1:
				shapes[i]=new Circle();
				break;
		}
		}
		
		/*shapes[0]=new Rectangle();
		shapes[1]=new Circle();*/
		for(Shape shape:shapes) {
			shape.draw();
		}
	
	}

}
