package arrayList;

import java.util.ArrayList;

public class mainclass_Student {
	public static void main(String[] args) {
		Student s1 = new Student("Tarun",546,'A',848,'M');
		Student s2 = new Student("Ram",510,'C',800,'M');
		Student s3 = new Student("Sandeep",512,'A',900,'M');
		Student s4 = new Student("Mrunal",547,'A',700,'F');
		Student s5 = new Student("Sheela",545,'B',750,'F');
		
		ArrayList al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		//wap to display the student name in section A
		for(int i=0;i<al.size()-1;i++) {
			Object obj = al.get(i);
			Student std = (Student) obj;
			if(std.getSection()=='A') {
				System.out.println(std.getName());
			}
		}
		System.out.println("------------------------------------------");
		
		//wap to display marks of student ram
		for(int i=0;i<al.size()-1;i++) {
			Object obj = al.get(i);
			Student std = (Student) obj;
			if(std.getName().equals("Ram")) {
				System.out.println(std.getMarks());
			}
		}
		System.out.println("------------------------------------------");
		
		//wap to display name and marks of the students whose rollno is even.
		for(int i=0;i<al.size()-1;i++) {
			Object obj = al.get(i);
			Student std = (Student) obj;
			if(std.getRollno()%2==0) {
				System.out.println(std.getName());
				System.out.println(std.getMarks());
			}
		}
		System.out.println("------------------------------------------");
		
		//wap to update the marks of sheela
		for(int i=0;i<al.size();i++) {
			Object obj = al.get(i);
			Student std = (Student) obj;
			if(std.getName().equals("Sheela")) {
				std.setMarks(300);
				System.out.println(std.getMarks());
			}
		}
		System.out.println("------------------------------------------");
	}
}
