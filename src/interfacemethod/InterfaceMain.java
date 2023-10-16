package interfacemethod;

public class InterfaceMain {
	public static void main(String[] args) {
     Bounceable b1=new Ball();
     b1.bounce();
     Movable m1=new Ball();
     m1.move();
     
     Movable m2=new Car();
     m2.move();
     
}
}