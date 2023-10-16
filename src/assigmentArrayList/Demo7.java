package assigmentArrayList;

import java.util.ArrayList;

public class Demo7 {

	public static void main(String[] args) {
		ArrayList<String> c1=new ArrayList<String>();
		c1.add("Red");
		c1.add("Yellow");
		c1.add("Orange");
		c1.add("Violate");
		System.out.println(c1);
		if (c1.contains("Orange")) {
			System.out.println("found the element");
		}
		else
		{
			System.out.println("not found");
		}
}
}