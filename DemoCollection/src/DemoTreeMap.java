import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String>hMap=new TreeMap<>();
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
		System.out.println();
		Set<Map.Entry<String, String>>eSet=hMap.entrySet();
		Iterator<Map.Entry<String, String>>itr1=eSet.iterator();
		while(itr1.hasNext()) {
			Map.Entry<String, String> entry=itr1.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
