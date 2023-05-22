package com.comparable;

public class Student implements Comparable<Student>{
	
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
	
	//this method sort the list of students based on thier roll no;
	@Override
	public int compareTo(Student o) {
		return this.getRoll()-o.getRoll();
	}
	
	
	//this method sort the list of students based on thier names;
//	@Override
//	public int compareTo(Student o) {
//		return this.getName().compareTo(o.getName());
//	}
	
	
	
	

}
