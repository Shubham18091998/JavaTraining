
public class DemoOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qty=10;
		float price=1.25f;
		float totalCost=qty*price;
		System.out.println("Total Cost="+totalCost);
		
		int x=5;
		int y=2;
		System.out.println((float)x/y);
		
		float avg=(float)(1+2+3+4)/4;
		System.out.println("Average="+avg);
		
		int a=15;
		int b=12;
		int result=a%b;
		System.out.println("Result="+result);
		
		// Postfix operator
		int p=5;
		int q=p++;  //p=p+1 -> q=p
		System.out.println("p="+p+" "+"q="+q);
		 
		// Prefix operator
		int r=5;
		int s=++r; //s=r -> r=r+1
		System.out.println("r="+r+" "+"s="+s);

	}

}
