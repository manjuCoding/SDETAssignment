package checkPackage;

public class AccountDemo {
	  
		public static void main(String[] args) {
			
//			Account a1=new Account();
//			Locker l1=a1.new Locker();  //to access inner class from outside of class u need to import package
//		       l1.disLockerNo();
		       
			
			
			//access using fully qualified path without import statements
			
			Account a1=new Account();
		     Account.Locker l1=a1.new Locker(); //access using fully qualified path wihtout import statements
		     l1.disLockerNo();
			
		}

	}


