package edu.neu.csye6200;

import java.util.Vector;

public class ClassRoom {
	
	private int capacity;
	private Vector<Teacher> teachers;
	private Vector<Student> students;
	public int maxAge;
	
	public int getCapacity() {
		return capacity;
	}
	
	public ClassRoom(DayCare dayCare, int maxAge) {
		this.capacity = dayCare.dayCareRules.maxAgeToMaxRooms.get(maxAge);
		this.maxAge = maxAge;
		this.students = new Vector<Student>();
		this.teachers = new Vector<Teacher>();
	}
	
	public void AddStudent(Student student) {
		this.students.add(student);
		capacity = capacity - 1 ;
	} 
	
	public void showClassRoom() {
		System.out.println("ClassRoom with; # of students: " + students.size() + " - Max group age: " 
							+ Integer.toString(maxAge) + " - Remaining capacity: " + Integer.toString(capacity));
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
}
