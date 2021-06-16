package com.function;

import java.time.LocalDate;
import java.time.Period;

public class CommonFunctions {
	/* Method to calculate Age using Date of Birth */
	public String calcPeriod(String dob) {
		LocalDate bday = LocalDate.of(Integer.parseInt(dob.substring(6, 10)), Integer.parseInt(dob.substring(3, 5)),
				Integer.parseInt(dob.substring(1, 2)));
		LocalDate today = LocalDate.now();
		Period age = Period.between(bday, today);
		int years = age.getYears();
		int months = age.getMonths();
		return years + " Years and " + months + " Months";
	}

	/* Method to Calculate grade of student using his percentage */
	public String calcGrade(int total_marks) {
		String grade = "Invalid";
		if (total_marks >= 800)
			grade = "A";
		else if (total_marks >= 700)
			grade = "B";
		else if (total_marks >= 600)
			grade = "C";
		else if (total_marks >= 500)
			grade = "D";

		return grade;

	}

}
