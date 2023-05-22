package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	
	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<>();
		
		students.add(new Student("yogesh",15));
		students.add(new Student("nrupul",11));
		students.add(new Student("chandra",12));
		students.add(new Student("amit",13));
		
		Collections.sort(students);
		
		System.out.println(students);
		
	}

}
