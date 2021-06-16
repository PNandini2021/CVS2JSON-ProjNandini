/* Project : FujitsuTask
 * created By : Nandini
 * Created Date : 12/6/2021
 * Purpose : POJO class for Student - child class from Personnel
 */
package com.model;


public class Student extends Personnel {
	private Integer rollNumber;
	private String classStudying; // ( col I)
	private Integer totalMarks;
	private String grade;// ( Will be evaluated from totalMarks)
	private Integer secPercent; // ( Col V)
	private String hsStream; // ( Col U)

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getClassStudying() {
		return classStudying;
	}

	public void setClassStudying(String class_studying) {
		this.classStudying = class_studying;
	}

	public Integer getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Integer getSecPercent() {
		return secPercent;
	}

	public void setSecPercent(Integer secPercent) {
		this.secPercent = secPercent;
	}

	public String getHsStream() {
		return hsStream;
	}

	public void setHsStream(String hsStream) {
		this.hsStream = hsStream;
	}

	public Student(Integer id, String fullName, String gender, String dob, String age, String aadhar, String city,
			String contactNumber, Integer rollNumber, String class_studying, Integer totalMarks, String grade,
			Integer secPercent, String hsStream) {
		super(id, fullName, gender, dob, age, aadhar, city, contactNumber);
		this.rollNumber = rollNumber;
		this.classStudying = class_studying;
		this.totalMarks = totalMarks;
		this.grade = grade;
		this.secPercent = secPercent;
		this.hsStream = hsStream;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", class_studying=" + classStudying + ", totalMarks=" + totalMarks
				+ ", grade=" + grade + ", secPercent=" + secPercent + ", hsStream=" + hsStream + ", id=" + id
				+ ", fullName=" + fullName + ", gender=" + gender + ", dob=" + dob + ", age=" + age + ", aadhar="
				+ aadhar + ", city=" + city + ", contactNumber=" + contactNumber + "]";
	}

}
