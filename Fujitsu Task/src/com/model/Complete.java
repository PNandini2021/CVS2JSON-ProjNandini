/* Project : FujitsuTask
 * created By : Nandini
 * Created Date : 12/6/2021
 * Purpose : Bean class created with csv file columns. 
  */

package com.model;

public class Complete {
	private Integer id;
	private String category;
	private String firstname;
	private String lastname;
	private String gender;
	private String dob;
	private String previous_school;
	private String doj;
	private String class_no;
	private String post;
	private String salary;
	private String class_teacher_of;
	private String roll_no;
	private String emp_no;
	private String total_marks;
	private String city;
	private String aadhar_number;
	private String contact_number;
	private String blood_group;
	private String subject_teaches;
	private String hs_stream;
	private String sec_percent;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public String getPrevious_school() {
		return previous_school;
	}

	public void setPrevious_school(String previous_school) {
		this.previous_school = previous_school;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getClass_no() {
		return class_no;
	}

	public void setClass(String class_no) {
		this.class_no = class_no;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getClass_teacher_of() {
		return class_teacher_of;
	}

	public void setClass_teacher_of(String class_teacher_of) {
		this.class_teacher_of = class_teacher_of;
	}

	public String getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}

	public String getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}

	public String getTotal_marks() {
		return total_marks;
	}

	public void setTotal_marks(String total_marks) {
		this.total_marks = total_marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAadhar_number() {
		return aadhar_number;
	}

	public void setAadhar_number(String aadhar_number) {
		this.aadhar_number = aadhar_number;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getSubject_teaches() {
		return subject_teaches;
	}

	public void setSubject_teaches(String subject_teaches) {
		this.subject_teaches = subject_teaches;
	}

	public String getHs_stream() {
		return hs_stream;
	}

	public void setHs_stream(String hs_stream) {
		this.hs_stream = hs_stream;
	}

	public String getSec_percent() {
		return sec_percent;
	}

	public void setSec_percent(String sec_percent) {
		this.sec_percent = sec_percent;
	}

	@Override
	public String toString() {
		return "Complete [id=" + id + ", category=" + category + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", gender=" + gender + ", dob=" + dob + ", previous_school=" + previous_school + ", doj=" + doj
				+ ", class_no=" + class_no + ", post=" + post + ", salary=" + salary + ", class_teacher_of="
				+ class_teacher_of + ", roll_no=" + roll_no + ", emp_no=" + emp_no + ", total_marks=" + total_marks
				+ ", city=" + city + ", aadhar_number=" + aadhar_number + ", contact_number=" + contact_number
				+ ", blood_group=" + blood_group + ", subject_teaches=" + subject_teaches + ", hs_stream=" + hs_stream
				+ ", sec_percent=" + sec_percent + "]";
	}

}
