import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoCopy {
	public static void main(String[] args) {
		FileReader fin=null;
		FileWriter fout=null;
		
		try {
			fin=new FileReader("Sample.txt");
			fout=new FileWriter("NewSample.txt");
			int ch;
			while((ch=fin.read())!=-1) {
				fout.write(ch);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
