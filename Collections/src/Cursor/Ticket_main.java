package Cursor;
import java.util.ArrayList;
import java.util.Iterator;
public class Ticket_main {
	public static void main(String[] args) {
		Ticket t1 = new Ticket(216546, 900, 90,1250, "hyderabad", "chennai");
		Ticket t2 = new Ticket(216547, 500, 40,1100, "hyderabad", "rajahmundry");
		Ticket t3 = new Ticket(216548, 560, 50,500, "rajahmundry", "chennai");
		Ticket t4 = new Ticket(216549, 580, 50,300, "hyderabad", "pune");
		ArrayList<Ticket> al = new ArrayList();
		al.add(t1);
		al.add(t2);
		al.add(t3);
		al.add(t4);
		
		for(Ticket t : al) {
			System.out.println();
			if(t.getDistance()>=500) {
				t.Ticket_details();
			}
		}
		System.out.println("================================");
		
		
		
		for(Ticket t : al) {
			if(t.getTid()%2==0) {
				System.out.println("Seatno: "+t.getSeatno());;
				System.out.println("Cost: "+t.getCost());
			}
		}
		System.out.println("================================");
		
		
		
		for(Ticket t : al) {
			if(t.getBoarding().equals("hyderabad")) {
				System.out.println("Cost: "+t.getCost());;
			}
		}
		System.out.println("================================");
		
		
		
		for(Ticket t : al) {
			if(t.getDestination().equals("chennai")){
				t.setCost(0);
				System.out.println("After updating cost: "+t.getCost());
			}
		}
		System.out.println("================================");
		
		
		
		Iterator<Ticket> itr = al.iterator();
			while(itr.hasNext()){
				Ticket t=itr.next();
				if(t.getCost()<=500) {
					itr.remove();
					t.Ticket_details();
				}
				
			}
		System.out.println("================================");
	}
}
