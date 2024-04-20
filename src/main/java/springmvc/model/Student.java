package springmvc.model;

public class Student {
	
	private String name;
	private Integer age;
	private String emailId;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	private String state;
	public String getName() {
		return name;
	}
	public Student(String name, Integer age, String emailId, String state) {
		super();
		this.name = name;
		this.age = age;
		this.emailId = emailId;
		this.state = state;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", emailId=" + emailId + ", state=" + state + "]";
	}


}
