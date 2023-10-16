package generictest;

public class StackMain {

	public static void main(String[] args) {
		MyStack<Integer,String> d1=new MyStack<Integer,String>(15,"manju");
		  int a=d1.getObj1();
		  System.out.println(a);
		
		  String str=d1.getObj2();
		  System.out.println(str);
		

	}

}
