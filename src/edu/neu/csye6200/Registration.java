/**
 * 
 */
package edu.neu.csye6200;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @author jyoti
 *
 */
public class Registration {
	private int RegId;
	private String stdName;
	private List<AbstractVaccine> myvaccines=null;
	private String RegDate;
	private String expDate;
	
	public Registration(int RegId, String stdName, List<AbstractVaccine> myvaccines, String string, String string2) {
		 this.RegId = RegId;
		 this.stdName = stdName;
		 this.myvaccines = setMyvaccines(myvaccines);
		 this.RegDate = string;
		 this.expDate = setExpDate(string);
	}
	
	
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public List<AbstractVaccine> getMyvaccines() {
		return myvaccines;
	}
	public List<AbstractVaccine> setMyvaccines(List<AbstractVaccine> myvaccines) {
		if (myvaccines==null)
		{
			this.myvaccines = Arrays.asList(
					HibFactory.getInstance().getObject(0, 20,4 ),
					DTaPFactory.getInstance().getObject(0, 18, 4),
					MMRFactory.getInstance().getObject(0,18, 1),
					VaricellaFactory.getInstance().getObject(0,18, 1),
					HepatitisBFactory.getInstance().getObject(0,18, 3),
					PolioFactory.getInstance().getObject(0,18, 3));
		}
		return this.myvaccines;
	}
	public String getRegDate() {
		return RegDate;
	}
	public void setRegDate(String regDate) {
		RegDate = regDate;
	}
	public String getExpDate() {
		return expDate;
	}
	public String setExpDate(String reg_date) {
		LocalDate regex_date = LocalDate.parse(reg_date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		LocalDate exp_date = regex_date.plusYears ( 1 );
		
		return this.expDate = exp_date.toString();
		 
	}
	


	public int getRegId() {
		return RegId;
	}
	public void setRegId(int regId) {
		RegId = regId;
	}
	
	public void renewReg() {	
		LocalDate old_date = LocalDate.parse(this.getExpDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		LocalDate new_date = old_date.plusYears ( 1 );
		String new_expdate = new_date.toString();
		this.setExpDate(new_expdate) ;
		System.out.println("Newexpdate: " + this.getExpDate()+ " for StudentName: " + this.getStdName() + " with RegId: "+ this.getRegId());
		return;		
	}
	
	public void checkExpiration()
	{
		System.out.println("Expiration for StudentName " + this.getStdName() + " with RegId: "+ this.getRegId() + " is " + this.getExpDate());
		return;
	}

	public void showRegVaccine()
	{
		if (myvaccines==null)
		{
			System.out.println("Not registered for any vaccine!");
		}else 
		{
		System.out.println("Vaccines registered:");   // can even use stdId
		this.myvaccines.stream()
    				 	  .forEach(n->System.out.print(n + "," ));
		}
	}

	public void add(AbstractVaccine v)
	{
		this.myvaccines.add(v);
	}
	
	@Override
	public String toString() {
		return "RegID: "+ this.getRegId() + ", RegDate: " + this.getRegDate() + ", ExpirationDate: " + this.getExpDate();
	}
	
	
}
