/* Project : FujitsuTask
 * created By : Nandini
 * Created Date : 12/6/2021
 * Purpose : Task 1  - to read from csv file and create Array List. 
 */

package com.controller;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

import com.function.CommonFunctions;
import com.model.Complete;
import com.model.Student;
import com.model.Teacher;

public class CSVParser {
	public ArrayList<Student> studentList = new ArrayList<Student>();
	public ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
	public CommonFunctions func = new CommonFunctions();
	public Validator val = new Validator();

	public void createArrayList(String CSV_FILENAME) throws IOException, ParseException {
		// start reading csv file
		try (ICsvBeanReader beanReader = new CsvBeanReader(new FileReader(CSV_FILENAME),
				CsvPreference.STANDARD_PREFERENCE)) {
			// the header elements are used to map the values to the bean
			final String[] headers = beanReader.getHeader(true);
			val.requiredKeysExist(headers);
			final CellProcessor[] processors = getProcessors();
			Complete customer;
			String gender, fullname;
			while ((customer = beanReader.read(Complete.class, headers, processors)) != null) {
				if (val.validateRow(customer) == false)
					System.exit(0);
				fullname = customer.getFirstname() + " " + customer.getLastname();
				if (customer.getGender().equals("f"))
					gender = "female";
				else
					gender = "male";
				Date dob = new SimpleDateFormat("MM/dd/yyyy").parse(customer.getDob());
				String pattern = "dd/MM/yyyy";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
				String date = simpleDateFormat.format(dob);
				String age = func.calcPeriod(date);
				if (customer.getCategory().equals("student")) {
					String grade = func.calcGrade(Integer.parseInt(customer.getTotal_marks()));
					studentList.add(new Student(customer.getId(), fullname, gender, date, age,
							customer.getAadhar_number(), customer.getCity(), customer.getContact_number(),
							Integer.parseInt(customer.getRoll_no()), customer.getClass_no(),
							Integer.parseInt(customer.getTotal_marks()), grade,
							Integer.parseInt(customer.getSec_percent()), customer.getHs_stream()));

				} else // for teacher
				{
					Date doj = new SimpleDateFormat("MM/dd/yyyy").parse(customer.getDoj());
					String pattern1 = "dd/MM/yyyy";
					SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern);
					String join_date = simpleDateFormat.format(doj);
					String str_sub_teachers = customer.getSubject_teaches();
					String service_period = func.calcPeriod(join_date);
					List<String> sub_teachers = new ArrayList<String>(Arrays.asList(str_sub_teachers.split("-")));
					teacherList.add(new Teacher(customer.getId(), fullname, gender, date, age,
							customer.getAadhar_number(), customer.getCity(), customer.getContact_number(),
							customer.getEmp_no(), customer.getClass_teacher_of(), join_date, service_period,
							customer.getPrevious_school(), customer.getPost(), Integer.parseInt(customer.getSalary()),
							sub_teachers));
				}

			} // while
		}
		System.out.println("ArrayList Sucessfully Created");

	}

	/**
	 * Sets up the processors used for the examples.
	 */
	private static CellProcessor[] getProcessors() {
		final CellProcessor[] processors = new CellProcessor[] { new NotNull(new ParseInt()), // Id
				new NotNull(), // Catageory
				new NotNull(), // firstname
				new NotNull(), // lastname
				new NotNull(), // gender
				new NotNull(), // doj
				new Optional(), new Optional(), new Optional(), new Optional(), new Optional(), new Optional(),
				new Optional(), new Optional(), new Optional(), new Optional(), new Optional(), new Optional(),
				new Optional(), new Optional(), new Optional(), new Optional()

		};
		return processors;
	}

	/* Method to return Student Array List */
	public ArrayList<Student> getStudentList() {
		return studentList;

	}

	/* Method to return Teacher Array List */
	public ArrayList<Teacher> getTeacherList() {
		return teacherList;
	}

}