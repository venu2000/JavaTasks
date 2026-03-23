package com.Task5.ShapeAreaCalculator;

public class Shape {
	
	
	public void calculateArea(int side) {
		
		double area = Math.pow(side, 2);
		  System.out.println("Square Area: " + area + " sq.units");
	
	}
	
	public void calculateArea(int length, int width) {
		
		int area = length * width;
		 System.out.println("Square Rectangle: " + area + " sq.units");
		
	}
	
    public void calculateArea(double radius) {
    	
    	float area = (float) (Math.PI * (Math.pow(radius, 2)));
    	  System.out.println("Circle: " + area + " sq.units");
	
    }
}
