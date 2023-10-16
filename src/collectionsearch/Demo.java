package collectionsearch;

import java.util.Set;

class Student
	{
		int sno;
	    String name;  
	    Set<String> subjects;


	  public Student() {
		 sno=101;
		 name="sonali";
	  }	
	   public Student(int sno,String name, Set sub)
	  {
		   this.sno=sno;
		   this.name=name;
		   subjects=sub;
	  }	
	   
	   public String toString() {
		   return sno + " " +name+ " " +subjects;
	   }
	  
	}

