package p1;

		import java.util.Scanner;

		public class Arithmatic {
		     int a,b; //class variable or data member
		     double c;
		    void calculate()
		    {
		       
		        try (// Int a,b;    // local variable
				Scanner s1 = new Scanner(System.in)) {
					System.out.println("enter first no");
					   a=s1.nextInt();   //to accept integer
					   System.out.println("enter first no");
					  b=s1.nextInt();   //to accept integer
					  // c=s1.nextDouble();   //to accept integer
				}
		         
		          System.out.println("addition=" + (a+b));
		           System.out.println("substraction=" + (a-b));
		           System.out.println("division=" + (a/b));
		           System.out.println("multiplication=" + (a*b));
		    }
		   
		    void show() {
		       
		        System.out.println("end of code=" + a +" " + b);
	    }
		   
		   public static void main(String[] args) {
		       
		       Arithmatic a1=new Arithmatic();   //initialize object
		       a1.calculate();  //access method using ref
		   
		  }

	}


