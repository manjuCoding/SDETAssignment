package assigmentArrayList;

import java.util.ArrayList;

public class Demo13 {

	public static void main(String[] args) {
		ArrayList<String> c1=new ArrayList<String>();
		c1.add("Red");
		c1.add("Yellow");
		c1.add("Orange");
		c1.add("Violate");
		System.out.println(c1);
		
		ArrayList<String> c2=new ArrayList<String>();
		c2.add("Red");
		c2.add("Yellow");
		c2.add("Black");
		c2.add("Violate");
		System.out.println(c1.equals(c2));
		
}
}