package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();

		students.add(new Student("yogesh", 15));
		students.add(new Student("nrupul", 11));
		students.add(new Student("chandra", 12));
		students.add(new Student("amit", 13));
		students.add(new Student("arun", 10));

		
		//sort based on their roll no
		Collections.sort(students,new IdComparator());
		System.out.println(students);
		
	

		//sort based on their name
		Comparator<Student> nameComparator=new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		Collections.sort(students,nameComparator);
		System.out.println(students);
		
		

	}
}

