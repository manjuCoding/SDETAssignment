package assignment28july;

import java.util.Scanner;

public class areaoftriangle {

	public static void main(String[] args) {
	double b,h,area;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the width of triangle");
	b=s.nextDouble();
	System.out.println("Enter the height of triangle");
    h=s.nextDouble();
	
    area =(b*h)/2;
    System.out.println("Area of triangle:"+area);
	}

}
