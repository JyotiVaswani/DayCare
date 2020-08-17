package edu.neu.csye6200;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.io.File;
import java.io.FileNotFoundException;

public class StudentEnroller {
	
	private DayCare dayCare;
	
	public StudentEnroller(DayCare dayCare) {
		this.dayCare = dayCare;
	}
	
	public void EnrollMultipleStudents(int enrollmentType, String data) throws FileNotFoundException {
		if (enrollmentType == 0) {
			// data is a csvPath
			Scanner sc = new Scanner(new File(data));
			while (sc.hasNextLine()) {
				EnrollStudent(sc.nextLine());
			}
		} else if (enrollmentType == 1) {
			// data is user inputs csv lines
			String dataLines[] = data.split("\\r?\\n");
			for (String dataPoint: dataLines) {
				EnrollStudent(dataPoint);
			}
		}
	}
	
	public void EnrollStudent(String csv) {
		
		int studentId = Integer.parseInt(csv.split(",")[0].trim());
		String studentName = csv.split(",")[1].trim();
		int studentAge = Integer.parseInt(csv.split(",")[2].trim());
		String parentName = csv.split(",")[3].trim();
		String parentAddress = csv.split(",")[4].trim();
		String parentPhoneNumber = csv.split(",")[5].trim();
		Student student = new Student(studentId, studentName, studentAge, parentName, parentAddress, parentPhoneNumber);
		
		// get age group (using max age as an identifier)
		int studentMaxGroupAge = 100;
		for (Integer maxAge: this.dayCare.dayCareRules.maxAgeToGroupSize.keySet()) {
			if (studentAge <= maxAge) {
				studentMaxGroupAge = maxAge;
				break;
			}
		}
		
		// Check for classroom with capacity for this age group
		ClassRoom enrolledClassRoom = null;
		if (this.dayCare.classRooms != null) {
			for (ClassRoom classRoom : this.dayCare.classRooms) {
				if ((classRoom.maxAge == studentMaxGroupAge) && (classRoom.getCapacity() > 0)) {
					classRoom.AddStudent(student);
					enrolledClassRoom = classRoom;
					break;
				}
			}
		}
		
		else {
			// If no classrooms at all in the day care
			this.dayCare.classRooms = new ArrayList<ClassRoom>();
		}
		
		// If no classroom has capacity or no classrooms of this age group
		if (enrolledClassRoom == null) {
			enrolledClassRoom = new ClassRoom(this.dayCare, studentMaxGroupAge);
			enrolledClassRoom.AddStudent(student);
			this.dayCare.classRooms.add(enrolledClassRoom);
		}
	}
}
