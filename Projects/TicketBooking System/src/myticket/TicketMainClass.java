package myticket;

import java.util.Scanner;

public class TicketMainClass {
	public static void main(String[] args) {
		RedApp red = new RedApp();
		Scanner sc=new Scanner(System.in);
		boolean cond =true;
		while(cond) {
		System.out.println("Enter your Choice...");
		System.out.println(" 1.Book Ticket. \n 2.Show Tickets. \n 3.Search Ticket By ID \n 4.Search Ticket By BoardingPoint. \n 5.Update Ticket Cost. \n 6.Cancel Ticket. \n 7.Exit.");
		int choice=sc.nextInt();
			switch(choice) {
				case 1:{
					System.out.println("Enter the Prefered SeatNO :");
					int seatno=sc.nextInt();
					System.out.println("Enter the Boarding Point :");
					String boarding = sc.next();
					System.out.println("Enter the Destination Point :");
					String destination = sc.next();
					System.out.println("Enter the Distance from Boarding to Destination :");
					int distance = sc.nextInt();
					Ticket t = new Ticket(seatno, boarding, destination, distance);
					red.bookTicket(t);
				}break;
				case 2:{
						try {
							red.showTicket();
						}
						catch(TicketNotFoundException e) {
							System.out.println("You have Not Booked any Tickets yet.....");
							}
					}
				break;
				case 3:{
					System.out.println("Enter the Ticket ID :");
					int id=sc.nextInt();
					while(true) {
						try {
							red.searchTicketById(id);
							break;
						}catch(InvalidTicketIDException e) {
							System.out.println("Re-Enter Valid Ticket Id :");
							 id=sc.nextInt();
						}catch(TicketNotFoundException e) {
							System.out.println("You have Not Booked any Tickets yet.....");
							break;
						}
					}
				}break;
				case 4:{
					System.out.println("Enter the Boarding Point :");
					String boarding = sc.next();
					while(true) {
						try {
							red.searchTicketByBoarding(boarding);
							break;
						}catch(InvalidTicketIDException e) {
							System.out.println("Re-Enter Valid Boarding Point :");
							 boarding=sc.next();
						}catch(TicketNotFoundException e) {
							System.out.println("You have Not Booked any Tickets yet.....");
							break;
						}
					}
				}break;
				case 5:{
					System.out.println("Enter the Ticket ID :");
					int id=sc.nextInt();
					System.out.println("Enter the New Cost of the Ticket :");
					int newCost = sc.nextInt();
					
					while(true) {
						try {
							red.updateTicket(id, newCost);
							break;
						}catch(InvalidTicketIDException e) {
							System.out.println("Re-Enter Valid Ticket Id and cost :");
							 id=sc.nextInt();
							 newCost = sc.nextInt();
						}catch(TicketNotFoundException e) {
							System.out.println("You have Not Booked any Tickets yet.....");
							break;
						}
					}
				}break;
				case 6:{
					System.out.println("Enter the Ticket ID :");
					int id = sc.nextInt();
					
					while(true) {
						try {
							red.cancelTicket(id);
							break;
						}catch(InvalidTicketIDException e) {
							System.out.println("Re-Enter Valid Ticket Id :");
							 id=sc.nextInt();
						}catch(TicketNotFoundException e) {
							System.out.println("You have Not Booked any Tickets yet.....");
							break;
						}
					}
				}break;
				case 7:{
					cond=false;
					System.out.println("Thank You .....");
				}break;
		
				default:{
					System.out.println("Please Enter valid Choice....");
				}
			}
		}
		sc.close();
	}
}
