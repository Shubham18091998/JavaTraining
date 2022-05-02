import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DemoBufferWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter brout=null;
		try {
			brout=new BufferedWriter(new FileWriter("Test.txt",true));
			String msg="Good Morning";
			brout.newLine();
			brout.write(msg, 0, msg.length());
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				brout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
