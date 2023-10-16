package assignments;

public class Rectangle {
  int height;
  int width;
  double area;
  double  perimeter;
  public Rectangle() {
	  height=20;
	  width=10;
  }
	  public Rectangle(int height,int width) {
		  this.height=height;
		  this.width=width;
	  }
     
      public double calculatearea() {
    	   area = height *width;
    	   System.out.println("Area of rectangle is : " + area);
       return area;
      }
      public double calculateperimeter() {
    	  perimeter=2*(height+width);
    	  System.out.println("Perimeter of rectangle is : "+ perimeter);
		return perimeter;
         
          
      }
  }

