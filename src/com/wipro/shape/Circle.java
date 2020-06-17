package com.wipro.shape;

public class Circle extends Shape {

	public Circle() {

	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}

	@Override
	public void erase() {
		System.out.println("Erasing Circle");
	}

}
