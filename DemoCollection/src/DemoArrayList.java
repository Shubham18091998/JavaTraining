import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nameList=new ArrayList<String>();  //It works for String only(Type Specific)
		//ArrayList nameList=new ArrayList();                //It works for any object(Generic)
		System.out.println("Is Empty? "+nameList.isEmpty());
		nameList.add("Anita");
		nameList.add("Babita");
		nameList.add("Sunita");
		nameList.add("Kavita");
		nameList.add("Vanita");
		System.out.println(nameList);
		System.out.println("Size "+nameList.size());
		System.out.println("Element at 0 index "+nameList.get(0));
		nameList.set(0, "Anitha");   //Overwrite element at 0 index
		System.out.println(nameList);
		nameList.add(1, "Vanitha");  //Add element at 1 index(not overwrite)
		System.out.println(nameList);
		System.out.println("Is Sunita present? "+nameList.contains("Sunita"));
		nameList.remove("Sunita");
		System.out.println(nameList);
		Iterator itr=nameList.iterator();                  //Generic iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------------");
		Iterator<String> itr1=nameList.iterator();         //Type Specific iterator
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("-----------------------------");
		for(String name:nameList) {
			System.out.println(name);
		}
		System.out.println("--------------------------------");
		System.out.println("After sorting");
		Collections.sort(nameList);
		for(String name:nameList) {
			System.out.println(name);
		}
		System.out.println("----------------------------------");
		//nameList.clear();
		//System.out.println(nameList);
		
		ArrayList<String> newNameList=new ArrayList<String>(nameList);
		newNameList.add("Ranjit");
		//OR
		newNameList.addAll(nameList);
		System.out.println(nameList);
		

	}

}
