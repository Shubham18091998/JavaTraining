import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParkingCalculation {
	static String pattern="dd/MM/yyyy HH:mm";
	
	public static int validateTime(String inTime,String outTime,String currentTime) {
		if(inTime.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}\\s[0-9]{2}[:]{1}[0-9]{2}") && outTime.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}\\s[0-9]{2}[:]{1}[0-9]{2}")) {
			SimpleDateFormat sdf=new SimpleDateFormat(pattern);
			sdf.setLenient(false);
			try {
				Date in_d=sdf.parse(inTime);
				Date out_d=sdf.parse(outTime);
				Date curr_d=sdf.parse(currentTime);
				long in_millis=in_d.getTime();
				long out_millis=out_d.getTime();
				long curr_millis=curr_d.getTime();
				long in_min=((curr_millis-in_millis)/(1000*60))+1;
				long out_min=((out_millis-in_millis)/(1000*60))+1;
				//System.out.println(min);
				if(in_min>1 && out_min>1) {
					return 1;
				}
				else if(in_min<=1){
					return -1;
				}
				else if(out_min<=1) {
					return -2;
				}
				else {
					return 0;
				}
			}catch(ParseException e) {
				return -1;
			}
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter In-time:");
		String inTime=sc.nextLine();
		System.out.println("Enter Out-time");
		String outTime=sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String currentTime="29/10/2019 20:10";
		if(ParkingCalculation.validateTime(inTime,outTime,currentTime)==1) {
			//System.out.println(1);
			Date inDate = null;
			Date outDate = null;
			try {
				inDate = sdf.parse(inTime);
				outDate = sdf.parse(outTime);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			long in_millis = inDate.getTime();
			long out_millis = outDate.getTime();
			long hour=((out_millis-in_millis)/(1000*60*60))+1;
			long amt=hour*10;
			System.out.println(amt+" Rupees");
			
		}
		else if(ParkingCalculation.validateTime(inTime,outTime,currentTime)==-1) {
			System.out.println(inTime+" is an Invalid In-Time");
		}
		else if(ParkingCalculation.validateTime(inTime,outTime,currentTime)==-2) {
			System.out.println(outTime+" is an Invalid Out-Time");
		}
		else {
			System.out.println("Invalid date");
		}
	}
}