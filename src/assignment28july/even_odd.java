package assignment28july;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		num=s.nextInt();
		if (num % 2==0)
			System.out.println( num +"is even");
		else
			System.out.println( num +"is odd");

	}

}
