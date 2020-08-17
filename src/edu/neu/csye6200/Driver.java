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
		StudentImmunizationPool studentImmunizationPool = new StudentImmunizationPool();
//		StudentImmunizationPool.demo(dayCare.getAllStudents());
//		StudentImmunization.demo();
		//		List<students>
		
		// Adi
		EnrollmentUI enrollmentUI = new EnrollmentUI(dayCare, studentEnroller, studentImmunizationPool);
		enrollmentUI.setVisible(true);
//		
//		adding student 1
//		adding student 2
//		adding student 3
		
		
		
		// Apoorva
	}
}
