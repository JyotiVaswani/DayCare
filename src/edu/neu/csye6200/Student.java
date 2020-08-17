package edu.neu.csye6200;

public class Student extends Person {
	
	private int grade;
	private String name;
	private String parentName;
	private int age;
	private String parentAddress;
	private String parentPhoneNumber;
	private int id;
	
	public int getGrade() {
		return this.grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Student(int id, String studentName, int studentAge, String parentName, String parentAddress, String parentPhoneNumber) {
		 this.id = id;
		 this.name = studentName;
		 this.age = studentAge;
		 this.parentAddress = parentAddress;
		 this.parentName = parentName;
		 this.parentPhoneNumber = parentPhoneNumber;
	}
	
	@Override
	public String toString() {
		return "Name: "+ this.name + ", Age: " + Integer.toString(this.age);
	}
}
