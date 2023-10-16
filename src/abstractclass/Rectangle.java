package abstractclass;

public class Rectangle extends Shape{
	double length,width;
	   public Rectangle() {
		   length=12;
		   width=5;
	   }
	   public Rectangle(double l,double w) {
		   
		   length=l;
		   width=w;
	   }
		
		public void draw() {
			System.out.println("drawing shape Rectangle");
			super.fillcolor();
			

		}

		
		public void area() {
			double area;
			area = length*width;
			System.out.println("area of Rectangle="+area);
		}
	}
