package com.model;

import java.util.ArrayList;

public class StudentList {
	String message;
	ArrayList<Student> stud;
	public StudentList(String message, ArrayList<Student> stud) {
		super();
		this.message = message;
		this.stud = stud;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ArrayList<Student> getStud() {
		return stud;
	}
	public void setStud(ArrayList<Student> stud) {
		this.stud = stud;
	}
	
	}


