package checkPackage;
//System class contain some static and non static data member
//so access static data member of System class in static way

import static java.lang.System.out;
public class withoutSystem {
	  public static void show() {
		  System.out.println("in method show");
		  
	  }

       public static void main(String[] args) {
	out.println("Welcome to java");
	show();
}
}

/* 
  class InputStream{

  }
 class PrintStram{
    println();
 }
  class System{
     InputStream in;
     PrintStream out;  //contained object within System class
                       //ref of OutputStram class
    
 }
 
  
 */