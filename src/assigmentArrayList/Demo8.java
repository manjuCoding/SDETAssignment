package assigmentArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Demo8 {

	public static void main(String[] args) {
		ArrayList<String> c1=new ArrayList<String>();
		c1.add("Red");
		c1.add("Yellow");
		c1.add("Orange");
		c1.add("Violate");
		System.out.println(c1);
		Collections.sort(c1);
		System.out.println(c1);
}
}