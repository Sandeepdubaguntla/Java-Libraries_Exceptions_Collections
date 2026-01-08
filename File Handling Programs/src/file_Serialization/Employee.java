package file_Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	private String name;
	private int id;
	private double sal;
	
	public Employee() {}
	
	public Employee(String name,int id,double sal) {
		this.name=name;
		this.id=id;
		this.sal=sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public void display()   {
		System.out.println("Name :" +getName());
		System.out.println("Id :" +getId());
		System.out.println("Salary :"+getSal());
	}
	
	
	
	
}
