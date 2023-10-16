package exceptionAssign;

public class Accountmain {
	//caller method
	public static void main(String[] args) {
	Account a1=new Account(15000);
	try {
		a1.withdraw(5000);
		a1.withdraw(5000);
		a1.withdraw(4000);
		a1.withdraw(500);
	}
	catch(InsufficientBalanceException e)
    {
        e.printStackTrace();
    }
	
	}

}
