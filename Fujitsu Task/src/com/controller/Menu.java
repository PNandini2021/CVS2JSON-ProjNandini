/* Project : FujitsuTask
 * created By : Nandini
 * Created Date : 12/6/2021
 * Purpose : Starting point of Application 
 */

package com.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import com.model.Student;
import com.model.Teacher;

public class Menu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter input CSV file path :-");
		String inputFileName = s.next();
		//s.close();
		System.out.println("Reading Excel File.... ");

		CSVParser t1 = new CSVParser();
		JSONWriter t2 = new JSONWriter();
		ArrayList<Student> s1 = new ArrayList<Student>();
		ArrayList<Teacher> th1 = new ArrayList<Teacher>();

		try {
			System.out.println("Creating Array List .... ");
			// inputFileName = "resource\\master-data2.csv";

			t1.createArrayList(inputFileName); // Calling Task 1 - to create ArrayList
			s1 = t1.getStudentList(); // Getting Student List
			th1 = t1.getTeacherList(); // Getting Teacher List
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(0);
		}

		t2.createDirectory(s1, th1);
	}

}
