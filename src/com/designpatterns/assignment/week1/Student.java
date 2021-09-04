package com.designpatterns.assignment.week1;

public class Student {
private String name;
private Course course = new Course();

public Student(String name) {
	super();
	this.name = name;
}
public void update() {
	System.out.println("Hey " + name + " Registration is open");
	System.out.println("Register for your subjects");
	System.out.println("\n");
	
}
public void registerCourse(Course cou)
{
	course=cou;
	}


}
