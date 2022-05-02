import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader("Sample.txt"));
			String line;
			while((line=br.readLine())!=null) {              //EOF for .readLine() is null
				System.out.println(line);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
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
