package test;

public class Student1 {
	private String Class;
	private String Sname;
	private Integer id;
	public Student1(String Class, String Sname, Integer id) {
		this.Class = Class;
		this.Sname = Sname;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student1 [Class=" + Class + ", Sname=" + Sname + ", id=" + id + "]";
	}
	
}
