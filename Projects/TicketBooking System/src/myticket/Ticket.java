package myticket;

import java.util.Random;

public class Ticket {
	private int ticketId,seatNo;
	private String boardingPoint,destinationPoint;
	private int distance,cost;
	
	Random r=new Random();
	
	public Ticket() {}
	public Ticket(int seatNo, String boardingPoint, String destinationPoint, int distance) {
		this.ticketId = r.nextInt(12345678);
		this.seatNo = seatNo;
		this.boardingPoint = boardingPoint;
		this.destinationPoint = destinationPoint;
		this.distance = distance;
		this.cost = distance * 2;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public String getBoardingPoint() {
		return boardingPoint;
	}
	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}
	public String getDestinationPoint() {
		return destinationPoint;
	}
	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public void display() {
		System.out.println("Ticket ID is : "+getTicketId() );
		System.out.println("Seat Number : "+getSeatNo());
		System.out.println("Boarding Point :"+getBoardingPoint());
		System.out.println("Destination Point :"+getDestinationPoint());
		System.out.println("Distance :"+getDistance());
		System.out.println("Cost :"+getCost());
	}

	
	
}
