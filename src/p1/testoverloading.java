package p1;

public class testoverloading {

	public static void main(String[] args) {
		
		overloading s1 = new overloading ();
		s1.sum(15,18);
		s1.sum(3,3);
      System.out.println(s1.sum(20.0f,5.0f));
      System.out.println(s1.sum(20.0,5.0));
	}

}
