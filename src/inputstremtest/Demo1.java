package inputstremtest;

import java.io.File;
import java.io.IOException;

public class Demo1 {
public static void main(String[] args) throws IOException {
	File f1=new File ("D:\\amit8.sql");
	if (!f1.exists())
	{
		f1.createNewFile();
		System.out.println("file created successfuly ");
	}
	else
	{
		System.out.println("file found");
		System.out.println("length of content="+f1.length());
	}

	File f2=new File("D:\\notepad");   //drive->folder name
	
	  String filename[]=f2.list(); //return file name and directory present under that pathename
	
	for(String fnm:filename)
     System.out.println(fnm);
     
	}
}
