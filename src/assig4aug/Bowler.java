package assig4aug;

public class Bowler extends cricketer {

	    int numberOfWickets;
	    int numberOf5WicketInnings;
	public Bowler(String name, int age, String type,int numberOfWickets, int numberOf5WicketInnings) {
		super(name, age, type);
		this.numberOfWickets=numberOfWickets;
		this.numberOf5WicketInnings=numberOf5WicketInnings;
	}
     public void show() {
	super.show();
	 System.out.print(" He is also a good bowler and has taken " + numberOfWickets + " wickets. He has " + numberOf5WicketInnings + "  in his account.");
}
}
