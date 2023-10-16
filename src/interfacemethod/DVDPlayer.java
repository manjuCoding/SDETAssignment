package interfacemethod;

public class DVDPlayer implements RemoteDevice{

	@Override
	public void switchOn() {
		System.out.println("Switch on the DVDPlayer");
		
	}

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println("Switch Off the DVDPlayer");
	}

}
