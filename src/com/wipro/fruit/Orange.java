package com.wipro.fruit;

public class Orange extends Fruit {

	public Orange() {

	}
	
	@Override
	public void eat() {
		System.out.println(getName() + " is "+ getTaste()+  " in taste "  );
	}

	

}
