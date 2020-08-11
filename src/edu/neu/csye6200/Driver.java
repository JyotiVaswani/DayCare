package edu.neu.csye6200;


public class Driver {

	public static void main(String[] args) {
		
		// Create a DayCare
		DayCareRules dayCareRulesA = new DayCareRules();
		DayCare dayCareA = new DayCare(dayCareRulesA);
		StudentEnroller dayCareAEnroller = new StudentEnroller(dayCareA);
		
		// Student enrollment using csv file
		try {
			dayCareAEnroller.EnrollMultipleStudents(0, "sampleDayCare.csv");
		} catch (Exception e) {
			System.out.println("FileNotFound!");
			e.getStackTrace();
		}
		
		// student enrollment using use input
		String userInput = "Student 4, 16, Parent 4, #N1 XYZ Sample Address 4, +44 0000 000000\n" + 
							"Student 5, 24, Parent 5, #N2 XYZ Sample Address 5, +55 0000 000000 \n" + 
							"Student 6, 10, Parent 6, #N3 XYZ Sample Address 6, +66 0000 000000 \n" +
							"Student 7, 19, Parent 7, #N3 XYZ Sample Address 7, +77 0000 000000";
		try {
			dayCareAEnroller.EnrollMultipleStudents(1, userInput);
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		dayCareA.showDayCare();
	}

}
