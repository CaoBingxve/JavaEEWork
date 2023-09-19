package test;

public class Student2 {
	private String Class;
	private String Sname;
	private Integer id;
	
	private Student1 student1;
	
	public void setStudent1(Student1 student1) {
		this.student1 = student1;
	}
	public void setClass(String class1) {
		Class = class1;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student2 [Class=" + Class + ", Sname=" + Sname + ", id=" + id + "]";
	}
	
}
