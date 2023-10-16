package assigmentArrayList;

import java.util.ArrayList;

public class Demo15 {
	public static void main(String[] args) {
		ArrayList<String> c1=new ArrayList<String>();
		c1.add("Red");
		c1.add("Yellow");
		c1.add("Orange");
		c1.add("Violate");
		System.out.println(c1);
		
	
			ArrayList<String> c2=new ArrayList<String>();
			c2.add("White");
			c2.add("Pink");
			c2.add("Blue");
			c2.add("Skyblue");
			System.out.println(c2);
		c1.addAll(c2);
		System.out.println(c1);

	
	}

}

