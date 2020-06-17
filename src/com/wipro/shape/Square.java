package com.wipro.shape;

public class Square extends Shape {

	public Square() {
		
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}

	@Override
	public void erase() {
		System.out.println("Erasing Square");
	}

}
