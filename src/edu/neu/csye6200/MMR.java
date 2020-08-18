package edu.neu.csye6200;

import java.sql.Date;

public class MMR extends AbstractVaccine {

	private int currentDoses; //current no.of doses taken
	private Date latest_vaccine_date; // latest record of vaccine(date)
	public MMR(int minAge, int maxAge, int totalDoses) {
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
	public Date getLatest_vaccine_date() {
		return latest_vaccine_date;
	}
	public void setLatest_vaccine_date(Date latest_vaccine_date) {
		this.latest_vaccine_date = latest_vaccine_date;
	}
	
	@Override
	public void printvaccine() {
		System.out.println("MMR [currentDoses=" + currentDoses + ", latest_vaccine_date=" + latest_vaccine_date + "]");
	}
	@Override
	public void nextVaccine(Student s) {
		// TODO Auto-generated method stub
		System.out.println("The first dose of MMR must be given on the 1st birthday of student");
	}

}
