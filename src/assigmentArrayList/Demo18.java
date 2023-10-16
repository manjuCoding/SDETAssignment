package assigmentArrayList;

import java.util.ArrayList;

public class Demo18 {
	public static void main(String[] args) {
		ArrayList<String> c1=new ArrayList<String>();
		c1.add("Red");
		c1.add("Yellow");
		c1.add("Orange");
		c1.add("Violate");
		System.out.println(c1);
		System.out.println("array list is  empty or not ="+c1.isEmpty());
		c1.removeAll(c1);
		System.out.println(c1);
		System.out.println("array list is empty or not="+c1.isEmpty());
	}
}
