package edu.neu.csye6200;


public class Driver {

	public static void main(String[] args) {
		
		// Create a DayCare
		DayCareRules dayCareRules = new DayCareRules();
		DayCare dayCare = new DayCare(dayCareRules);
		StudentEnroller studentEnroller = new StudentEnroller(dayCare);
		EnrollmentUI enrollmentUI = new EnrollmentUI(studentEnroller);
		enrollmentUI.setVisible(true);
	}
}
