package abstractclass;

public class TestAbstract {

	public static void main(String[] args) {
		Shape s1=new Circle(7.5);
		s1.fillcolor();
		s1.draw();
		s1.area();
		
		Shape s2=new Rectangle(12,5);
		s2.fillcolor();
		s2.draw();
		s2.area();
	}

}
