package predicateInterface_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain_StreamApi {
	public static void main(String[] args) {
		ArrayList<Employee> al =new ArrayList<>();
		Employee e1 = new Employee("Sandeep", 25, 50000, "Developer", "Male");
		Employee e2 = new Employee("Rajkumar", 16, 45200, "Developer", "Male");
		Employee e3 = new Employee("Manideep", 12, 65000, "Tester", "Male");
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		//WAP to get the employees with salary greater than 40000.
		
		List<Employee> res=al.stream().filter((emp)->emp.getSal()>=40000).collect(Collectors.toList());
		System.out.println(res);
		
		//WAP to get the Employees with Even id numbers.
		
		List<Employee> res1=al.stream().filter((emp)->emp.getId()%2==0).collect(Collectors.toList());
		System.out.println(res1);
		
		//WAP to Print the details of the developers
		
		List<Employee> res2=al.stream().filter((emp)->emp.getDesignation().equals("Developer")).collect(Collectors.toList());
		System.out.println(res2);
		
	}
}
