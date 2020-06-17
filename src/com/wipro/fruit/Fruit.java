package com.wipro.fruit;

public class Fruit {
	private String name;
	private String taste;
	private int size;

	public Fruit() {

	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTaste() {
		return taste;
	}


	public void setTaste(String taste) {
		this.taste = taste;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public void eat() {

	}

	public static void main(String[] args) {
		Apple apple  = new Apple();
		apple.setName("Green Apple");
		apple.setTaste("Sweet");
		apple.eat();
		
		Orange orange = new Orange();
		orange.setName("Orange");
		orange.setTaste("Sour");
		orange.eat();
		
	}
	

}
