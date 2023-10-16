package object;

public class Mydate1 {

    int d,m,y;
    public Mydate1  ()
    {
        d=15;
        m=5;
        y=2023;
    }        
               
    public Mydate1(int d,int m,int y)
    {
        this.d=d;  
        this.m=m;
        this.y=y;  
    }

   
     public String toString()  //convert object data into string
      {
          return  d + ":" + m + ":" + y;
      }
   
     public boolean equals(Object  o1)//o1=new MYDate1()
      {
           //d1 is object of MyDat1 ->this keyword pointing to object of MyDate1 class
         
          //o1 is reference of Object super class
          //superclass cannot access child class(MyDate1)data member and method
         
          //solution->downcasting
    	 Mydate1 d1;
          d1=(Mydate1)o1;
         
         
          if(this.d==d1.d && this.m==d1.m && this.y==d1.y)
              return true;
          else          
             return false;
      }
     
      public static void main(String[] args) {
    	  Mydate1 d1=new Mydate1(1,5,2003);
    	  Mydate1 d2=new Mydate1(1,5,2003);
         
    	  System.out.println(d1.hashCode());
    	  System.out.println(d2.hashCode());
          if(d1==d2)//it compare reference then data
              System.out.println("data are same");
          else
              System.out.println("data are not same");
               
         
        //it compare reference(and check method is implemented  or not?
          //if it is implemented then compare each and every data and if data are same then return true
          //if not implemented return false)
          if(d1.equals(d2))
              System.out.println("data are same");
          else
              System.out.println("data are not same");     
         
    }
  
} //end of MyDate class

