package reflectiontest;

@FunctionalInterface
public interface A {

	public void show();
	
	public default void display() {
		System.out.println("in interface display");
		
	}
	public static void display1() {
		System.out.println("in interface display1 ");
	}
}
