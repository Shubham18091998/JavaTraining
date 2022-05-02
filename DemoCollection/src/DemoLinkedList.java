import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DemoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> nameList=new LinkedList<String>();  //It works for String only(Type Specific)
		//ArrayList nameList=new ArrayList();                  //It works for any object(Generic)
		System.out.println("Is Empty? "+nameList.isEmpty());
		nameList.add("Anita");
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
		System.out.println("------------------------------");
		ListIterator<String> listItr=nameList.listIterator(nameList.size());
		while(listItr.hasPrevious()) {
			String name=listItr.previous();
			System.out.println(name);
		}
		System.out.println("--------------------------------");
		while(listItr.hasNext()){
			System.out.println(listItr.next());
		}
		
		System.out.println("-----------------------------");
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
		//nameList.clear();
		//System.out.println(nameList);
		System.out.println("--------------------------------");
		LinkedList<String> newNameList=new LinkedList<String>(nameList);
		newNameList.add("Ranjit");
		//OR
		newNameList.addAll(nameList);
		System.out.println(nameList);
	}

}
