import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserMainCode {
	public static int ValidateDate(String s) {
		if(s.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}")) {
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			sdf.setLenient(false);
			try {
				Date d=sdf.parse(s);
				return 1;
			}catch(ParseException e) {
				return -1;
			}
			
		}
		else {
			return -1;
		}
	}
	
	public static int validateTime(String s) {
		return 0;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date:");
		String s=sc.nextLine();
		int val=ValidateDate(s);
		if(val==1) {
			System.out.println("Valid date format");
		}
		else {
			System.out.println("Invalid date format");
		}
	}
}
