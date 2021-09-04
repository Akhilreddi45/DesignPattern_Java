package com.designpatterns.assignment.week1;

public class University {

	public static void main(String[] args) {
		Course cs = new Course();
		
		Student s1 = new Student("Ram");
		Student s2 = new Student("John");
		Student s3 = new Student("Abc");
			
		cs.register(s1);
		cs.register(s2);
		cs.register(s3);
		
		s1.registerCourse(cs);
		s2.registerCourse(cs);
		s3.registerCourse(cs);
		
		cs.subject("Register for Class Java");
		
	}

}
