package interfacemethod;

public class TestRemote {

	public static void main(String[] args) {
		RemoteDevice rd = new TV();
		rd.switchOn();
		rd.switchOff();
		
		RemoteDevice rd1 = new DVDPlayer();
		rd1.switchOn();
		rd1.switchOff();

	}

}
