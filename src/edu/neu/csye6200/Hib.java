package edu.neu.csye6200;
import java.time.LocalDate;


public class Hib extends AbstractVaccine{

	private int currentDoses; //current no.of doses taken
	private LocalDate latest_vaccine_date; // latest record of vaccine(date)
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
	public Hib(int minAge, int maxAge, int totalDoses) {
	
		setMinAge(minAge);
		setMaxAge(maxAge);
		setTotalDoses(totalDoses);
	}

	@Override
	public void printvaccine() {
		System.out.println("Hib [currentDoses=" + currentDoses + ", latest_vaccine_date=" + latest_vaccine_date + "]");
	}
	public void nextVaccine(Student s) {
		while(currentDoses< getTotalDoses() && s.getAge()<=getMaxAge() && s.getAge()>=getMinAge()) {

			if((currentDoses==0) && s.getAge()==2 ) {
				currentDoses+=1;
				latest_vaccine_date = java.time.LocalDate.now();
				System.out.println("Your" +(++currentDoses)+ "dose of Hib Vaccine is on" +(latest_vaccine_date.plusMonths(2)));
				
				return;
			}

			else if((currentDoses==1) && s.getAge()==4 ) {
				currentDoses+=1;
				latest_vaccine_date=java.time.LocalDate.now();
				System.out.println("Your" +(++currentDoses)+ "dose of Hib Vaccine is on" +(latest_vaccine_date.plusMonths(2)));
				return;
			}
			else if((currentDoses==2) && s.getAge()==6 ) {
				currentDoses+=1;
				latest_vaccine_date=java.time.LocalDate.now();
				System.out.println("Your" +(++currentDoses)+ 
						"dose of Hib Vaccine can be administered anywhere between" 
						+(latest_vaccine_date.plusMonths(8))+ " to " 
						+(latest_vaccine_date.plusMonths(11)));
				return;
			}
			else if((currentDoses==3) && s.getAge()==12 && s.getAge()<=15) {
				currentDoses+=1;
				latest_vaccine_date=java.time.LocalDate.now();
				return;
			}
			else {
				System.out.println("Check the immunization(vaccination) rules");
				return;
			}
			//code to calculate when to administer the next dose based on rules. 

		}
	}


}

