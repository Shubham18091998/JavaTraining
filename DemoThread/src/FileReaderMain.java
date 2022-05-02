
public class FileReaderMain {

	public static void main(String[] args) {
		FileReaderWordCount wc=new FileReaderWordCount();
		FileReaderThread t1=new FileReaderThread(wc,"test.txt","t1");
		FileReaderThread t2=new FileReaderThread(wc,"test.txt","t2");
		t1.start();
		t2.start();
	}

}
