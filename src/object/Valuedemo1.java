package object;

public class Valuedemo1 {   
	    public static void main(String[] args) {
	         int a=10;  //primitive type
	             
	         
	         Integer b=a; //AutoBxing-coversion happening automatically from java5 onwards
	         
	         Integer c=Integer.valueOf(a); // implicitly it is working now
	         
	       Integer d=new Integer(a);  //Boxing-covert primitive type into class type
	   
	       
	       
	       //--UnBoxing
	       //->automatic coversion of wrapper type into its correspoinding primitive data type
	   
	       Integer no=new Integer(10);
	       int no2=no;
	       int no3=no.intValue();  // unboxing -covert class type into primitive type
	   
	       
	       String  s1="145";
	       String  s2="145";
	       
	       System.out.println("before converion sum="+ (s1+s2));
	       
	   int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
	       
	       System.out.println("after converion sum="+ sum);
	       
	    }

	}

