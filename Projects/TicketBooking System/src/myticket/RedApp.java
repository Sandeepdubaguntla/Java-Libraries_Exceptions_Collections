package myticket;

import java.util.ArrayList;
import java.util.Iterator;

public class RedApp {
	private ArrayList<Ticket> ticket = new ArrayList<>();
	private Ticket t;
	
	public void bookTicket(Ticket t) {
		ticket.add(t);
		System.out.println("Ticket Added Successfully ... with ticketId :"+t.getTicketId());
	}
	
	public void showTicket() {
		if(ticket.isEmpty())
		{
//			System.out.println("No Tickets Booked yet.....");
			TicketNotFoundException t = new TicketNotFoundException();
			throw t;
		}
		else {
			for(Ticket t:ticket) {
				t.display();
			}
		}
	}
	
	public void searchTicketById(int id) {
		boolean isFound = false;
		if(ticket.isEmpty())
		{
//			System.out.println("No Tickets Booked yet.....");
			throw new TicketNotFoundException();
		}
		else {
			for(Ticket t : ticket) {
				if(t.getTicketId() == id) {
					System.out.println("Ticket Found....");
					t.display();
					isFound = true;
				}
			}
		}
		if(isFound != true) {
//			System.out.println("You Entered invalid TicketId ... No Ticket Found..");
			InvalidTicketIDException in = new InvalidTicketIDException();
			throw in;
		}
	}
	
	public void searchTicketByBoarding(String boarding) {
		boolean isFound = false;
		if(ticket.isEmpty()) {
//			System.out.println("No Tickets Booked yet.....");
			throw new TicketNotFoundException();
		}
		else {
			for(Ticket t : ticket) {
				if(t.getBoardingPoint().equalsIgnoreCase(boarding)) {
					System.out.println("Ticket Found....");
					t.display();
					isFound = true;
				}
			}
		}
		if(isFound != true) {
//			System.out.println("You Entered invalid Boarding Point ... No Ticket Found..");
			throw new InvalidTicketIDException();
		}
	}
	
	public void updateTicket(int id,int newCost) {
		boolean isUpdate = false;
		if(ticket.isEmpty()) {
//			System.out.println("No Tickets Booked yet.....");
			throw new TicketNotFoundException();
		}
		else {
			for(Ticket t : ticket) {
				if(t.getTicketId() == id) {
					t.setCost(newCost);
					System.out.println(t.getTicketId()+" Ticket cost updated to "+t.getCost());
					isUpdate = true;
				}
			}
		}
		if(isUpdate != true) {
//			System.out.println("You Entered invalid TicketId ... No Ticket Updated..");
			throw new InvalidTicketIDException();
		}
	}
	
	public void cancelTicket(int id) {
		Iterator<Ticket> itr = ticket.iterator();
		boolean isCancel = false;
		if(ticket.isEmpty()) {
//			System.out.println("No Tickets Booked yet.....");
			throw new TicketNotFoundException();
		}
		else {
			while(itr.hasNext()) {
				Ticket t = itr.next();
				if(t.getTicketId() == id) {
					itr.remove();
					System.out.println("Ticket Cancelled Successfully....");
					System.out.println("Your Refund will be credited shortly....");
					isCancel =true;
				}
			}
		}
		if(isCancel != true) {
//			System.out.println("You Entered invalid TicketId ... No Ticket Cancelled...");
			throw new InvalidTicketIDException();
		}
	}
}
