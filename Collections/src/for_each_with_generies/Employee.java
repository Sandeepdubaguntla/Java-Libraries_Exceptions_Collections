package for_each_with_generies;

public class Employee {
	private String name;
	private String designation;
	private int id;
	private String location;
	private int salary;
	public Employee(String name, String designation, int id, String location, int salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.id = id;
		this.location = location;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void display() {
		System.out.println("Name of the employee: "+getName());
		System.out.println("ID of tge employee: "+getId());
		System.out.println("Salary of the employee: "+getSalary());
		System.out.println("Location of the employee: "+getSalary());
		System.out.println("Designation of the employee: "+getDesignation());
	}
	@Override
	public String toString() {
		return "/n Employee name=" + name + "/n designation=" + designation + "/n id=" + id + "/n location=" + location
				+ "/n salary=" + salary + "/n----------------------------------------";
	}
	
}
