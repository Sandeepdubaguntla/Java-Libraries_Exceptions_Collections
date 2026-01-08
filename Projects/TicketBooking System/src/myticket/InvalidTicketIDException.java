package myticket;

public class InvalidTicketIDException extends RuntimeException{
	@Override
	public String toString() {
		return getClass()+": You Entered Invalid TicketId...";
	}
}
