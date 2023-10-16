package assig4aug;

public class Hockyplayer extends Player {

	String type;
	public Hockyplayer(String name, int age,String type) {
		super(name, age);
		this.type=type;
	}
	public void show() {
		super.show();
		System.out.println("type: "+type);
	}

	
}
