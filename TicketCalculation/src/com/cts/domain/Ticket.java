package com.cts.domain;

public class Ticket {
	private int ticketId;
	private int price;
	private static int availableTickets;
	public Ticket() {
		super();
	}
	public Ticket(int ticketId, int price) {
		super();
		this.ticketId = ticketId;
		this.price = price;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>0)
			Ticket.availableTickets = availableTickets;
	}
	public int calculateTicketCost(int noOfTickets) {
		int total=0;
		//System.out.println(availableTickets);
		//System.out.println(noOfTickets);
		if(availableTickets>=noOfTickets) {
			//System.out.println(1);
			//System.out.println(noOfTickets);
			//System.out.println(price);
			total=noOfTickets*price;
			System.out.println(total);
		}
		else
			total=-1;
		return total;
	}
	

}
