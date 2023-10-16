package exceptionAssign;

public class Account{
 int ano;
 String name;
 double balance;
 public Account(int b) {
	 balance=b;
 }
 //called method
 public void withdraw (int amt) throws InsufficientBalanceException
 {
	 if (balance-amt<1000)
		 //15000-5000<1000  10000-5000<1000  5000-4500<1000
	 throw new InsufficientBalanceException("minimum balance must be 1000");
		 balance=balance-amt;
	 System.out.println("withdraws  done=" +balance);
 }
}
