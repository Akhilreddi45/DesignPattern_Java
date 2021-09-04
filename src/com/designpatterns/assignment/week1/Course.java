package com.designpatterns.assignment.week1;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private List<Student> students = new ArrayList<>();
	private String subjectName;
	
	public void register(Student student)
	{
		students.add(student);
		
	}
	public void unRegister(Student student)
	{
		students.remove(student);
		
	}
	public void notifyStudents()
	{
	for(Student student : students)
	{
		student.update();
		
	}
	
	}
	public void subject(String subjectName)
	{
		this.subjectName=subjectName;
		notifyStudents();
		
	}

}
