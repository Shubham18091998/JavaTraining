
public class DemoStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer();
		sb1.append("Hello");
		System.out.println(sb1);
		sb1.append("World");
		System.out.println(sb1);
		sb1.append("Hi").append("All").append("How Are You");
		System.out.println(sb1);
		
		String name="Saurabh";
		StringBuffer sb2=new StringBuffer(name);
		System.out.println(sb2);
		
		StringBuffer sb3=new StringBuffer("Aitha");
		sb3.insert(1,'n');
		System.out.println(sb3);
		sb3.delete(4, 5);
		System.out.println(sb3);
		sb3.reverse();
		System.out.println(sb3);
		
		String value="Sunita";
		StringBuffer sb4=new StringBuffer(value);
		sb4.reverse();
		value=sb4.toString();      //StringBuffer and String are not compatible
		System.out.println(value);
	}

}
