package abstractclass;

public class Circle extends Shape{
   double radius;
   public Circle() {
	   radius=1.5;
   }
   public Circle(double r) {
	   
	   radius =r;
   }
	
	public void draw() {
		System.out.println("drawing shape circle");
		super.fillcolor();
		
	}

	
	public void area() {
		double area;
		area = 3.14*radius*radius;
		System.out.println("area of circle="+area);
	}

}
