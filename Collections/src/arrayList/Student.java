package arrayList;

public class Student {
	private String name;
	private int marks,rollno;
	private char gender,section;
	public Student(String name, int rollno,char section, int marks, char gender) {
		super();
		this.name = name;
		this.marks = marks;
		this.rollno = rollno;
		this.gender = gender;
		this.section = section;
	}
	@Override
	public String toString() {
		return "/nStudent name=" + name + "/n marks=" + marks + "/n rollno=" + rollno + "/n gender=" + gender + "/n section="
				+ section + "/n-----------------------------------------------";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	
}
