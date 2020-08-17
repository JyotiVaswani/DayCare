package edu.neu.csye6200;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class RegistrationPool {

	List<Registration> regPool = new ArrayList<>();
	int regId;
	

	public void renewMyReg (int regId)
	{
        ListIterator<Registration> itReg = regPool.listIterator();
		while (itReg.hasNext()) 
		{
			Registration r =itReg.next();
			if(r.getRegId()==regId)
			{
				r.renewReg();
				
			}
		}
		
	}
	
	public void checkMyReg (int regId)
	{
        ListIterator<Registration> itReg = regPool.listIterator();
		while (itReg.hasNext()) 
		{
			Registration r =itReg.next();
			if(r.getRegId()==regId)
			{
				r.checkExpiration();
				r.showRegVaccine();
				
			}
		}
		
	}
	
	public void addReg(Registration r)
	{
		this.regPool.add(r);
	}
	
	
	public void showPool()
	{
		for (Registration r : regPool )
		{
		
		System.out.println(r);

		}
	}
	
	
	public void generateAlerts()
	{
        ListIterator<Registration> itReg = regPool.listIterator();
		while (itReg.hasNext()) 
		{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

			LocalDate old_alerts = java.time.LocalDate.now().plusDays(-7);
			LocalDate new_alerts = java.time.LocalDate.now().plusDays(7);
			LocalDate today = java.time.LocalDate.now();

			Registration r =itReg.next();
			String mydate =r.getExpDate();
			LocalDate expDate = LocalDate.parse(mydate, formatter);
			
			if(expDate.isAfter(today) && expDate.isBefore(new_alerts))
			{
				System.out.println("Alert!!! for Registration ID: " + r.getRegId());
				System.out.println("Expires soon in current week!");
			} 
			else if(expDate.isAfter(old_alerts) && expDate.isBefore(today))
			{
				System.out.println("Alert!!! for Registration ID: " + r.getRegId());
				System.out.println("Expired in last week! ");
			}
			else if(expDate.equals(today))
			{
				System.out.println("Alert!!! for Registration ID: " + r.getRegId());
				System.out.println("Expires Today!");
			}
			else {}
		}
	}
	
	public static void demo() 
	{
		RegistrationPool rp = new RegistrationPool();
		List<AbstractVaccine> myvaccine= null;
		rp.addReg(new Registration(1, "123", myvaccine ,"2019-08-17", "2020-08-17" ));
		rp.addReg(new Registration(2, "456", myvaccine ,"2019-08-13", "2020-08-13" ));
		rp.addReg(new Registration(3, "789", myvaccine ,"2019-08-19", "2020-08-19" ));
		rp.addReg(new Registration(4, "1789", myvaccine ,"2019-08-29", "2020-08-29" ));
		rp.showPool();
		rp.generateAlerts();
		
		int regId =1;
		rp.checkMyReg(regId);
		rp.renewMyReg(regId);
		
		
		regId =2;
		rp.checkMyReg(regId);
		rp.renewMyReg(regId);
		
		regId  =3;
		rp.checkMyReg(regId);
		rp.renewMyReg(regId);
		
	}
	
}
