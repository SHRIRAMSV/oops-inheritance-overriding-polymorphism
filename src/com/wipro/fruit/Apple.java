package com.wipro.fruit;

public class Apple extends Fruit {

	public Apple() {
	}
	
	@Override
	public void eat() {
		System.out.println(getName() + " tastes " + getTaste());
	}

	

}
