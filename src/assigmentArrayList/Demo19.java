package assigmentArrayList;

import java.util.ArrayList;

public class Demo19 {
	public static void main(String[] args) {
		ArrayList<String> c1=new ArrayList<String>();
		c1.add("Red");
		c1.add("Yellow");
		c1.add("Orange");
		c1.add("Violate");
		System.out.println(c1);
		c1.trimToSize();;
		System.out.println(c1);
		c1.add("asdf");
		c1.add("asdf");
		c1.add("asdf");
		c1.add("asdf");
		c1.add("asdf");c1.add("asdf");
		c1.add("asdf");
		c1.add("asdf");
		c1.add("asdf");
		c1.trimToSize();
		System.out.println(c1);
	}
}

