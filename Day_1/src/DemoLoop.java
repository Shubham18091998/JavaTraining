
public class DemoLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("While Loop:");
		int x=1;
		while(x<=5)
		{
			System.out.println(x);
			x++;
		}	
		System.out.println("After loop="+x);
	
		System.out.println("Do While Loop:");
		int y=1;
		do
		{
			System.out.println(y);
			y++;
		}while(y<=5);
		System.out.println("After loop="+y);
		
		System.out.println("For Loop:");
		for(int z=1;z<=5;z++)
		{
			System.out.println(z);
		}
		
		System.out.println("For Loop:");
		int z=1;
		for(;z<=5;z++)
		{
			System.out.println(z);
		}
		System.out.println("After loop="+z);
		
		System.out.println("---------------------");
		int count=0;
		while(count<8)
		{
			count++;
			if(count==5)
			{
				continue;
			}
			System.out.println(count);

		}
		
	}

}
