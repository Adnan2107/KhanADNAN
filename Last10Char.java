import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Last10Char {

	public static void main(String[] args) throws  IOException {
		
		File f=new File("D:\\MyFile2.txt");

		RandomAccessFile raf=new RandomAccessFile(f,"rw");
		
		raf.seek(10);
		
		for(int i=10;i>=0;i--)
		{
			System.out.print((char)raf.readChar());
		}
		
		
		raf.close();
	}

}
	


