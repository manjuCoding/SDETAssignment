package collectiontest;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
	
		List l1=new ArrayList();
		l1.add(15);
		l1.add("sonali");
		l1.add(15.3f);
		l1.add(16.45);
		l1.add(null);
		l1.add(15);
		System.out.println(l1);
		
	System.out.println("Removed ele="+l1.remove(3));
//		System.out.println(l1);
//		
		for(Object l2:l1)
			System.out.println("l2="+l2);
		List<Integer> l2=new ArrayList<>();
		l2.add(15);
		l2.add(48);
		l2.add(74);
		l2.add(95);
//      l2.add("sonali");
//		l2.add(15.3f);
//		l2.add(16.45);
	    l2.add(null);
		System.out.println(l2);
		for(int l4:l2)
			System.out.println(l4);
		
		
		List<String>l3=new ArrayList<>();
		l3.add("soham");
		l3.add("manju");
		l3.add("adil");
		l3.add("reshma");
		l3.add("sonali");
		l3.add(null);
		System.out.println(l3);
		for(String l4:l3)
			System.out.println(l4); 
		
	//for(Object l4:l3)
		//	System.out.println(l4);  
	}
}

