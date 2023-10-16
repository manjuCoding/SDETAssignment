package bindingtest;

public class Fixeddeposite extends Account{
		double Amt;
	    float duration;
	    public Fixeddeposite() {
	    	Amt=2000.34;
	    	duration= 3.6F;
	    }
	 public void print()
	  {
		 System.out.println("Amount:" + Amt+" Duration:" + duration);
	  }

	}
