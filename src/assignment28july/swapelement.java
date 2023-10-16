package assignment28july;

import java.util.Scanner;

public class swapelement {

	public static void main(String[] args) {
		int a,b,t=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		a=s.nextInt();
		System.out.println("Enter second number");
		b=s.nextInt();
		t=a;
		a=b;
		b=t;
		System.out.println("No After Swapping a "+a+"and b " + b);
		

	}

}
