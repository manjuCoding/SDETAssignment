package p2;

public class areaoverloading1 {
	double area;
	public void area(double r)
	{
		area=3.14*r*r;
		System.out.println("area of circle :"+ area);
	}
	 public void areaRectangle(double l, double b)
	    {
	        area=l*b;
	        System.out.println("area of rectangle:"+area);
	    }
	 public void areaTriangle (double h, double b,double l)
	    {
	        area=0.5*h*b;
	        System.out.println("area of triangle:"+area);
	    }

}
