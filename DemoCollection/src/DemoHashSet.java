import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> nameSet=new HashSet<>();
		System.out.println("Is Empty?"+nameSet.isEmpty());
		nameSet.add("Anita");
		nameSet.add("Sunita");
		nameSet.add("Kavita");
		nameSet.add("Anita");
		System.out.println("Size "+nameSet.size());
		System.out.println(nameSet);
		System.out.println("----------------------------------");
		for(String name:nameSet) {
			System.out.println(name);
		}
		System.out.println("----------------------------------");
		Iterator<String> itr=nameSet.iterator();
		while(itr.hasNext()) {
			String name=itr.next();
			System.out.println(name);
		}
		System.out.println("-----------------------------------");
		
	}

}
