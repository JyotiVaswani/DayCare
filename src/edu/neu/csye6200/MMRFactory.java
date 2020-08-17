package edu.neu.csye6200;

public class MMRFactory extends AbstractVaccineFactory{
	private static AbstractVaccineFactory instance;
	private  MMRFactory() {
		instance=null;
	}
	
	public static AbstractVaccineFactory getInstance() {
		if(instance==null) {
					instance= new MMRFactory();
				}

		return instance;
	}
	@Override
	public AbstractVaccine getObject(int minAge, int maxAge, int totalDoses) {
		// TODO Auto-generated method stub
		return new MMR(minAge,maxAge, totalDoses);
	}

}
