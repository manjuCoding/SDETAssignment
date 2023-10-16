package assigmentArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Demo14 {
	public static void main(String[] args) {
		ArrayList<String> c1=new ArrayList<String>();
		c1.add("Red");
		c1.add("Yellow");
		c1.add("Orange");
		c1.add("Violate");
		c1.set(0,"Raj");
		ArrayList<String> c2=new ArrayList<String>();
		c2.add("life");
		System.out.println(c1);
		//System.out.println(c1.get(0));
		Collections.swap(c1, 0, 2);
		System.out.println(c1);
		c1.addAll(c2);
		System.out.println(c1);
	}

}