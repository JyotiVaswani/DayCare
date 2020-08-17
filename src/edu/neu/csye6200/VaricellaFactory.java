package edu.neu.csye6200;

public class VaricellaFactory extends AbstractVaccineFactory{
	private static AbstractVaccineFactory instance;
	private  VaricellaFactory() {
		instance=null;
	}
	
	public static AbstractVaccineFactory getInstance() {
		if(instance==null) {
					instance= new VaricellaFactory();
				}

		return instance;
	}

	@Override
	public AbstractVaccine getObject(int minAge, int maxAge, int totalDoses) {
		// TODO Auto-generated method stub
		return new Varicella(minAge, maxAge, totalDoses);
	}



}
