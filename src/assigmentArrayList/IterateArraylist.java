package assigmentArrayList;

import java.util.ArrayList;

public class IterateArraylist {
	public static void main(String[] args) {
		ArrayList<String> c1=new ArrayList<String>();
		c1.add("Red");
		c1.add("Yellow");
		c1.add("Orange");
		c1.add("Violate");
		System.out.println(c1);
		for(Object o1:c1)
		System.out.println(o1);
	}
}
