/* Project : FujitsuTask
 * created By : Nandini
 * Created Date : 12/6/2021
 * Purpose : POJO class for Teacher
 */
package com.model;

import java.util.List;

public class Teacher extends Personnel {
	private String empNo; // ( Col N)
	private String classTeacher; // ( col L)
	private String doj; // Date of Joining
	private String servicePeriod;// ( Evaluated from doj)
	private String previous_school;// ( Col G)
	private String post;// ( Col J)
	private Integer salary; // ( Col K)
	private List<String> subjectTeaches; // ( evaluated from col T)

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getServicePeriod() {
		return servicePeriod;
	}

	public void setServicePeriod(String servicePeriod) {
		this.servicePeriod = servicePeriod;
	}

	public String getPrevious_school() {
		return previous_school;
	}

	public void setPrevious_school(String previous_school) {
		this.previous_school = previous_school;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public List<String> getSubjectTeaches() {
		return subjectTeaches;
	}

	public void setSubjectTeaches(List<String> subjectTeaches) {
		this.subjectTeaches = subjectTeaches;
	}

	@Override
	public String toString() {
		return "Teacher [empNo=" + empNo + ", classTeacher=" + classTeacher + ", doj=" + doj + ", servicePeriod="
				+ servicePeriod + ", previous_school=" + previous_school + ", post=" + post + ", salary=" + salary
				+ ", subjectTeaches=" + subjectTeaches + ", id=" + id + ", fullName=" + fullName + ", gender=" + gender
				+ ", dob=" + dob + ", age=" + age + ", aadhar=" + aadhar + ", city=" + city + ", contactNumber="
				+ contactNumber + "]";
	}

	public Teacher(Integer id, String fullName, String gender, String dob, String age, String aadhar, String city,
			String contactNumber, String empNo, String classTeacher, String doj, String servicePeriod,
			String previous_school, String post, Integer salary, List<String> subjectTeaches) {
		super(id, fullName, gender, dob, age, aadhar, city, contactNumber);
		this.empNo = empNo;
		this.classTeacher = classTeacher;
		this.doj = doj;
		this.servicePeriod = servicePeriod;
		this.previous_school = previous_school;
		this.post = post;
		this.salary = salary;
		this.subjectTeaches = subjectTeaches;
	}

}
