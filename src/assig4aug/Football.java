package assig4aug;

public class Football extends Player{
   String type;
	public Football(String name, int age,String type) {
		super(name, age);
		 this.type=type;
	}
	 public void show() {
		 super.show();

	     System.out.println("Player type : "+type);
	 }
}
