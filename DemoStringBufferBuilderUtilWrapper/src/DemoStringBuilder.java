
public class DemoStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer ->Mutable | Synchronized
		//StringBuilder ->Mutable | Unsynchronized
		StringBuilder sb1=new StringBuilder(); 
		sb1.append("Hello ").append("World");
		System.out.println(sb1);

	}

}
