/**
 * 
 */
package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author jyoti
 *
 */
public class StudentImmunization extends Student{

	List<AbstractVaccine> takenvaccine = null;
	
	private String splRemarks= null; 
	
	public String getTakenvaccine() {
		
		ListIterator<AbstractVaccine> itReg = takenvaccine.listIterator();
        System.out.println(itReg); 
		while (itReg.hasNext()) 
		{
			AbstractVaccine r =itReg.next();
			r.printvaccine();}
		String s ="have been taken.";
		return s;
	}

	public List<AbstractVaccine> setTakenvaccine(List<AbstractVaccine> myvaccines) {
		return this.takenvaccine = new ArrayList<>(Arrays.asList(
				HibFactory.getInstance().getObject(0, 20,4 ),
				DTaPFactory.getInstance().getObject(0, 18, 4),
				MMRFactory.getInstance().getObject(0,18, 1),
				VaricellaFactory.getInstance().getObject(0,18, 1),
				HepatitisBFactory.getInstance().getObject(0,18, 3),
				PolioFactory.getInstance().getObject(0,18, 3)));
		
	}

	public String getSplRemarks() {
		return splRemarks;
	}

	public void setSplRemarks(String splRemarks) {
		this.splRemarks = splRemarks;
	}

	public StudentImmunization(Student student, List<AbstractVaccine> myvaccines,String splRemarks ) 
	{
		
		super(student.getId(),student.getName(), student.getAge(), student.getParentName(), student.getParentAddress(), student.getParentPhoneNumber(), student.getRegistrationDate());
		this.takenvaccine = setTakenvaccine(myvaccines);
		this.splRemarks = splRemarks;
	//	System.out.println(takenvaccine);
	}

	public StudentImmunization() {
		super();
		this.takenvaccine = setTakenvaccine(takenvaccine);
		this.splRemarks ="lab reports";
	//	System.out.println(takenvaccine);
	//	System.out.println("default");
	}

	public void nextupdates(Student sm)
	{
		int age = (12*(java.time.LocalDate.now().getYear()-sm.getDOB().getYear())+java.time.LocalDate.now().getMonthValue()-sm.getDOB().getMonthValue());
		sm.setAge(age);
//		System.out.println(age);
		System.out.println("Next update for Vaccines to be taken:"); 
        ListIterator<AbstractVaccine> itReg = takenvaccine.listIterator();
//        System.out.println(itReg.toString()); 
		while (itReg.hasNext()) 
		{
			AbstractVaccine r =itReg.next();
//			r.printvaccine();
			r.nextVaccine(sm);
		}
	}
	
	
	public void showVaccineTaken()
	{
		if (takenvaccine==null)
		{
			System.out.println("Not taken any vaccine!");
		}else 
		{
		System.out.println("Vaccines taken:");   // can even use stdId
		this.takenvaccine.stream()
		 				 .forEach(n->n.printvaccine());
		System.out.println(this.getSplRemarks());
		}
	}
	
	public void add(AbstractVaccine v)
	{
		this.takenvaccine.add(v);
	}
	
	
	public static void demo() 
	{
//		List<AbstractVaccine> takenvaccine = null;
//		Student sm = new Student(1, "Jyoti", 2, "pn", "PA","abc");
//		StudentImmunization stm = new StudentImmunization(sm, takenvaccine,"lab"  );
//		System.out.println(sm); 
//		System.out.println(stm); 
//		stm.nextupdates(sm);
		
		//Student sm1 = new StudentImmunization("Jyoti123", 12, "pn", "PA","abc",takenvaccine,"lab report" );
	}
	
	
	
	@Override
	public String toString() {
		return "StudentName: "+ this.getName() + ", Age: " + this.getAge();
	}
	
	
}
