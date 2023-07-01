package com.demo;

public class CompileTimePoly {

	//Compile-time polymorphism(also known as method overloading) this 
	//occur when method is same but parameters is different;
}

class Student {

	public static void name() {
		System.out.println("My name is Mohd Ikram");
	}
	
	public static void name(String n) {
		System.out.println("My name is "+n);
	}
}

class demo {
	public static void main(String[] args) {
		Student.name();
		Student.name("Vikas");
	}
}