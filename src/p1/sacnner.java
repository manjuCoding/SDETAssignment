package p1;

import java.util.Scanner;
public class sacnner {

	public static void main(String[] args) {
		int a,b;
		Scanner s1 = new Scanner (System.in);
		
		System.out.println("enter first no");
		a=s1.nextInt();
		System.out.println("enter second no");
		b=s1.nextInt();
		   
		System.out.println("addition="+(a+b));
		System.out.println("sustraction="+(a-b));
		System.out.println("multiplication="+(a*b));
		System.out.println("division="+(a/b));
		
	}

}
