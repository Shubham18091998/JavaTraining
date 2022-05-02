package com.cts.domain;

public class Student {
	private int studenId;
	private String studentName;
	private int marks;
	
	public Student() {
		super();
		studenId=0;
		studentName="";
		marks=0;
	}

	public Student(int studenId, String studentName, int marks) {
		super();
		this.studenId = studenId;
		this.studentName = studentName;
		this.marks=marks;
	}

	public int getStudenId() {
		return studenId;
	}

	public void setStudenId(int studenId) {
		this.studenId = studenId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void showDetails() {
		System.out.println("Student ID:"+studenId+" Stduent Name:"+studentName+" Student Marks:"+marks);
	}
	
	

}
