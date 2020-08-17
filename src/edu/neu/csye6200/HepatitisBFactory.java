package edu.neu.csye6200;

public class HepatitisBFactory extends AbstractVaccineFactory{
	private static AbstractVaccineFactory instance;
	private  HepatitisBFactory() {
		instance=null;
	}
	
	public static AbstractVaccineFactory getInstance() {
		if(instance==null) {
					instance= new HepatitisBFactory();
				}

		return instance;
	}
	@Override
	public AbstractVaccine getObject(int minAge, int maxAge, int totalDoses) {
		// TODO Auto-generated method stub
		return new HepatitisB(minAge,maxAge,totalDoses);
	}

}
