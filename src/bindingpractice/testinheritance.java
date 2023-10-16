package bindingpractice;
import java.util.Scanner;
public class testinheritance {
                             //Employee e1=new Developer();
                            //Employee e1=new SalePerson();
                             //Employee e1=new Manager();
    public static void calculate(Employee e1)
    {
       
        System.out.println(e1.calculateSal()); //can access common method only
       
        //System.out.println("commission="+e1.calculateCommission()); //cannot access special method of child class
         
       
       
        //RTTI-Run Time Type Identification
        //identify type present in Employee reference
       
     if(e1 instanceof salesman)
       {
    	 salesman s1;
         
           //2.assign parent class ref(employee) to child class ref
                    //using downcasting
       	s1=(salesman)e1;  //->downcasting
           
         System.out.println("commission="+s1.calculatecommission()); //cannot access special method of child class
       }
        if(e1 instanceof Developer)
      {
           Developer d1;
         
          d1=(Developer)e1; //downcasting
          System.out.println("devloper project="+ d1.calculateProjectAmt());
    }
//        if(e1 instanceof Manager)
//        {
//            Manager s1;
//           
//            //2.assign parent class ref(employee) to child class ref
//                     //using downcasting
//            s1=(Manager)e1;  //->downcasting
//           
//            System.out.println("commission="+s1.calculateWork()); //cannot access special method of child class
//        }
   
       
    }
   
    public static void main(String[] args) {
       
        int ch;
       
        System.out.println("enter any no");
        Scanner sc=new Scanner(System.in);
        ch=sc.nextInt();   //2
       
        switch(ch)
        {
           case 1: calculate(new salesman());
             break;
           case 2: calculate(new Developer());
             break;
//           case 3: calculate(new Manager());
//             break;
        }
    }

}

