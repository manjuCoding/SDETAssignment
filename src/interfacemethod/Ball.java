package interfacemethod;

public class Ball implements Bounceable,Movable{

	@Override
	public void bounce() {
		System.out.println("Ball is bouncing");
		
	}

	@Override
	public void move() {
		System.out.println("Ball is moving");
		
	}

}
