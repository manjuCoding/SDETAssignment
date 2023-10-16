package testVararg;

public class Stringvararg {
	


		 //collection/array-var arguments using elipses(...)

	   public void sum (String name,int...no)
	{
		int sum=0;
		System.out.println("student name="+name);
		for (int n:no)
		{ 
			sum=sum+n;
		}
		System.out.println("sum of element :" +sum);
	}
	   public static void main(String[]args) {
		   Stringvararg t1= new Stringvararg();
		   t1.sum("Manju",15,16);
		   t1.sum("Amit",15,16,17);
		   t1.sum("Ayushi",15);
	}
	}
