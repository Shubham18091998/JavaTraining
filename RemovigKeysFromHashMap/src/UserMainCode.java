import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class UserMainCode {
	public static int sizeOfResultantHashMap(HashMap<Integer,String>hMap) {
		Iterator<Integer> itr=hMap.keySet().iterator();
		int c=0;
		while(itr.hasNext()) {
			int k=itr.next();
			if(k%4!=0) {
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		HashMap<Integer,String> hMap=new HashMap<>();
		System.out.println("Enter key value:");
		for(int i=0;i<n;i++) {
			hMap.put(sc.nextInt(), sc.next());
		}
		System.out.println(sizeOfResultantHashMap(hMap));

	}

}
