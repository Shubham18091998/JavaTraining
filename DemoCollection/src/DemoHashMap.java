import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String>hMap=new HashMap<>();
		hMap.put("A1", "Beena");
		hMap.put("Z1", "Leena");
		hMap.put("B1", "Seema");
		hMap.put("A10", "Vanita");
		System.out.println(hMap);
		System.out.println(hMap.get("A10"));
		System.out.println("Is Z1 present?"+hMap.containsKey("Z11"));
		System.out.println("-------------------------------------");
		Set<String>kSet=hMap.keySet();
		Iterator<String>itr=kSet.iterator();
		while(itr.hasNext()) {
			String k=itr.next();
			String v=hMap.get(k);
			System.out.println(k+" "+v);
		}
		System.out.println("--------------------------------------");
		for(String k:kSet) {
			System.out.println(k+" "+hMap.get(k));
		}
	}

}
