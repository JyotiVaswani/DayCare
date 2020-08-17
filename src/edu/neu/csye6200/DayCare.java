package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DayCare {
	
	public DayCareRules dayCareRules;
	
	public List<ClassRoom> classRooms = null;
	
//	public List<Student> getAllStudents(){
//		return allStudents;
//	}
	
	public DayCare(DayCareRules dayCareRules) {
		this.dayCareRules = dayCareRules;
	}

	public void showDayCare() {
		for (ClassRoom classRoom : classRooms) {
			classRoom.showClassRoom();
		}
	}
	
	public List<Student> getAllStudents(){
		List<Student> sl = new ArrayList<>();
		if (this.classRooms!=null) {
			for (ClassRoom cr : this.classRooms) {
				for (Student student : cr.getStudents()) {
					sl.add(student);
				}
			}
		}
		return sl;
	}
}
