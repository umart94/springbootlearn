package com.example.demo.model;

public class Student {
	private int studentId;
	private String studentName;
	private String studentCity;
	private University studentUniversity;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public University getStudentUniversity() {
		return studentUniversity;
	}
	public void setStudentUniversity(University studentUniversity) {
		this.studentUniversity = studentUniversity;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ "]";
	}
	public Student(int studentId, String studentName, String studentCity, University studentUniversity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentUniversity = studentUniversity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(University university) {
		super();
		this.studentUniversity = university;
	}
	
}
