package assignments;

public class Circle {
	
	  private int radius;
	  double area;
	  public Circle() {
		  radius=6;
	  }
	  
	  public Circle(int radius) {
		  this.radius=radius;
	  }
	  public int get_radius() {
		    return radius;
		  }
	  
	  public void set_radius(int radius) {
		  this.radius = radius;;
		  }
	  public double getArea() {
		    return Math.PI * radius* radius;
		  }
	  public double getCircumference() {
		  return 2* Math.PI * radius;
	  }
	 
}	 
	     
	    
	      
	  

