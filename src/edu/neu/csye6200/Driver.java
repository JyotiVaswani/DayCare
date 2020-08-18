package edu.neu.csye6200;

import java.awt.List;

public class Driver {

	public static void main(String[] args) {
		
		// DayCare
		
		// Kiran
		DayCareRules dayCareRules = new DayCareRules();
		DayCare dayCare = new DayCare(dayCareRules);
		StudentEnroller studentEnroller = new StudentEnroller(dayCare);
		
		// Jyothi
		
		// Adi
		EnrollmentUI enrollmentUI = new EnrollmentUI(dayCare, studentEnroller);
		enrollmentUI.setVisible(true);
		
		// Apoorva
	}
}
