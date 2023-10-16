package collectionsearch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Demo6 {
	  public static void dispStudent(ArrayList l1)
	  {
			 System.out.println("display data of student using iterator interface");
			 
			 Iterator i1=l1.iterator();
			 while(i1.hasNext())
			 {
				 System.out.println(i1.next());
			 }
	 }

	public static void searchStudent(ArrayList l1)
	{
	   System.out.println("enter roll number to search record");
	   boolean flag=false;
	   
	  Scanner sc=new Scanner(System.in);
	  int no=sc.nextInt();  //102  //105
	  
	  for( Object ob :l1)
	  {
		  //downcasting 
		  Student s1=(Student)ob;       //101==105 102==105  103==105  104==105
		  if(s1.sno==no) // 101==102  102==102   
		  {
			  System.out.println("reocrd found");
			  flag=true;
			  break;  
		  }
		  
	  }
		  if(flag==false)  //true==false   //false==false
		  {
			  System.out.println("reocrd not found");
		  }
		  
	  
	  
	  
	}
}
