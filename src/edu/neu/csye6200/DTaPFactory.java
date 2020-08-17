package edu.neu.csye6200;

public class DTaPFactory extends AbstractVaccineFactory{

	private static AbstractVaccineFactory instance;
	private  DTaPFactory() {
		instance=null;
	}
	
	public static AbstractVaccineFactory getInstance() {
		if(instance==null) {
					instance= new DTaPFactory();
				}

		return instance;
	}
	@Override
	public AbstractVaccine getObject(int minAge, int maxAge, int totalDoses) {
		// TODO Auto-generated method stub
		return new DTaP(minAge, maxAge, totalDoses);
	}

}
