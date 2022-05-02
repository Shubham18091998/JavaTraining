package com.cts.application;
import com.cts.domain.Student;
import com.cts.domain.Trainer;
public class CourseApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student();
		Trainer trainer1=new Trainer();
		student1.setStudenId(101);
		student1.setStudentName("Ravi Malhotra");
		student1.setMarks(68);
		System.out.println("Student Details");
		student1.showDetails();
		trainer1.setTrainerId(1);
		trainer1.setTrainerName("Dimple Verma");
		trainer1.setSkills("Python");
		System.out.println("Trainer Details");
		trainer1.showDetails();
	}

}
