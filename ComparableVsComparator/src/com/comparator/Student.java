package com.comparator;

public class Student {

	private String name;
	
	private int roll;
	
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public int getRoll() {
		return roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
	
	
}
