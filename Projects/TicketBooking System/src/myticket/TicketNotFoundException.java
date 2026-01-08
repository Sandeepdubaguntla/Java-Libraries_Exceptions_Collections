package myticket;

public class TicketNotFoundException extends RuntimeException{
	@Override
	public String toString() 
	{
		return getClass()+": No Tickets are Booked yet....";
	}
}
