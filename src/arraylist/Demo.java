package arraylist;

public class Demo {
	
	public static int add(int a, int b) {
//		System.out.println(a+b);
		return a+b;
	}

	public static int multiplicationof(int c, int d) {
		int sum = add(c,d);
		return sum*4;
	}
	
	public static void main(String[] args) {
		
		int sum = add(2,4);
		System.out.println("Sum" +sum);
		System.out.println(multiplicationof(3,4));
		

	}

}
