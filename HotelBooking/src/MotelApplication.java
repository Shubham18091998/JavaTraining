import java.util.*;
public class MotelApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please choose from given options");
		System.out.println("1.Register a customer");
		System.out.println("2.Book a room");
		System.out.println("3.Quit");
		int choice=sc.nextInt();
		if (choice==1) {
			System.out.print("Enter customer number:");
			int custNumber=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter customer name:");
			String custName=sc.nextLine();
			System.out.print("Enter customer email id:");
			String custEmail=sc.next();
			Customer c=new Customer(custNumber,custName,custEmail);
			c.showCustomerDetails();
			System.out.println("Customer registered sucessfully");
		}
		else if(choice==2) {
			System.out.print("Enter room number:");
			int roomNumber=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter room type:");
			String type=sc.nextLine();
			System.out.print("Enter room rate:");
			int rate=sc.nextInt();
			Room r=new Room(roomNumber,type,rate);
			r.showRoomDetails();
			System.out.println("Room booked sucessfully");	
		}
		else if(choice==3){
			System.exit(0);
		}
		else {
			System.out.println("Invalid option");
		}

	}

}
