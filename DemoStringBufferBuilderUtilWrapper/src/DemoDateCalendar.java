import java.util.Calendar;
import java.util.Date;

public class DemoDateCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date toDay=new Date();
		System.out.println(toDay);
		long time=toDay.getTime();
		System.out.println(time);
		long milliSec=1000*60*60*24;
		time+=milliSec;
		Date tomorrow=new Date(time);
		System.out.println(tomorrow);
		System.out.println("--------------------------------");
		
		Calendar doj=Calendar.getInstance();
		doj.set(2022, 00, 06, 10, 00, 00);
		System.out.println("Date "+doj.get(Calendar.DATE));
		System.out.println("Month "+doj.get(Calendar.MONTH));
		System.out.println("Year "+doj.get(Calendar.YEAR));
		//Converting calendar to date
		Date m_doj=doj.getTime();
		System.out.println(m_doj);
		
		//Convert date to calendar
		Date today=new Date();
		Calendar n_today=Calendar.getInstance();
		n_today.setTime(today);

	}

}
