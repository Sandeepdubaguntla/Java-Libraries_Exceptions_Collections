package Has_a_Relationship;

public class Ticket {
	private String boarding,destination;
	private int tid,seatno,distance,cost;
	public Ticket(String boarding, String destination, int tid, int seatno, int distance,int cost) {
		super();
		this.boarding = boarding;
		this.destination = destination;
		this.tid = tid;
		this.seatno = seatno;
		this.distance = distance;
		this.cost=cost;
	}
	
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getBoarding() {
		return boarding;
	}
	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getSeatno() {
		return seatno;
	}
	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}

	public void Ticketdetails() {
		System.out.println("Ticket ID: "+getTid());
		System.out.println("Seatno: "+getSeatno());
		System.out.println("Boarding: "+getBoarding());
		System.out.println("Destination: "+getDestination());
		System.out.println("Distance: "+getDistance());
		System.out.println("Cost: "+getDistance()*2);
		
	}
	
}
