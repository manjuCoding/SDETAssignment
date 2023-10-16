package assig4aug;

public class Batsman extends cricketer {
	int numberOfCenturies;
    int numberOfHalfCenturies;
	public Batsman(String name, int age, String type,int numberOfCenturies, int numberOfHalfCenturies) {
		super(name, age, type);
		this.numberOfCenturies=numberOfCenturies;
		this. numberOfHalfCenturies= numberOfHalfCenturies;
	}
public void show() {
	super.show();
	System.out.print(" He is a strong batsmen and made " + numberOfCenturies +  " centuries and " + numberOfHalfCenturies + " half centuries.");
}
}
