package Cursor;

public class Ticket {
	private int tid,distance,seatno,cost;
	private String boarding,destination;
	
	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getSeatno() {
		return seatno;
	}

	public void setSeatno(int seatno) {
		this.seatno = seatno;
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

	public Ticket(int tid, int distance, int seatno, int cost, String boarding, String destination) {
		super();
		this.tid = tid;
		this.distance = distance;
		this.seatno = seatno;
		this.cost = cost;
		this.boarding = boarding;
		this.destination = destination;
	}

	public void Ticket_details() {
		System.out.println("TicketID: "+getTid());
		System.out.println("Seatno: "+getSeatno());
		System.out.println("Cost: "+getCost());
		System.out.println("Distance: "+getDistance());
		System.out.println("Bording point: "+getBoarding());
		System.out.println("Destination point: "+getDestination());
		

	}
	
}
