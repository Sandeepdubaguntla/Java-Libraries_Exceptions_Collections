package Has_a_Relationship;

public class User {
	private String name,gender;
	private long mobileno;
	
	private Ticket t;
	
	public User(String name, String gender, long mobileno) {
		super();
		this.name = name;
		this.gender = gender;
		this.mobileno = mobileno;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public void Userdetails() {
		System.out.println("User name: "+getName());
		System.out.println("Gender: "+getGender());
		System.out.println("Mobile no: "+getMobileno());
	}
	public void TicketD() {
		Ticket t = new Ticket("hyd","rjy",21546,25,600,500);
		t.Ticketdetails() ;
	}
	
}
