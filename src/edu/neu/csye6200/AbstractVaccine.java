package edu.neu.csye6200;

public abstract class AbstractVaccine {
	private int totalDoses ;
	private int minAge ;
	private int maxAge;
	/** Calculates when the next dosage of vaccine should be given to the student
	* Immunization rules bases on
	* https://www.cdc.gov/vaccines/schedules/hcp/imz/child-adolescent.html#note-hib 
	**/
	public abstract void nextVaccine(Student s); 
	public int getTotalDoses() {
		return totalDoses;
	}
	public void setTotalDoses(int totalDoses) {
		this.totalDoses = totalDoses;
	}
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	
	abstract public void printvaccine();
}

