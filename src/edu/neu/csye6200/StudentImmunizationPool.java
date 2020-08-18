package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentImmunizationPool {

	List<StudentImmunization> studentImmunizationPool = new ArrayList<>(); 
	// initialize with list of Students provided by kiran
	String studentName;
	
	
	public void checkStudentImm (String studentName)
	{
        ListIterator<StudentImmunization> itStdImm = studentImmunizationPool.listIterator();
		while (itStdImm.hasNext()) 
		{
			StudentImmunization sm =itStdImm.next();
			if(sm.getName().equals(studentName))
			{
				System.out.println(sm);
				sm.showVaccineTaken();
				
			}
		}
		
	}
	
	public void addStudentImm(StudentImmunization sm)
	{
		this.studentImmunizationPool.add(sm);
	}
	
	
	public void showStudentImmPool()
	{
		for (StudentImmunization sm : studentImmunizationPool )
		{
		
		System.out.println(sm);
		sm.showVaccineTaken();

		}
	}
	
	public void vaccinateMe(String studentName)
	{
        ListIterator<StudentImmunization> itStdImm = studentImmunizationPool.listIterator();
		while (itStdImm.hasNext()) 
		{
			
			StudentImmunization sm =itStdImm.next();
//			System.out.println("Ap checking "+ sm.getName());
//			System.out.println(studentName);
			if(sm.getName().equals(studentName))
			{sm.nextupdates(sm);}
		}
	}
	
	public void vaccinateAll()
	{
		for (StudentImmunization sm : studentImmunizationPool )
		{
		
		System.out.println(sm);
		sm.nextupdates(sm);

		}
	}
	
	public static void demo() 
	{
//		StudentImmunizationPool sip = new StudentImmunizationPool();
//		Student student = new Student(1, "a", 11, "a", "a", "a");
//		sip.addStudentImm(new StudentImmunization(student,null,"lab report" ));			
//
//		sip.showStudentImmPool();

		
//	String regId ="Jyoti";
	//	sip.checkStudentImm("Jyoti");
		
		
		
//	regId ="Jyoti123";
//		sip.checkStudentImm(regId);
//		sip.vaccinateAll();
		
		
//	regId  ="Jyoti456";
//	sip.vaccinateMe(regId);
		
	}


	
}

