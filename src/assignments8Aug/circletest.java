package assignments;

public class circletest {

	public static void main(String[] args) {
		
		 Circle c1 = new Circle(6);
		    
		    System.out.println("The area of the circle is now " + c1.getArea());
		    System.out.println("The circumference of the circle is now " + c1.getCircumference());
		
		    c1.set_radius(9);
		    System.out.println("The area of the circle is now " + c1.getArea());
		    System.out.println("The circumference of the circle is now " + c1.getCircumference());
		
	}

}
