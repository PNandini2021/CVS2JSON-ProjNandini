/* Project : FujitsuTask
 * created By : Nandini
 * Created Date : 12/6/2021
 * Purpose : POJO class for Personnel - acts as super class for student/teacher
 */

package com.model;
import java.util.Date;

public class Personnel {
	protected Integer id;
	protected String fullName; 
	protected String gender;
	protected String dob; 
	protected String age ;
	protected String aadhar;
	protected String city;
	protected String contactNumber;
	protected Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Personnel()
	{
		
	}
	public Personnel(Integer id, String fullName, String gender, String dob, String age, String aadhar, String city,
			String contactNumber) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.gender = gender;
		this.dob = dob;
		this.age = age;
		this.aadhar = aadhar;
		this.city = city;
		this.contactNumber = contactNumber;
	}


}
