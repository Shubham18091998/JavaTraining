
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DemoDateFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat date_formatter=DateFormat.getDateInstance();
		//Date today=new Date();
		//System.out.println(today);
		String str_date=date_formatter.format(new Date());
		System.out.println(str_date);
		
		DateFormat date_formatter_1=DateFormat.getDateInstance(DateFormat.DEFAULT);
		//Date today=new Date();
		//System.out.println(today);
		String str_date_1=date_formatter_1.format(new Date());
		System.out.println(str_date_1);
		
		DateFormat date_formatter_2=DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.US);
		//Date today=new Date();
		//System.out.println(today);
		String str_date_2=date_formatter_2.format(new Date());
		System.out.println(str_date_2);
	}

}
