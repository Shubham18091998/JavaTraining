import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWordCount {
	public synchronized void showWordCount(String filename,String name) {
		BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader(filename));
			String line;
			int count=0;
			while((line=br.readLine())!=null) {
				//System.out.println(count);
				System.out.println(line+" "+name);
				String word[]=line.split("[ ,/]+");
				count=count+word.length;
				
			}
			System.out.println("Number of words:"+count);
		} catch (FileNotFoundException e) {
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
