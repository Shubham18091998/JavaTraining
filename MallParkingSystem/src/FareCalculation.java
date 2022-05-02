import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FareCalculation {
	static String pattern="dd/MM/yyyy HH:mm";
	
	public static void validateTime(String inTime,String outTime,String currentTime) {
        String pattern3="dd/MM/yyyy HH:mm";
        SimpleDateFormat sf5= new SimpleDateFormat(pattern3);

        try {
            Date inDate=sf5.parse(inTime);
            Date outDate=sf5.parse(outTime);
            Date currentDate=sf5.parse(currentTime);
            System.out.println(inDate+" "+outDate);
            long in_timeDifference= currentDate.getTime()-inDate.getTime();
            long out_timeDifference= outDate.getTime()-inDate.getTime();
             long in_minutes= (in_timeDifference/(60000));
             long out_minutes= (out_timeDifference/(60000));
             //System.out.println("Minutes "+minutes);
             int fees=0;
             if(in_minutes >=1 && out_minutes>=1) {
                 System.out.println("Valid");
                    int hrs =(int) (out_minutes/60);
                    fees=(int) (hrs*10 +(out_minutes%60)*10);
                    System.out.println("fees"+fees);

             }
             else if(in_minutes<1) {
            	 System.out.println("Invalid in time");
             }
             else {
                 System.out.println("Invalid out Time");
             }

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println("Invalid date format date must be dd/MM/yyyy HH:mm format");
        }
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter In-time:");
		String inTime=sc.nextLine();
		System.out.println("Enter Out-time");
		String outTime=sc.nextLine();
		String currentTime="29/10/2019 20:10";
		FareCalculation.validateTime(inTime,outTime,currentTime);
	}	
}