package multitasking;

public class Demo1 extends Thread {

	    public Demo1(String name)
	    {
	        super(name);
	    }
	   
	    public void run()
	    {
	        if(Thread.currentThread().getName().equals("aditya"))
	            System.out.println("welcome aditya");
	        if(Thread.currentThread().getName().equals("ashay"))
	            System.out.println("Bye bye ashay");
	        if(Thread.currentThread().getName().equals("manju"))
	            System.out.println("hi hello manju");
	    }

	    public static void main(String[] args) {
	       
	        Demo1 p1=new Demo1("aditya");
	         p1.start();  //internally going to visit run() method
	                       //active mode
	     
	        Demo1 p2=new Demo1("ashay");
	         p2.start();
	       
	         
	            Demo1 p3=new Demo1("manju");
	             p3.start();

	}
}
