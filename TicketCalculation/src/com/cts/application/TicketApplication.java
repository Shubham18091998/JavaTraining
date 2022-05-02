package com.cts.application;
import java.util.*;

import com.cts.domain.Ticket;
public class TicketApplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of bookings:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		System.out.println("Enter the available tickets:");
		int availableTickets=sc.nextInt();
		System.out.println("Enter the ticket Id:");
		int ticketId=sc.nextInt();
		System.out.println("Enter the price:");
		int price=sc.nextInt();
		System.out.println("Enter the no of tickets:");
		int noOfTickets=sc.nextInt();
		
		Ticket ticket=new Ticket(ticketId,price);
		ticket.setAvailableTickets(availableTickets);
		System.out.println("Available tickets:"+ticket.getAvailableTickets()); 
			
		if(ticket.calculateTicketCost(noOfTickets)!=-1) {
			System.out.println("Total amount:"+ticket.calculateTicketCost(noOfTickets));
			System.out.println("Available tickets after booking:"+(ticket.getAvailableTickets()-noOfTickets));
		}
		else {
			System.out.println("Ticket not booked.");
			System.out.println("Available tickets after booking:"+ticket.getAvailableTickets());
		}
		
	}
					
	}
	
}
