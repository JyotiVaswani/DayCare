package edu.neu.csye6200;

import java.time.LocalDate;

public class HepatitisB extends AbstractVaccine{

	private int currentDoses; //current no.of doses taken
	private LocalDate latest_vaccine_date; // latest record of vaccine(date)
	public HepatitisB(int minAge, int maxAge, int totalDoses) {
		// TODO Auto-generated constructor stub
		setMinAge(minAge);
		setMaxAge(maxAge);
		setTotalDoses(totalDoses);
	}
	public int getcurrentDoses() {
		return currentDoses;
	}
	public void setcurrentDoses_Taken(int currentDoses) {
		this.currentDoses = currentDoses;
	}
	public LocalDate getLatest_vaccine_date() {
		return latest_vaccine_date;
	}
	public void setLatest_vaccine_date(LocalDate latest_vaccine_date) {
		this.latest_vaccine_date = latest_vaccine_date;
	}
	
	@Override
	public void printvaccine() {
		System.out.println("HepatitisB [currentDoses=" + currentDoses + ", latest_vaccine_date=" + latest_vaccine_date + "]");
	}
	@Override
	public void nextVaccine(Student s) {
		// TODO Auto-generated method stub

		while(currentDoses< getTotalDoses() && s.getAge()<=getMaxAge() && s.getAge()>=getMinAge()) {

			if((currentDoses==0) && s.getAge()<1 &&s.getAge()>0) {
				currentDoses+=1;
				latest_vaccine_date = java.time.LocalDate.now();
				System.out.println("Your" +(++currentDoses)+ "dose of HepatitisB Vaccine can be administered anywhere between" 
						+(latest_vaccine_date.plusMonths(1))+" to "+(latest_vaccine_date.plusMonths(2)));
				return;
				
			}

			else if((currentDoses==1) && s.getAge()==1 && s.getAge()<=2 ) {
				currentDoses+=1;
				latest_vaccine_date=java.time.LocalDate.now();
				System.out.println("Your" +(++currentDoses)+ "dose of HepatitisB Vaccine can be administered anywhere between" 
						+(latest_vaccine_date.plusMonths(2))+ " to " +(latest_vaccine_date.plusMonths(14)));
				return;
			}
			else if((currentDoses==2) && s.getAge()==6 && s.getAge()<=18) {
				currentDoses+=1;
				latest_vaccine_date=java.time.LocalDate.now();
				return;
				
			}
			else {
				System.out.println("Check the immunization(vaccination) rules");
				return;
			}
 

		}
	}
}
