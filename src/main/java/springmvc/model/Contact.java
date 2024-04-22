package springmvc.model;

import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Contact {
	
	private String name;
	private String emailId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String dateOfBirth;
	private List<String> courses;
	private String gender;
	private String type;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Contact(String name, String emailId, String dateOfBirth, List<String> courses, String gender, String type,
			Address address) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.dateOfBirth = dateOfBirth;
		this.courses = courses;
		this.gender = gender;
		this.type = type;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", emailId=" + emailId + ", dateOfBirth=" + dateOfBirth + ", Courses="
				+ courses + ", gender=" + gender + ", type=" + type + ", address=" + address + "]";
	}

}
