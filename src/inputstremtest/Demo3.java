package inputstremtest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		 File f1=new File("D:\\sql30.sql");
		 File f2=new File("D:\\soham.sql"); 
		 
		 
	        FileInputStream fin=new FileInputStream(f1);  //reading file
	        FileOutputStream fout=new FileOutputStream(f2);  //writing data into a file
	        
	        int x;
	         while((x=fin.read())!=-1)  
	         {
	        	 fout.write(x);
	         }      
	        
	         System.out.println("file successfuly copied");
	         
	         fin.close();
	         fout.close();

	}

}

