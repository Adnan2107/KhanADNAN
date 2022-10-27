import java.io.File;
import java.io.IOException;

public class ListOfAllDirectory {

	public static void main(String[] args) throws IOException {

				File f=new File("D:\\ADNAN FOLDER"); 

		       System.out.println("file is writable: "+f.canWrite()); 
		       System.out.println("file is readable: "+f.canRead()); 
			   System.out.println("file length is: "+f.length()); 
				System.out.println("File can execute:"+ f.canExecute());
				System.out.println("to get file path of all files:"+ f.list());   

				String[] fileList=f.list(); 
			       for(String name:fileList){ 
			           System.out.println(name);  

	   }
			       
}
}


