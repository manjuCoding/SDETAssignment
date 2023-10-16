package collectiontest;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;
public class Demo4Hash {

	public static void main(String[] args) {
		 //duplicated keys-not allowed
	    //duplicate value-allowed
	    //null key-allowed
	    //null value -allowed
	    //unsroted
	    //unoredered
		HashMap h1 =new HashMap();
		h1.put(10,"Manju");
		h1.put(32,"anju");
		h1.put(15,"sanju");
		h1.put(23,"ranju");
		h1.put(14,"ajju");
		h1.put(null, null);
		h1.put(16, null);
		
System.out.println(h1);
System.out.println("retrive data="+h1.get(32));
System.out.println(h1.remove(32));
System.out.println(h1);
//duplicated keys-not allowed
//duplicate value-allowed
//null key-not allowed
//null value -not allowed
//unsroted
//unoredered
Hashtable h2 =new Hashtable();
h2.put(10,"Manju");
h2.put(12,"anju");
h2.put(32,"sanju");
h2.put(23,"ranju");
h2.put(14,"anju");
//h2.put(null, null);
//h2.put(16, null);
System.out.println(h2);

TreeMap t1=new TreeMap();

//duplicated keys-not allowed
//duplicate value-allowed
//null key- not allowed
//null value -allowed
//sorted
//unoredered

t1.put(10,"sonali");
t1.put(45,"soham");
t1.put(35,"prachi");
t1.put(30,"archana");
t1.put(17,"athrava");
h1.put(null, 11);
 System.out.println(t1);

	}

}
