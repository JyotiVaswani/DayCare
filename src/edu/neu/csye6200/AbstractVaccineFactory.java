package edu.neu.csye6200;

public abstract class AbstractVaccineFactory {
	public abstract AbstractVaccine getObject(int minAge, int maxAge, int totalDoses);
}
