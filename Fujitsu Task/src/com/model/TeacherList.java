package com.model;

import java.util.ArrayList;

public class TeacherList {
	String message;
	ArrayList<Teacher> teacher;

	public TeacherList(String message, ArrayList<Teacher> teacher) {
		super();
		this.message = message;
		this.teacher = teacher;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ArrayList<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(ArrayList<Teacher> teacher) {
		this.teacher = teacher;
	}

}
