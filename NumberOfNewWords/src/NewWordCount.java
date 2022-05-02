import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NewWordCount {
    public static ArrayList<String> removeDuplicates(ArrayList<String> list)
    {
        ArrayList<String> newList = new ArrayList<String>();
        for (String element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter article:");
		String article=sc.nextLine();
		String str[]=article.toLowerCase().split("[ ,;:.?!]+");
		
		/*String carticle=article.replaceAll("[,;:.?!]", "");
		carticle=carticle.toLowerCase();
		//System.out.println(carticle);
		String str[]=carticle.split(" ");*/
		
		System.out.println("Number of words "+str.length);
		ArrayList<String> wordList=new ArrayList<String>(Arrays.asList(str));
		//System.out.println(wordList);
		ArrayList<String> uniqWordList=removeDuplicates(wordList);
		System.out.println("Number of unique words "+uniqWordList.size());
		Collections.sort(uniqWordList);
		int a=0;
		for(int i=0;i<uniqWordList.size();i++) {
			a=i+1;
			System.out.println(a+"."+uniqWordList.get(i));
		}
	}
}
