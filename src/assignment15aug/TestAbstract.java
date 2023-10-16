package assignment15aug;

public class TestAbstract {

	public static void main(String[] args) {
		Vehicle v1=new Car();
		v1.startEngine();
		v1.stopEngine();
		
		Vehicle v2=new Motorcycle();
		v2.startEngine();
		v2.stopEngine();
		
	}

}
