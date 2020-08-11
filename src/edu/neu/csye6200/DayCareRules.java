package edu.neu.csye6200;

import java.util.LinkedHashMap;
import java.util.Map;

public class DayCareRules {
	
	public Map<Integer, Integer> maxAgeToGroupSize = new LinkedHashMap<Integer, Integer>();
	public Map<Integer, Integer> maxAgeToMaxRooms = new LinkedHashMap<Integer, Integer>();
	
	public DayCareRules() {
		
		// Need to be put in the right order of increasing age
		this.maxAgeToGroupSize.put(12, 4);
		this.maxAgeToGroupSize.put(24, 5);
		this.maxAgeToGroupSize.put(35, 6);
		this.maxAgeToGroupSize.put(47, 8);
		this.maxAgeToGroupSize.put(59, 12);
		this.maxAgeToGroupSize.put(100, 15);
		
		// Need to be put in the right order of increasing age
		this.maxAgeToMaxRooms.put(12, 3);
		this.maxAgeToMaxRooms.put(24, 3);
		this.maxAgeToMaxRooms.put(35, 3);
		this.maxAgeToMaxRooms.put(47, 3);
		this.maxAgeToMaxRooms.put(59, 2);
		this.maxAgeToMaxRooms.put(100, 2);
	}
	
}
