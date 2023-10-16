package assigmentArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Demo9 {

	public static void main(String[] args) {
		ArrayList<String> c1=new ArrayList<String>();
		c1.add("Red");
		c1.add("Yellow");
		c1.add("Orange");
		c1.add("Violate");
		System.out.println(c1);
		
			ArrayList<String> c2=new ArrayList<String>();
			c2.add("pink");
			c2.add("black");
			c2.add("white");
			c2.add("blue");
			System.out.println(c2);
			Collections.copy(c2,c1);
			System.out.println("After copy");
			System.out.println(c1);
			System.out.println(c2);
	} 
} 
