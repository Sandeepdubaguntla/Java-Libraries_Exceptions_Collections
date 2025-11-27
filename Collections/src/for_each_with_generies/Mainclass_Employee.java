package for_each_with_generies;

import java.util.ArrayList;

public class Mainclass_Employee {
	public static void main(String[] args) {
		Employee e1=new Employee("Tarun","Developer",2,"Banglore",90000);
		Employee e2=new Employee("Sandeep","Tester",3,"Hyderabad",60000);
		Employee e3=new Employee("Ayyappa","hr",4,"Chennai",50000);
		Employee e4=new Employee("Kasi","Developer",5,"Banglore",40000);
		Employee e5=new Employee("Bhaskar","Tester",2,"Hyderabad",30000);
		
		ArrayList <Employee> al = new ArrayList <Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		
		//wap to print the employee name who are in the banglore location
//		for(int i=0;i<al.size()-1;i++) {
//			Object obj =al.get(i);
//			Employee emp=(Employee) obj;
//			if(emp.getLocation().equals("Banglore")) {
//				System.out.println("Employee name: "+emp.getName());
//			}
//		}
		for(Employee emp:al) {
			if(emp.getLocation().equals("Banglore"))
				System.out.println("Name: "+emp.getName());
		}
		System.out.println("------------------------------------------");
		
		
		//wap to print the employee name and id who have the salary more than 60000
//		for(int i=0;i<al.size()-1;i++) {
//			Object obj =al.get(i);
//			Employee emp=(Employee) obj;
//			if(emp.getSalary()>=60000) {
//				System.out.println("Employee name: "+emp.getName());
//				System.out.println("Employee id: "+emp.getId());
//			}
//		}
		for(Employee emp:al) {
			if(emp.getSalary()>=60000) {
				System.out.println("Name: "+emp.getName());
				System.out.println("Id: "+emp.getId());
			}
		}
		System.out.println("------------------------------------------");
		//wap to print the developers salary
//		for(int i=0;i<al.size()-1;i++) {
//			Object obj =al.get(i);
//			Employee emp=(Employee) obj;
//			if(emp.getDesignation().equals("Developer")) {
//				System.out.println("Employee Salary: "+emp.getSalary());
//			}
//		}
		for(Employee emp:al) {
			if(emp.getDesignation().equals("Developer"))
				System.out.println("Salary: "+ emp.getSalary());
		}
	}
}
