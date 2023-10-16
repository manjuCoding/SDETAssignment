package assignment15aug;

public class Personmain {

	public static void main(String[] args) {
		Person p1=new Athlete();
		p1.eat();
		p1.exercise();
		
		Person p2=new LazyPerson();
		p2.eat();
		p2.exercise();
	}

}
