import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentMain {

	public static void main(String[] args) {
		BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader("student.txt"));
			String line=null;
			String arr[]= {};
			HashMap<String,Integer> rec=new HashMap<>();
			int c=0;
			while((line=br.readLine())!=null) {
				arr=line.split(",");
				for(int i=0;i<arr.length;i=i+3) {
					rec.put(arr[i+1],Integer.parseInt(arr[i+2]));
					c=c+1;
				}
			}
			System.out.println(rec);
			int total=0;
	        int maxValueInMap=(Collections.max(rec.values()));  // This will return max value in the HashMap
	        for (Entry<String, Integer> entry : rec.entrySet()) {  // Iterate through HashMap
	        	total=total+entry.getValue();
	            if (entry.getValue()==maxValueInMap) {
	                System.out.println("Student with highest marks "+entry.getValue()+" is "+entry.getKey());     // Print the key with max value
	            }
	        }
	        //System.out.println(total+"  "+c);
	        double avg=total/(double)c;
	        System.out.println("Average marks="+avg);
			//String key = Collections.max(rec.entrySet(), Map.Entry.comparingByValue()).getKey();
			//System.out.println(key);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
