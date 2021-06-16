package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.model.Complete;

public class Validator {

	public boolean requiredKeysExist(String[] fieldNames) {
			String[] csvHeaders = new String[] { "id", "category", "firstname", "lastname", "gender", "dob",
				"previous_school", "doj", "class", "post", "salary", "class_teacher_of", "roll_no", "emp_no",
				"total_marks", "city", "aadhar_number", "contact_number", "blood_group", "subject_teaches", "hs_stream",
				"sec_percent" };
		if (Arrays.equals(fieldNames, csvHeaders))
			return true;
		else {
			System.out.println(" Required CSV header could not match !!!");
			return false;
		}

	}

	public boolean validateRow(Complete customer) {
		if (!customer.getGender().equals("f")) {
			if (!customer.getGender().equals("m")) {
				System.out.println(customer.getGender() + "Invalid gender");
				return false;
			}
		}
		try {
			Date dob = new SimpleDateFormat("MM/dd/yyyy").parse(customer.getDob());
			if (customer.getDoj() != null) {
				Date doj = new SimpleDateFormat("MM/dd/yyyy").parse(customer.getDoj());
			}
		} catch (ParseException e) {
			System.out.println("Invalid Date Of Birth / Joining Date ");
			return false;
		}

		try {
			if (customer.getRoll_no() != null) {
				Integer.parseInt(customer.getRoll_no());
				Integer.parseInt(customer.getTotal_marks());
			}
		} catch (NumberFormatException e) {
			System.out.println(customer.getRoll_no() + "Roll no / marks should be number " + customer.getTotal_marks());
			return false;
		}

		return true;
	}
}
