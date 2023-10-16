package exceptionAssign;

 class InsufficientBalanceException extends Exception {
	
		public InsufficientBalanceException (String m)
		{
			super(m); //call super class means Exception class internally
		}
	}



