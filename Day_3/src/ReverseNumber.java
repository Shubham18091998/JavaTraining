import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int r=0;
		while(n>0) {
			r=r*10+n%10;
			n=n/10;
		}
		System.out.println("Reversed number:"+r);
		

	}

}
