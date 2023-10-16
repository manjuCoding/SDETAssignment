package bindingtest;

public class BankMain {
	public static void main(String[]args) {
	    
	       //compile time
	         Saving s1=new Saving();
	           s1.print();

	          Fixeddeposite f1=new  Fixeddeposite();
	          f1.print();

	       
	     //run time or late/dynamic
	      Account a1=new Saving();
	           a1.print();

	      Account a11=new Fixeddeposite();
	          a11.print();

	   }

	}

