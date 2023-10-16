package collectiontest;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Vector;
public class Demo1 {
public static void main(String[] args) {
	LinkedList<Integer> l1= new LinkedList<>();
	l1.add(15);
	l1.add(16);
	l1.add(17);
	l1.add(18);
	l1.addFirst(87);
	l1.addLast(98);
	System.out.println(l1);
	
	Vector<Integer> l2= new Vector<>();
	l2.add(15);
	l2.add(16);
	l2.add(17);
	l2.add(18);
	System.out.println(l2);



	Stack<Integer> s3= new Stack<>();
	s3.add(55);
	s3.add(16);
	s3.add(17);
	s3.add(18);
	System.out.println(s3);
	System.out.println("peek element"+ s3.peek()); //peek last element only not removing
    System.out.println(s3);
    System.out.println("popped element"+ s3.pop()); //remove last element
    System.out.println(s3);
}
}
