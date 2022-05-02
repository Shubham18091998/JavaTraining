import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DemoLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String>linkedSet1=new HashSet<>();
		String msg1="This is zero is line line";
		String strArr1[]=msg1.split(" ");
		for(String word:strArr1) {
			linkedSet1.add(word);
		}
		System.out.println(linkedSet1);
		
		LinkedHashSet <String>linkedSet2=new LinkedHashSet<>();
		String msg2="This is zero is line line";
		String strArr2[]=msg2.split(" ");
		for(String word:strArr2) {
			linkedSet2.add(word);
		}
		System.out.println(linkedSet2);
		
		TreeSet <String>linkedSet3=new TreeSet<>();
		String msg3="This is zero is line line";
		String strArr3[]=msg3.split(" ");
		for(String word:strArr3) {
			linkedSet3.add(word);
		}
		System.out.println(linkedSet3);
	}

}
