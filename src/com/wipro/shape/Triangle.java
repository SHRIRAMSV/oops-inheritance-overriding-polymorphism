package com.wipro.shape;

public class Triangle extends Shape {

	public Triangle() {

	}

	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
	}

	@Override
	public void erase() {
		System.out.println("Erasing Triangle");
	}

}
