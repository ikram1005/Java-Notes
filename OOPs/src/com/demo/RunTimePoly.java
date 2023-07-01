package com.demo;

public class RunTimePoly {
	
	//Runtime polymorphism also known as method overriding this occur when 
	//subclass provides a specific implementations of a method that is 
	//already defined in its parent class.
	
	
	public static void main(String[] args) {
		Animal a1=new Cat(); // Creating an instance of Cat, but declared as Animal type
        a1.shout(); // Will invoke the shout() method of Cat class due to runtime polymorphism
	}
}

class Animal{
	void shout() {
		System.out.println("Barks");
	}
}

class Cat extends Animal{
	
	void shout() {
		System.out.println("Meow");
	}
}

class Dog extends Animal{
	
    @Override
    void shout() {
    	System.out.println("bow");
    }
}
