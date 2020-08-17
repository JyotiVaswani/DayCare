package edu.neu.csye6200;

public abstract interface AbstractImmunizationRule {
public static int recommended_age = 0;
public int min_age=0;
public int recommended_interval=0;
public int min_interval=0;

public void setRule();
void nextVaccine(Student s);

}
