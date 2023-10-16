package collectionsearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {
	public static void main(String[] args) {
		 
		 Set<String> s1=new HashSet<>();
		 
		 s1.add("C");
		 s1.add("vb.net");
		 s1.add("Java");
		 
        Set<String> s2=new TreeSet<>();
		 
	       s2.add(".net");
	       s2.add("testing");
	       s2.add("php");
	       
	       
	     Set<String> s3=new TreeSet<>();
			 
	       s3.add("C");
	       s3.add("sql");
	       s3.add("RWD");
	       
	       
	     Set<String> s4=new TreeSet<>();
			 
	       s4.add("Advance Java");
	       s4.add("angular");
	       s4.add("python");
	       
	       
	   	ArrayList<Student> l1=new ArrayList<>();
		l1.add(new Student(101,"soham",s1));
		l1.add(new Student(102,"manju",s2));
		l1.add(new Student(103,"sarang",s3));
		l1.add(new Student(104,"heema",s4));
		
		 
		 
		 //display records of students using Iterator Interface
		  Demo6.dispStudent(l1);
			  
		  
		//Search records of students  
		  Demo6.searchStudent(l1);
		  
	}

}
