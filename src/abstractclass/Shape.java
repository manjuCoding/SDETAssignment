package abstractclass;

public abstract  class Shape {
 String scolor;
 
 public Shape() {
	 scolor="green";
 }
 public Shape(String s) {
	 scolor=s;
 }
 public String toString () {
	 return "color="+scolor;
 }
 public void fillcolor()
 {
	 System.out.println("fill color with "+scolor);
 }
     public abstract void draw();
     public abstract void area();
}
