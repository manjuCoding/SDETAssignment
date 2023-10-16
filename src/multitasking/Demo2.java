package multitasking;

public class Demo2 implements Runnable{
  
    public void run()
    {
        if(Thread.currentThread().getName().equals("aditya"))
            System.out.println("welcome aditya");
        if(Thread.currentThread().getName().equals("ashay"))
            System.out.println("Bye bye ashay");
        if(Thread.currentThread().getName().equals("Manju"))
            System.out.println("hi hello manju");
    }

    public static void main(String[] args) {
    	Runnable r1=new Demo2();
    	Runnable r2=new Demo2();
    	Runnable r3=new Demo2();
    	
    	Thread p1=new Thread(r1);
        p1.setName("aditya");
         p1.start();  //internally going to visit run() method
                       //active mode
     
         Thread p2=new Thread(r2);
        p2.setName("ashay");
         p2.start();

         Thread p3=new Thread(r3);
        p3.setName("Manju");
         p3.start();

}
}


