
public class FileReaderThread extends Thread{
	private String filename;
	private FileReaderWordCount wc;
	public FileReaderThread(FileReaderWordCount wc,String filename,String name) {
		super(name);
		this.wc=wc;
		this.filename=filename;
	}
	
	@Override
	public void run() {
		wc.showWordCount(filename,getName());
	}

}
