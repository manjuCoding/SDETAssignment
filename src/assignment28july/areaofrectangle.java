package assignment28july;

import java.util.Scanner;

public class areaofrectangle {

	public static void main(String[] args) {
		int l,b;
		double area;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the lenght of rectangle");
       l=s.nextInt();
       System.out.println("Enter the width of rectangle");
       b=s.nextInt();
       area = l*b;
       System.out.println("Area of rectangle:"+area);
	}

}
