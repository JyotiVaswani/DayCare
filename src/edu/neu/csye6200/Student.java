package edu.neu.csye6200;

public class Student extends Person {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getParentAddress() {
		return parentAddress;
	}

	public void setParentAddress(String parentAddress) {
		this.parentAddress = parentAddress;
	}

	public String getParentPhoneNumber() {
		return parentPhoneNumber;
	}

	public void setParentPhoneNumber(String parentPhoneNumber) {
		this.parentPhoneNumber = parentPhoneNumber;
	}

	public void setId(int id) {
		this.id = id;
	}

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
	
	public Student() {
}

	@Override
	public String toString() {
		return "Name: "+ this.name + ", Age: " + Integer.toString(this.age);
	}
}
