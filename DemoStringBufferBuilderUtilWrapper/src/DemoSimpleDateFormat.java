import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoSimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today=new Date();
		String pattern1="dd-MM-YYYY";
		SimpleDateFormat sf1=new SimpleDateFormat(pattern1);
		String fDate=sf1.format(today);
		System.out.println(fDate);
		
		

	}

}
