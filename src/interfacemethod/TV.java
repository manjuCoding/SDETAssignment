package interfacemethod;

public class TV implements RemoteDevice{

	@Override
	public void switchOn() {
		System.out.println("Switch on the Tv");
		
	}

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println("Switch Off the Tv");
	}

}
