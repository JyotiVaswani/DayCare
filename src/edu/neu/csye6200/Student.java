package edu.neu.csye6200;

public class Student extends Person {
	
	private int grade;
	private String name;
	private String parentName;
	private int age;
	private String parentAddress;
	private String parentPhoneNumber;
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		grade = grade;
	}
	
	public Student(String studentName, int studentAge, String parentName, String parentAddress, String parentPhoneNumber) {
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
