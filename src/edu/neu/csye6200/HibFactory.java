package edu.neu.csye6200;

public class HibFactory extends AbstractVaccineFactory {

	private static AbstractVaccineFactory instance;
	private  HibFactory() {
		instance=null;
	}
	
	public static AbstractVaccineFactory getInstance() {
		if(instance==null) {
					instance= new HibFactory();
				}

		return instance;
	}

	@Override
	public AbstractVaccine getObject(int minAge, int maxAge, int totalDoses) {
		// TODO Auto-generated method stub
		return new Hib(minAge, maxAge, totalDoses);
	}

}
