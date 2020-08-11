package edu.neu.csye6200;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DayCare {
	
	public DayCareRules dayCareRules;
	
	public List<ClassRoom> classRooms = null;
	
	public DayCare(DayCareRules dayCareRules) {
		this.dayCareRules = dayCareRules;
	}

	public void showDayCare() {
		for (ClassRoom classRoom : classRooms) {
			classRoom.showClassRoom();
		}
	}
}
