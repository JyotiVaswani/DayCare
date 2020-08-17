package edu.neu.csye6200;

public class PolioFactory extends AbstractVaccineFactory{
	private static AbstractVaccineFactory instance;
	private  PolioFactory() {
		instance=null;
	}
	
	public static AbstractVaccineFactory getInstance() {
		if(instance==null) {
					instance= new PolioFactory();
				}

		return instance;
	}

	@Override
	public AbstractVaccine getObject(int minAge, int maxAge, int totalDoses) {
		// TODO Auto-generated method stub
		return new Polio(minAge, maxAge, totalDoses);
	}

}
