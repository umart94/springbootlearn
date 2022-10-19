package com.example.component;

public class University {

	private String universityName;

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	@Override
	public String toString() {
		return "University [universityName=" + universityName + "]";
	}

	public University(String universityName) {
		super();
		this.universityName = universityName;
	}

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
