package predicateInterface_problems;

public class Employee {
	private String name;
	private int id;
	private long sal;
	private String designation;
	private String gender;
	
	public Employee() {}
	
	public Employee(String name, int id, long sal, String designation, String gender) {
		
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.designation = designation;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ",\n id=" + id + ",\n sal=" + sal + ",\n designation=" + designation + ",\n gender="
				+ gender + "]\n----------------------";
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

	public long getSal() {
		return sal;
	}

	public void setSal(long sal) {
		this.sal = sal;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void display() {
		System.out.println("Name :"+getName());
		System.out.println("Id :"+getId());
		System.out.println("Salary :"+getSal());
		System.out.println("Designation :"+getDesignation());
		System.out.println("Gender :"+getGender());
	}
	
	
}
