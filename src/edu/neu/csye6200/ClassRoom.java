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
		System.out.println("[INFO] Adding new classroom...");
		this.capacity = dayCare.dayCareRules.maxAgeToMaxRooms.get(maxAge);
		this.maxAge = maxAge;
		this.students = new Vector<Student>();
		this.teachers = new Vector<Teacher>();
	}
	
	public void AddStudent(Student student) {
		System.out.println("[INFO] Adding new student...");
		System.out.println(student);
		this.students.add(student);
		capacity = capacity - 1 ;
	} 
	
	public void RemoveStudent(int studentId) {
		System.out.println("[INFO] Removing student with student ID "+studentId);
		for (Student student : students) {
			if (student.getId() == studentId) {
				this.students.remove(student);
				System.out.println(student);
				break;
			}
		}
	}
	
	public void showClassRoom() {
		System.out.println("ClassRoom with; # of students: " + students.size() + " - Max group age: " 
							+ Integer.toString(maxAge) + " - Remaining capacity: " + Integer.toString(capacity));
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
}
