package com.basics;

public class Demo {
	
	int a=20;
	static int s=10;
	static void play() {
		 int i =10;
		 System.out.println(i);
	}
	
	public static void main(String[] args) {
		System.out.println(s);
		Demo d=new Demo();
		
		System.out.println(d.a);
		Demo.play();
	}

}
