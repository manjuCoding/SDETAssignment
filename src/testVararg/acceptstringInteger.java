package testVararg;

public class acceptstringInteger {
	 //collection/array-var arguments using elipses(...)

   public void sum (int...no)
{
	int sum=0;
	for (int n:no)
	{ 
		sum=sum+n;
	}
	System.out.println("sum of element :" +sum);
}
   public static void main(String[]args) {
	   acceptstringInteger t1= new acceptstringInteger();
	   t1.sum(15,16);
	   t1.sum(15,16,17);
	   t1.sum(15);
}
}
